package org.example.BOJ.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2438 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int num = Integer.parseInt(input);

        for (int j = 1; j<= num; j++) {
            for (int i = 1; i <= j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
