package com.malam;

public class Main {

    public static void main(String[] args) {

        int s = 1234567; // 4 bytes.
        short i = (short) s;  // 2 bytes.
        //System.out.println(i);


        float f = 4.3f;
        long d = 1234567869875435254L;

        double k = 9.0/10;
        //System.out.println(k);

        String yu = "WOW";


        if(f == 7.3){

        }else if(f != 4.4){

        }else{

        }


        switch (56){
            case 5:
            case 40:


                break;

            default:

        }


        int[] arr1 = new int[]{5,4,3,2,1,6,5,4,2};
        int[] arr2 = {5,4,3,2,1,6,5,4,2};
        int[] arr3 = new int[4];
        arr3[0] = 4;
/*
        for(int w = 0;w < arr3.length; w++){
            System.out.println(arr3[w]);
        }
*/
        for(int p : arr3){
        //    System.out.println(p);
        }


        String g = "WOW";
        wow(g);
        System.out.println(g);
    }

    public static void wow(String s){
        s.toLowerCase();
    }

}
