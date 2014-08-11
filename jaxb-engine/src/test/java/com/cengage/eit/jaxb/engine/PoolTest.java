package com.cengage.eit.jaxb.engine;

import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import javax.xml.bind.JAXBException;

import com.cengage.eit.jaxb.models.DemoModel;

import com.mijao.poc.jaxb.JaxbEngine;
import com.mijao.poc.jaxb.JaxbEngineProvider;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertTrue;

public class PoolTest {

    private static final Logger logger = LoggerFactory.getLogger(PoolTest.class);
    private JaxbEngine provider;

    @Before
    public void setUp() {

        provider = new JaxbEngineProvider("com.cengage.eit.jaxb.models");
    }

    @Test
    public void testMarshallingAndUnmarshalling() throws JAXBException {
        DemoModel item = new DemoModel();
        StringWriter sw = new StringWriter();

        provider.marshal(item, sw);
        System.out.print(sw.toString());
        logger.debug("sw " + sw.toString());

        Reader reader = new StringReader(sw.toString());

        assertTrue(provider.unmarshal(reader) != null);

        reader = new StringReader(sw.toString());

        assertTrue(provider.unmarshal(reader) instanceof DemoModel);
    }
}
