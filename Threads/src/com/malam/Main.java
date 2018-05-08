package com.malam;

import static com.malam.Main.counter;

public class Main {

    public static int counter = 0;

    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(counter);
    }
}

class MyThread extends Thread {


    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++) {
            incrementCounter();
            de();
        }
    }

    public synchronized void incrementCounter() {
        counter++;
    }

    public synchronized void de() {
        counter--;
    }
}
