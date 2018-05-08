package com.malam;

public class Student {

    private Book book;

    public Student(Book book){
        this.book = book;
    }

    public Book getBook() {
        return new Book(book);
    }

    @Override
    public String toString() {
       return "student a: " + super.toString();
    }
}
