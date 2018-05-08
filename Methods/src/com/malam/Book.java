package com.malam;

public class Book {

    private String title;
    private int pages;
    private static int counter;
    private final int DAY;

    static {
        counter = 67;
        //DAY = 4;
    }

    Book(Book b){
        title = b.title;
        pages = b.pages;
        DAY = b.DAY;
    }

    public static int getCounter(){
        return counter;
    }

    Book(){ // available only in package
        DAY = 5;
    }

    protected Book(String title){
        this(title, 40);
        //this.title = title;
        //pages = 40;
    }

    private Book(String title, int pages){
        this.title = title;
        this.pages = pages;
        DAY = 3;
    }

    public String read(){
        return "read";
    }

    void w(int i, String s){

    }

    boolean w(String s, int i){
        return true;
    }

    int w(String f,String s, int i){
        return -3;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
