package com.novauc;

/**
 * Created by ANVIL_OCTOPUS on 2/14/17.
 */
public class Animal {

    String name;

    public void makeSound() {
        System.out.println("Animal Sound!");
    }

    @Override
    public String toString() {
        return this.name;
    }

}
