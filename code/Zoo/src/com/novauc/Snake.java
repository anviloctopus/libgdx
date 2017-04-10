package com.novauc;

/**
 * Created by ANVIL_OCTOPUS on 2/14/17.
 */
public class Snake extends Reptile {

    public Snake() {
        this.name = "Snake";
    }


    @Override
    public void makeSound() {
        System.out.println("Sssssss!");
    }
}