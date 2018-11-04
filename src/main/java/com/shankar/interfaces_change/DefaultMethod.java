package com.shankar.interfaces_change;

/**
 * Default method can be used from java8 onwards which comes with declaration and will be used if
 * not overridden in the the child class
 */
public class DefaultMethod implements demo {

    public void m2() {
        System.out.println("This is my own implementation");
    }

    public static void main(String[] args) {
        demo d = new DefaultMethod();
        d.m2();
        d.m1();
    }
}

interface demo {
    default void m1() {
        System.out.println("This is default");
    }

    default void m2() {
        System.out.println("This is default second");
    }
}
