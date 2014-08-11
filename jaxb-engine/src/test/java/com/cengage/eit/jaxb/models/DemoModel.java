package com.cengage.eit.jaxb.models;

import javax.xml.bind.annotation.XmlRootElement;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@XmlRootElement(name = "demo")
public class DemoModel {
    private String id = UUID.randomUUID().toString();
    private String name;
    private Map<String, String> map = new HashMap<>();

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

