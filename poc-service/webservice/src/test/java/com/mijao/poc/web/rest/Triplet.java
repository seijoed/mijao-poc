package com.mijao.poc.web.rest;

import com.savoirtech.hecate.cql3.annotations.Id;

public class Triplet {
    @Id
    private String a;
    private String b;
    private String c;

    public Triplet(String a, String b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triplet() {
    }
}
