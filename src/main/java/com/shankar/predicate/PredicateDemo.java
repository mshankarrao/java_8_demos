package com.shankar.predicate;

import java.util.function.Predicate;

/**
 * creating multiple predicates to show all the functionality
 * and the methods available inside predicate interface
 */
public class PredicateDemo {

    public static void main(String[] args) {
        int[] x = {1, 7, 13, 24, 25, 16, 7, 8, 10};
        Predicate<Integer> p1 = i -> i > 10;
        Predicate<Integer> p2 = i -> i % 2 == 0;
        System.out.println("Print the number greater than 10 in the given array");
        m1(p1, x);
        System.out.println("Print the even numbers in the given array");
        m1(p2,x);
        System.out.println("Print the number less than 10 using the negate predicate");
        m1(p1.negate(),x);
        System.out.println("Print the odd numbers in the given array");
        m1(p2.negate(),x);
        System.out.println("Number greater than 10 AND even");
        m1(p1.and(p2),x);

        System.out.println("Number greater than 10 OR even");
        m1(p1.or(p2),x);

        System.out.println("Number less than 10 AND even");
        m1(p1.negate().and(p2),x);

        System.out.println("Number less than 10 AND Odd");
        m1(p1.negate().and(p2.negate()),x);
    }

    private static void m1(Predicate<Integer> p1, int[] x) {

        for (int x1 : x) {
            if (p1.test(x1)) {
                System.out.println(x1);
            }
        }
    }
}
