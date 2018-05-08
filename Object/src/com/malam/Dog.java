package com.malam;

import java.util.Objects;

public class Dog {

    private String name;
    private int age;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Dog dog = (Dog) o;
        return age == dog.age &&
                name.equals(dog.name);
    }


    public void sayHi(){
        System.out.println("waff");
    }

}
