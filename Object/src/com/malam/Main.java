package com.malam;

public class Main {

    public static void main(String[] args) {

        Dog d1 = new Dog();
        Dog d2 = new Dog();
//        Dog d3 = new Dog(){
//            public void sayHi(){
//                System.out.println("miu");
//            }
//        };
        Dog d3 = new F();


        Dog[] dogs = new Dog[3];
        dogs[0] = d1;
        dogs[1] = d2;
        dogs[2] = d3;

        for(Dog temp : dogs){
            wow(temp);
        }

    }

    public static void wow(Dog d){
        d.sayHi();
    }
}
