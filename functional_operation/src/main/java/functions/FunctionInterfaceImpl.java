package functions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionInterfaceImpl {

    public static void main(String[] args) {
        Function<String, Integer> function = (s) -> s.length();
        System.out.println("String Length :" + function.apply("Praveen"));

        Function<Integer, String> function1 = (number) -> {
            return (number % 2 == 0) ? "EVEN" : "ODD";
        };
        System.out.println(function1.apply(5));

        Function<String, Integer> function2 = (str) -> str.length();
        Function<Integer, Integer> function3 = (number) -> number * 2;
        Integer result = function2.andThen(function3).apply("Praveen Kumar");
        System.out.println("Result : " + result);
        List<String> list = Arrays.asList("args", "java", "python");
        Map<String, Integer> mapResult = converListToMap(list, x -> x.length());
        System.out.println("Map " + mapResult);


    }

    private static <T, R> Map<T, R> converListToMap(List<T> list, Function<T, R> func) {
        Map<T, R> map = new HashMap<>();
        for (T t : list) {
            map.put(t, func.apply(t));
        }
        return map;
    }
}
