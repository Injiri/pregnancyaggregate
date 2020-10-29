package com.hackathon.sailors.models;


import java.util.ArrayList;

public class User {

    private int id;
    private String name;
    private String email;
    private String password;
    private ArrayList<String> linkCus;
    public User() {
    }

    public User(String name, String password, ArrayList<String> linkCus) {
        this.name = name;
        this.password = password;
        this.linkCus = linkCus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<String> getLinkCus() {
        return linkCus;
    }

    public void setLinkCus(ArrayList<String> linkCus) {
        this.linkCus = linkCus;
    }
}
