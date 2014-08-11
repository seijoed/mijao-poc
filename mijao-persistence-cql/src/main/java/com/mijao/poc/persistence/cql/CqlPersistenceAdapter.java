package com.mijao.poc.persistence.cql;

import java.util.ArrayList;
import java.util.List;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;
import com.datastax.driver.core.policies.ConstantReconnectionPolicy;
import com.datastax.driver.core.policies.DowngradingConsistencyRetryPolicy;
import com.mijao.poc.persistence.AbstractPersistence;
import com.savoirtech.hecate.cql3.dao.PojoDao;
import com.savoirtech.hecate.cql3.dao.PojoDaoFactory;
import com.savoirtech.hecate.cql3.dao.def.DefaultPojoDaoFactory;
import com.savoirtech.hecate.cql3.persistence.PojoQuery;
import com.savoirtech.hecate.cql3.persistence.PojoQueryResult;
import com.savoirtech.hecate.cql3.persistence.def.DefaultPersistenceContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class CqlPersistenceAdapter extends AbstractPersistence implements CrudPersistence {
    protected Logger logger = LoggerFactory.getLogger(CqlPersistenceAdapter.class);
    protected Cluster cluster;

    protected String host;
    protected int port = 9042;
    protected String username;
    protected String password;
    protected String keySpace;
    protected Session session;
    protected PojoDaoFactory factory;

    /**
     * init method for bean, override and call super on this to
     * initialize dao's and other important classes.
     */
    @Override
    public void init() {
        //TODO - Authentication

        logger.debug("Creating cluster for host {} with ReconnectionPolicy", host);
        cluster = Cluster.builder()
                .addContactPoints(host)
                .withPort(getPort())
                .withRetryPolicy(DowngradingConsistencyRetryPolicy.INSTANCE)
                .withReconnectionPolicy(new ConstantReconnectionPolicy(100L))
                .build();

        logger.debug("Creating keyspace {}...", keySpace);
        cluster.newSession().execute(String.format(
            "CREATE KEYSPACE IF NOT EXISTS %s WITH replication = {'class':'SimpleStrategy', 'replication_factor':1};", keySpace));
        session = cluster.connect(keySpace);
        logger.debug("Keyspace {} created successfully.", keySpace);
        factory = new DefaultPojoDaoFactory(session);
    }

    //Basic crud methods.

    @Override
    public <T> T crudUpdate(Object payload, Class instanceClazz) {
        return crudUpdate(payload, instanceClazz, null);
    }

    @Override
    public <T> T crudUpdate(Object payload, Class instanceClazz, String tableName) {
        PojoDao dao = getDao(instanceClazz, tableName);

        dao.save(payload);
        return (T) payload;
    }

    @Override
    public <T> T crudRead(String id, Class instanceClazz) {
        return crudRead(id, instanceClazz, null);
    }

    @Override
    public <T> T crudRead(String id, Class instanceClazz, String tableName) {
        PojoDao dao = getDao(instanceClazz, tableName);
        return (T) dao.findByKey(id);
    }

    @Override
    public void crudDelete(String id, Class instanceClazz) {
        crudDelete(id, instanceClazz, null);
    }

    @Override
    public void crudDelete(String id, Class instanceClazz, String tableName) {
        PojoDao dao = getDao(instanceClazz, tableName);
        dao.delete(id);
    }

    @Override
    public <T> List<T> crudList(Class instanceClazz) {
        return crudList(instanceClazz, null);
    }

    @Override
    public <T> List<T> crudList(Class instanceClazz, String tableName) {

        DefaultPersistenceContext context = new DefaultPersistenceContext(session);

        PojoQuery query;
        if (tableName == null) {
            query = context.find(instanceClazz).build();
        }
        else {
            query = context.find(instanceClazz, tableName).build();
        }


        PojoQueryResult result = query.execute();

        return result.list();
    }

    @Override
    public <T> List<T> crudCollection(List<String> coll, Class instanceClazz) {
        return crudCollection(coll, instanceClazz, null);
    }

    @Override
    public <T> List<T> crudCollection(List<String> coll, Class instanceClazz, String tableName) {
        logger.debug("Find " + coll);
        List list = new ArrayList();

        for (String id : coll) {
            T ob = crudRead(id, instanceClazz, tableName);

            if (ob != null) {
                list.add(ob);
            }
        }

        return list;
    }

    public int getPort() {

        return port;
    }

    protected PojoDao getDao(Class instanceClazz,String tablename) {
        PojoDao retVal = null;
        if (tablename == null) {
             retVal = factory.createPojoDao(instanceClazz);
        }
        else {
            retVal = factory.createPojoDao(instanceClazz,tablename);
        }

        return retVal;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setKeySpace(String keySpace) {
        this.keySpace = keySpace;
    }
}
