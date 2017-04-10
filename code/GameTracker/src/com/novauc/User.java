package com.novauc;

import java.util.ArrayList;

/**
 * Created by ANVIL_OCTOPUS on 3/1/17.
 */
public class User {
    String name;
    ArrayList<Game> games = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }
}