package com.malam;



import java.io.*;

public class Main {

    public static void main(String[] args) {

        File myFile = new File("test.txt");

        // reading using BufferedReader.
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(myFile)));
            StringBuilder sb = new StringBuilder();
            String line;
            while((line = reader.readLine()) != null){
                sb.append(line);
            }
            System.out.println(sb.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        myFile.delete();
        /*
        //reading using FileInputStream
        InputStream in = null;
        try {
            in = new FileInputStream(myFile);
            byte[] buffer = new byte[2];
            int actuallyRead = in.read(buffer);
            System.out.println(actuallyRead);
            System.out.println(new String(buffer));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(in != null){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        */

        /*
        try (   // try with resources.
                InputStream inputStream = new FileInputStream(myFile)
                ){

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        */

        /*
        try {
            if(myFile.createNewFile()){
                OutputStream out = new FileOutputStream(myFile);
                byte[] buffer = "This is the new text".getBytes();
                out.write(buffer, 2, 3);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        */

    }
}
