/*
 * Copyright (c) 2012. Latinus S.A.
 */

package com.mijao.poc.web.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.mijao.poc.persistence.civil.dao.entities.SarcCasoEntity;

@Path("/sarc")
public class CasoServiceResource {

    @GET
    @Path("/{id}")
    @Produces({"application/xml;charset=UTF-8", "application/json;charset=UTF-8"})
    public SarcCasoEntity getCaso(@PathParam("id") String id) {
        return null;
    }
}
