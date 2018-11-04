package com.shankar.interfaces_change;

interface defaultMultiFirst {

    default void m1() {
        System.out.println("This is first");
    }
}

interface defaultMultiSecond {
    default void m1() {
        System.out.println("This is Second");
    }
}

/**
 * here the ambiquity problems come if we don't override the method as both the implemented
 * interface has the same method
 * Inside the overridden method we can call the specific method of any interface if we don't want to implement
 */
public class DefaultMethodWRTInheritance implements defaultMultiFirst, defaultMultiSecond {

    @Override
    public void m1() {
        defaultMultiSecond.super.m1();
        //defaultMultiFirst.super.m1();
    }

    public static void main(String[] args) {
        DefaultMethodWRTInheritance defaultMethodWRTInheritance = new DefaultMethodWRTInheritance();
        defaultMethodWRTInheritance.m1();
    }
}
