package com.mijao.poc.web.rest;

import java.util.concurrent.CountDownLatch;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;
import com.datastax.driver.core.policies.ConstantReconnectionPolicy;
import com.datastax.driver.core.policies.DowngradingConsistencyRetryPolicy;
import com.savoirtech.hecate.cql3.dao.PojoDao;
import com.savoirtech.hecate.cql3.dao.PojoDaoFactory;
import com.savoirtech.hecate.cql3.dao.def.DefaultPojoDaoFactory;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.cassandraunit.utils.EmbeddedCassandraServerHelper;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MinaTextCodecTest extends CamelTestSupport {

    protected Logger logger = LoggerFactory.getLogger(MinaTextCodecTest.class);
    protected Cluster cluster;

    protected String host;
    protected int port = 9142;
    protected String username;
    protected String password;
    protected String keySpace = "mijao";
    protected Session session;
    protected PojoDaoFactory factory;

    /**
     * init method for bean, override and call super on this to
     * initialize dao's and other important classes.
     */

    final CountDownLatch latch = new CountDownLatch(100000);

    @Test
    public void testSendTextlineText() throws Exception {

        // START SNIPPET: e2
        MockEndpoint mock = getMockEndpoint("mock:result");
        mock.expectedMessageCount(10000);

        for (int i = 0;i < 10000;i++) {

            template.sendBody("mina2:tcp://localhost:5000?textline=true&sync=true", "A" + i + ":B" + i + ":C" + i);
        }

        latch.wait(50000l);

        // END SNIPPET: e2
    }

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {

        EmbeddedCassandraServerHelper.startEmbeddedCassandra();

        logger.debug("Creating cluster for host {} with ReconnectionPolicy", host);
        cluster = Cluster.builder().addContactPoints(host).withPort(port).withRetryPolicy(DowngradingConsistencyRetryPolicy.INSTANCE)
                         .withReconnectionPolicy(new ConstantReconnectionPolicy(100L)).build();

        logger.debug("Creating keyspace {}...", keySpace);
        cluster.newSession().execute(String.format(
            "CREATE KEYSPACE IF NOT EXISTS %s WITH replication = {'class':'SimpleStrategy', 'replication_factor':1};", keySpace));
        session = cluster.connect(keySpace);
        logger.debug("Keyspace {} created successfully.", keySpace);
        factory = new DefaultPojoDaoFactory(session);

        return new RouteBuilder() {
            @Override
            public void configure() throws Exception {

                final PojoDao<String, Triplet> dao = factory.createPojoDao(Triplet.class);
                from("mina2:tcp://0.0.0.0:5000?textline=true&sync=false").to("log:debug").process(new Processor() {
                    @Override
                    public void process(Exchange exchange) throws Exception {
                        String[] triplets = exchange.getIn().getBody(String.class).split(":");
                        dao.save(new Triplet(triplets[0], triplets[1], triplets[2]));
                        latch.countDown();
                    }
                });
            }
        };
    }
}
