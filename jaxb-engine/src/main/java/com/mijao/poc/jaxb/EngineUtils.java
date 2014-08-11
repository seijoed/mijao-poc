package com.mijao.poc.jaxb;

import java.io.StringWriter;
import javax.xml.bind.JAXBException;

public abstract class EngineUtils {

    public static String marshal(Object o, JaxbEngine engine) {
        StringWriter writer = new StringWriter();
        try {
            engine.marshal(o, writer);
        } catch (JAXBException e) {
            //
        }
        return writer.toString();
    }
}
