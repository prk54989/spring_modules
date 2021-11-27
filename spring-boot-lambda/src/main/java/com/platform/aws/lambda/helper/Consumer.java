package com.platform.aws.lambda.helper;

import com.platform.aws.lambda.model.MyPojo;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component
class ExampleConsumer implements Consumer<MyPojo> {

    @Override
    public void accept(MyPojo myPojo) {
        System.out.println("Received: " + myPojo.getExampleField());
    }
}
