package com.novauc;

/**
 * Created by ANVIL_OCTOPUS on 2/28/17.
 */
public class AnonymousClassExample {


    public static void main(String [] args) {

        Reptile alligator = new Reptile() {

            @Override
            public void makeSound() {
                System.out.println("Croak");

            }


        };

        alligator.name = "Alligator";

        alligator.makeSound();


    }
}
