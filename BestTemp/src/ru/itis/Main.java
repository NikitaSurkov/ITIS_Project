package ru.itis;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        double ty = 0;
        double[] tm = new double[12];
        int a = 0;
        int b = 0;
        File input = new File("C:\\Users\\varon\\Desktop\\input.txt");
        Scanner scanner = new Scanner(input);
        try {
            FileInputStream fstream = new FileInputStream("C:\\Users\\varon\\Desktop\\input.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            while ((strLine = br.readLine()) != ) {

            }
        } catch (IOException e) {
            System.err.println("ERROR");
        }

    }
}
