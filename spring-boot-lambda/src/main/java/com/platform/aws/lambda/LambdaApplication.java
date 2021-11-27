package com.platform.aws.lambda;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.function.context.FunctionalSpringApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LambdaApplication {
    public static void main(String[] args) {
        FunctionalSpringApplication.run(LambdaApplication.class, args);
    }

//    @Bean
//    public ExampleFunction exampleFunction() {
//        return new ExampleFunction();
//    }
//
//    @Bean
//    public ExampleConsumer exampleConsumer() {
//        return new ExampleConsumer();
//    }
//
//    @Bean
//    public ExampleSupplier exampleSupplier() {
//        return new ExampleSupplier();
//    }
}
