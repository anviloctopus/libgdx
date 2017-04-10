package com.novauc;

/**
 * Created by psubedi2020 on 2/2/17.
 */
public class Person {

    String name;
    int    age;
    boolean isAlive;
    public static String COLOR = "Green";

    public  static String getColor() {
        return Person.COLOR;
    }

    public void setColor(String color) {
        this.COLOR = "Yellow";
    }

    public Person() {

    }

    public Person(String name, int age, boolean isAlive) {
        this.name = name;
        this.age = age;
        this.isAlive = isAlive;
    }

    public Person(String name)  {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}