package com.malam;

public class Main {

    public static void main(String[] args) {
	    //Book b1 = new Book();
        //System.out.println(b1.read());

        Book.getCounter();
        final Book b2 = new Book();
        b2.setTitle("wow");
        b2.setTitle("wow2");

        String s = "sg";


        //b2 = new Book(); // ERROR.

        Student s1 = new Student(
                new Book("book1"));

        Book temp = s1.getBook();
        temp.setTitle("new title");

        //System.out.println(s1.getBook().getTitle());

        System.out.println(s1.toString());
    }
}
