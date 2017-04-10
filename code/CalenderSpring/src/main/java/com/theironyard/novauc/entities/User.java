package com.theironyard.novauc.entities;

import javax.persistence.*;

/**
 * Created by ANVIL_OCTOPUS on 3/22/17.
 */
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    int id;

    @Column(nullable = false, unique = true)
    String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }
}
