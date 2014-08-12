package com.mijao.poc.web.rest;

import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLStreamWriter;

import com.mijao.poc.jaxb.JaxbEngine;
import com.mijao.poc.jaxb.JaxbEngineProvider;
import com.mijao.poc.persistence.civil.dao.entities.SarcCasoEntity;
import org.codehaus.jettison.mapped.Configuration;
import org.codehaus.jettison.mapped.MappedNamespaceConvention;
import org.codehaus.jettison.mapped.MappedXMLStreamWriter;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class JsonConversionTest {

    @Test
    public void testConvertSchema() throws UnsupportedEncodingException {

        Configuration config = new Configuration();

        SarcCasoEntity entity = new SarcCasoEntity();

        MappedNamespaceConvention con = new MappedNamespaceConvention(config);

        JaxbEngine engine = new JaxbEngineProvider("com.mijao.poc.persistence.civil.dao.entities");



        StringWriter sw = new StringWriter();

        XMLStreamWriter xmlStreamWriter = new MappedXMLStreamWriter(con, sw);

        try {
            engine.marshal(entity, xmlStreamWriter);
        } catch (JAXBException e) {
            e.printStackTrace();  //TODO
        }



        assertEquals("{\"SarcCaso\":{\"id_caso\":0}}", sw.toString());
        System.out.println("Schema " + sw.toString());
    }
}
