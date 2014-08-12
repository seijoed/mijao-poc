/*
 * Copyright (c) 2012. Latinus S.A.
 */

package com.mijao.poc.web.rest;

import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import javax.ws.rs.core.Response;
import javax.xml.stream.XMLStreamWriter;

import com.mijao.poc.jaxb.JaxbEngine;
import com.mijao.poc.persistence.civil.dao.entities.SarcCasoEntity;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.codehaus.jettison.mapped.Configuration;
import org.codehaus.jettison.mapped.MappedNamespaceConvention;
import org.codehaus.jettison.mapped.MappedXMLStreamWriter;

public class JsonResourceProcessor implements Processor {

    private JaxbEngine engine;

    @Override
    public void process(Exchange exchange) throws Exception {

        Configuration config = new Configuration();
        config.setIgnoreNamespaces(true);

        if ("text/plain".equalsIgnoreCase((String) exchange.getIn().getHeader(Exchange.ACCEPT_CONTENT_TYPE)) || "application/json".equalsIgnoreCase(
            (String) exchange.getIn().getHeader(Exchange.ACCEPT_CONTENT_TYPE))) {

            MappedNamespaceConvention con = new MappedNamespaceConvention(config);

            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            XMLStreamWriter xmlStreamWriter = new MappedXMLStreamWriter(con, new OutputStreamWriter(baos, "UTF-8"));

            SarcCasoEntity cedulados = exchange.getIn().getBody(SarcCasoEntity.class);

            //Remove attributrs

            engine.marshal(cedulados, xmlStreamWriter);

            String json = baos.toString("UTF-8");
            Response r = Response.status(200).entity(json).build();
            exchange.getOut().setHeaders(exchange.getIn().getHeaders());
            exchange.getOut().setBody(r);
        }
    }

    public void setEngine(JaxbEngine engine) {
        this.engine = engine;
    }
}
