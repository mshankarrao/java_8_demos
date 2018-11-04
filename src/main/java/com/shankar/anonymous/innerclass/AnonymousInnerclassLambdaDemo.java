package com.shankar.anonymous.innerclass;


public class AnonymousInnerclassLambdaDemo {

    public static void main(String[] args) {

        //here its nothing for anonymous inner class which can be replaced by lambda expression as shown below

        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++)
                    System.out.println("Child Thread");
            }
        };


        Runnable r1 = () -> {
                for (int i = 0; i < 10; i++)
                    System.out.println("Child Thread-2");
        };
        Thread t1 = new Thread(r1);
        t1.start();
        Thread t2 = new Thread(r);
        t2.start();
        for (int i = 0; i < 10; i++)
            System.out.println("Main thread");
    }


}
