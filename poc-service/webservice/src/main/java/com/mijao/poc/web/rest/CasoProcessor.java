/*
 * Copyright (c) 2012. Latinus S.A.
 */

package com.mijao.poc.web.rest;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import com.mijao.poc.persistence.civil.dao.CasoDao;
import com.mijao.poc.persistence.civil.dao.entities.SarcCasoEntity;
import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.component.cxf.CxfConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CasoProcessor implements Processor {

    private static Logger LOG = LoggerFactory.getLogger(CasoProcessor.class);

    private CasoDao casoDao;

    @Override
    public void process(Exchange exchange) throws Exception {
        Message inMessage = exchange.getIn();
        LOG.debug("Message " + inMessage);
        String operationName = inMessage.getHeader(CxfConstants.OPERATION_NAME, String.class);
        LOG.debug("Operation " + operationName);
        if ("getCaso".equalsIgnoreCase(operationName)) {

            Integer id = inMessage.getBody(Integer.class);

            LOG.debug("Caso id request for " + id);

            SarcCasoEntity entity = casoDao.read(id);
            if (entity != null) {
                exchange.getIn().setBody(entity);
            } else {
                //Error handling to go here if not found in Cassandra because cneFromCassandra will be null
                //and hence 404 error should be returned
                webFault(404, "Donde esta el jefe?", exchange, true);
            }
        } else {
            webFault(404, "Unknown operation", exchange, true);
        }
    }

    private void webFault(int code, String reason, Exchange exchange, boolean stop) {
        Response r = Response.status(code).entity(reason).build();
        if (stop) {
            exchange.setProperty(Exchange.ROUTE_STOP, Boolean.TRUE);
        }
        throw new WebApplicationException(r);
    }

    public CasoDao getCasoDao() {
        return casoDao;
    }

    public void setCasoDao(CasoDao casoDao) {
        this.casoDao = casoDao;
    }
}
