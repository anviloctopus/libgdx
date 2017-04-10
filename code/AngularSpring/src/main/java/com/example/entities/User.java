package com.example.entities;

import javax.persistence.*;

/**
 * Created by ANVIL_OCTOPUS on 3/17/17.
 */
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    int id;

    @Column(nullable = false)
    String username;

    @Column(nullable = false)
    String address;

//    @Column(nullable = false)
//    String login;
//
//    @Column(nullable = false)
//    String location;

    @Column(nullable = false)
    String email;


    public User(String username, String address, String email) {
        this.username = username;
        this.address = address;
        this.email = email;
    }

    public User() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}