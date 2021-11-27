package com.platform.function.api.lambda;

import java.util.function.Function;

public class TestFunction implements Function<String, String>{

    @Override
    public String apply(String t) {
        return "Serverless functional programming : example by "+t;
    }

}