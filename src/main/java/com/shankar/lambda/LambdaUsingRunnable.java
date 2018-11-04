package com.shankar.lambda;

public class LambdaUsingRunnable {

    public static void main(String[] args) {


        //this shows running the lambda expression using the existing runnable
        // functional interface which has just one method call run
        Runnable r = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("This is thread");
            }
        };

        Thread t = new Thread(r);
        t.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("This is main thread");
        }

    }
}
