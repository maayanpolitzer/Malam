package com.malam.models;

public class Question {

    private int id;
    private String name;
    private int rightAnswerId;

    public Question(int id, String name, int rightAnswerId) {
        this.id = id;
        this.name = name;
        this.rightAnswerId = rightAnswerId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getRightAnswerId() {
        return rightAnswerId;
    }
}
