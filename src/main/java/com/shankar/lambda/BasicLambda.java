package com.shankar.lambda;

public class BasicLambda {

    //Lambda expression is nothing but anonymous function
    public static void main(String[] args) {


        Runnable hello = () -> System.out.println("hello");
        hello.run();

        //here lambdainoker is an interface which invokes the lambda expression
        lambdaInvoker l = () -> System.out.println("This is the demo of lambda");
        l.testLambda();

        //similar demo but with parameters
        lambdaInvoker2 l2 = (a, b) -> System.out.println("The total is " + (a + b));
        l2.add(2, 5);

        //since the lambda expression has only one have one parameter so we can remove the paranthesis
        //hence we use s instead of (s)
        lambdaInvoker3 l3 = s -> s.toUpperCase();
        System.out.println(l3.getLength("Hello"));
        System.out.println(l3.getLength("This is demo"));
    }
}


