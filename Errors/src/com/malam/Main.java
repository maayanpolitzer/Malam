package com.malam;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int[] arr = new int[10];
        //System.out.println(arr[87]);  // unchecked exception.

        System.out.println("wow...");

        wow();
    }

    public static int wow(){
        try {


            return 1;
        }catch (Exception e){
            return -1;
        }finally {
            System.out.println("finally");
        }
    }
}
