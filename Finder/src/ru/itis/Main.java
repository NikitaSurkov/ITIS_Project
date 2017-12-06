package ru.itis;

import java.util.Scanner;

public class Main {
    public static int find(int []arr, int lower, int higher, int number) {
        int mid = lower + ((higher - lower)/2);
        int result = 0;
        if (arr[mid] > number) {
            higher = mid;
        }
        if (arr[mid] < number) {
            lower = mid;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 9;
        int [] arr = new int[n];
        int lower = 0;
        int higher = n-1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int number = scanner.nextInt();
        System.out.println(find(arr, lower, higher, number));
    }
}
