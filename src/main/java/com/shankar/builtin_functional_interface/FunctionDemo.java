package com.shankar.builtin_functional_interface;

import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {
        Function<String, String> function = s -> s.toUpperCase();

        Function<String, String> function1 = s -> s.substring(0,9);

        System.out.println(function.apply("Shankar Rao Mata"));
        System.out.println(function1.apply("Shankar Rao Mata"));

        //apply function first and then function1
        System.out.println(function.andThen(function1).apply("Shankar Rao Mata"));
        System.out.println(function.compose(function1).apply("Shankar Rao Mata"));

        Function<Integer,Integer> function2 = i->i+i;
        Function<Integer,Integer> function3 = i->i*i*i;

        System.out.println(function2.andThen(function3).apply(2));
        System.out.println(function2.compose(function3).apply(2));

    }
}
