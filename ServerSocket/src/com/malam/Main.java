package com.malam;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(12345);
            while(true){
                System.out.println("waiting...");
                Socket client = serverSocket.accept();
                System.out.println("client connected");
                new ClientThread(client).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
