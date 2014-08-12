/*
 * Copyright (c) 2012. Latinus S.A.
 */

package com.mijao.poc.web.rest;

import java.io.StringWriter;

import com.mijao.poc.jaxb.JaxbEngine;
import com.mijao.poc.persistence.civil.dao.entities.SarcCasoEntity;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class SarcCasoMarshaller implements Processor {

    private JaxbEngine engine;

    @Override
    public void process(Exchange exchange) throws Exception {
        StringWriter writer = new StringWriter();
        if (exchange.getIn().getBody() != null) {
            SarcCasoEntity message = exchange.getIn().getBody(SarcCasoEntity.class);

            engine.marshal(message, writer);
            exchange.getIn().setBody(writer.toString());
        }
    }

    public void setEngine(JaxbEngine engine) {
        this.engine = engine;
    }
}
