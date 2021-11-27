package com.platform.aws.lambda.helper;

import com.platform.aws.lambda.model.MyPojo;
import org.springframework.stereotype.Component;

import java.util.function.Supplier;

@Component
public class ExampleSupplier implements Supplier<MyPojo> {

    @Override
    public MyPojo get() {
        return new MyPojo("Example Data");
    }
}