/*
 * Copyright (c) 2012. Latinus S.A.
 */

package com.mijao.poc.web.rest;

import com.mijao.poc.persistence.civil.dao.entities.SarcCasoEntity;
import org.apache.camel.CamelContext;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.cxf.jaxrs.client.WebClient;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import static org.junit.Assert.assertNotNull;

public class SarcRouteTest  {

    private ApplicationContext context = null;

    @Before
    public void before() throws Exception {
        //Load Spring *after* Cassandra starts
        context = new ClassPathXmlApplicationContext("sarc-route-test.xml");
    }

    @Test
    //@Ignore(
        //"This is not an integration test, but for some reason when run with maven its a 50% fail rate with some strange NullPointerException.  "
          //  + "Maybe a Maven/Spring bug?")
    public void testSarcRoute() throws Exception {

        CamelContext camelContext = (CamelContext) context.getBean("camel");

        MockEndpoint mock = (MockEndpoint) camelContext.getEndpoint("mock:log");

        mock.setMinimumExpectedMessageCount(1);
        WebClient client = WebClient.create("http://localhost:9999");
        SarcCasoEntity sarcCasoEntity = client.path("sarc/1").accept("application/json").get(SarcCasoEntity.class);
        assertNotNull(sarcCasoEntity);

        mock.assertIsSatisfied();
    }
}
