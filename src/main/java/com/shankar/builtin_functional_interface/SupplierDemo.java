package com.shankar.builtin_functional_interface;

import java.util.function.Supplier;

/**
 * this demonstrate the Supplier interface in java 8 and why it is used for
 * Supplier has just one method which is abstract and returns a type
 * it doesn't have any parameters and hence used to get something
 * <p>
 * the method has the signature
 * R get()
 */
public class SupplierDemo {

    /*

    the condition for the password is that it should be 8 characters the odd places should have alphabets and
    the even places should have only digits with special characters alphabets
     */
    public String getPassword() {

        Supplier<String> supplier = () -> {
            String password = "";
            String digitsCharacters = "1234567890@#$";
            String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            Supplier<Character> alphabetsGenerator = () -> alphabets.charAt((int) (Math.random() * 26));
            Supplier<Character> digitsAndSpecialGenerator = () -> digitsCharacters.charAt((int) (Math.random() * 13));


            for (int i = 0; i < 8; i++) {
                if (i % 2 == 0) {
                    password += alphabetsGenerator.get();
                } else
                    password += digitsAndSpecialGenerator.get();
            }

            return password;

        };
        return supplier.get();
    }


    public static void main(String[] args) {
        System.out.println(new SupplierDemo().getPassword());
    }
}
