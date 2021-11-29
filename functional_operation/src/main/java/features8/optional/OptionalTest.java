package features8.optional;

import java.util.Optional;

public class OptionalTest {


    public static void main(String[] args) {
//        Optional<String>  optional = Optional.empty();
        Optional<String>  optional = Optional.ofNullable("Herry");
        System.out.println(optional.orElse("Hello"));
    }
}
