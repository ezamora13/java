package com.app.hackerranks.basic;

import java.io.*;


public class LoopsI {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        bufferedReader.close();
        for (int i = 1; i <= 10; i++) {
            System.out.println(N+"x"+i+"="+ N*i);

        }


    }
}
