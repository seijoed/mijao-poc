package com.cengage.eit.jaxb.engine;


import com.cengage.eit.jaxb.models.DemoModel;
import com.mijao.poc.jaxb.JaxbEngine;
import com.mijao.poc.jaxb.JaxbEngineProvider;
import org.codehaus.jettison.json.JSONObject;
import org.codehaus.jettison.mapped.Configuration;
import org.codehaus.jettison.mapped.MappedNamespaceConvention;
import org.codehaus.jettison.mapped.MappedXMLStreamReader;
import org.codehaus.jettison.mapped.MappedXMLStreamWriter;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.util.HashMap;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class JettisonTest {

    private JaxbEngine provider;

    private static final Logger logger = LoggerFactory.getLogger(JettisonTest.class);

    @Before
    public void setUp() {
        provider = new JaxbEngineProvider("com.cengage.eit.jaxb.models");
    }

    @Test
    public void testDemoModelToJsonString() throws Exception {
        DemoModel model = new DemoModel();
        model.setId("theId");
        model.setName("name");
        model.setMap(new HashMap<String, String>(){{put("key", "value");}});



        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        XMLStreamWriter xmlStreamWriter = new MappedXMLStreamWriter(getNamespaceConfig(), new OutputStreamWriter(baos, "UTF-8"));

        provider.marshal(model, xmlStreamWriter);

        String jsonString = baos.toString("UTF-8");

        logger.info("Payload " + jsonString);

        assertThat(jsonString, is(equalTo("{\"id\":\"theId\",\"map\":{\"entry\":{\"key\":\"key\",\"value\":\"value\"}},\"name\":\"name\"}")));

    }

    @Test
    public void testDemoModelFromJson() throws Exception {
        String payload = "{\n" +
                "    demo: {\n" +
                "        \"id\": \"theId\",\n" +
                "        \"map\": {\n" +
                "            \"key\": \"value\"\n" +
                "        },\n" +
                "        \"name\": \"name\"\n" +
                "    }\n" +
                "}";

        JSONObject object = new JSONObject(payload);
        XMLStreamReader xmlStreamReader = new MappedXMLStreamReader(object, getNamespaceConfig());
        Object parsed = provider.unmarshal(xmlStreamReader);
        assertThat(parsed, is(instanceOf(DemoModel.class)));
    }

    private MappedNamespaceConvention getNamespaceConfig() {
        Configuration config = new Configuration() {{
            setIgnoreNamespaces(true);
            setDropRootElement(true);
            setIgnoreEmptyArrayValues(true);
        }};
        return new MappedNamespaceConvention(config);
    }
}
