package com.malam;

public class Main {

    public static void main(String[] args) {

        Season now = Season.SUMMER;
        System.out.println(now.getId());
        now.setId(44);
        Season nextYear = Season.SUMMER;
        System.out.println("new: " + nextYear.getId());

    }
}

enum Season{
    WINTER(1,"win"), SUMMER(2, "sum");

    private int id;
    private String name;

    Season(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
