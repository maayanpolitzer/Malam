package com.malam;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    List list = new ArrayList();

	    list.add("wow");
	    list.add(3);
	    list.add(false);
        //System.out.println(list.get(1));

        List<Dog> list2 = new ArrayList<>();
        list2.add(new Dog(45));

        Set<String> set = new HashSet<>();
        /*
        System.out.println(set.add("first"));
        System.out.println(set.add("second"));
        System.out.println(set.add("first"));   // will not access.
        */

        Map<Integer, Dog> map = new HashMap();
        map.put(1, new Dog(1));
        map.put(2, new Dog(2));
        if(!map.containsKey(1)) {
            map.put(1, new Dog(3)); // will override the old data.
        }

        System.out.println(map);
    }
}

class Dog{

    private int id;

    public Dog(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "id=" + id +
                '}';
    }
}
