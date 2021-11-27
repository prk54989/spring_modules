package functions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceImpl {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 56, 7, 9);

//        Consumer<Integer> result = (num) -> System.out.println(num);
        list.forEach((num) -> System.out.println(num));
    }

}
