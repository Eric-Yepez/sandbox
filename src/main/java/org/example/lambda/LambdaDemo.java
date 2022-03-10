package org.example.lambda;

import java.util.function.*;

public class LambdaDemo {

    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Hello Lambda";

        Consumer<String> consumer = System.out::println;

        Predicate<String> predicate = x -> x.startsWith("a");

        Function<Integer, Integer> function = x -> {
            x = x + 5;
            return x *2;
        };
    }
}
