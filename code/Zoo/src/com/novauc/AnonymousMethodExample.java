package com.novauc;

/**
 * Created by ANVIL_OCTOPUS on 2/28/17.
 */
public class AnonymousMethodExample {

    public static void main(String[] args) {


        sayHello();

        Runnable r2 = () -> {
            System.out.println("Hello from a lambda!");


        };

        r2.run();
    }


    static void sayHello() {
        System.out.println("Hello from a method");
    }
}
