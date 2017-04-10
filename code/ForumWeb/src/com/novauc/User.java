package com.novauc;

/**
 * Created by ANVIL_OCTOPUS on 3/2/17.
 */
public class User {
    int id;

    public User(int id, String password, String name) {
        this.id = id;
        this.password = password;
        this.name = name;
    }

    String password;
    String name;

    public User(String name) {
        this.name = name;
    }
}