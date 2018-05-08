package com.malam;

import java.io.IOException;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {

        try {
            Socket socket = new Socket("localhost", 12345);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
