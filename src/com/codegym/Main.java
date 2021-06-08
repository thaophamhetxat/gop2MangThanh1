package com.codegym;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size;
        int[] arr1;
        int[] arr2;
        int pos = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter in size:");
        size = scanner.nextInt();
        System.out.println("arr1:");
        arr1 = new int[size];
        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("enter element " + i + " :");
            arr1[i] = scanner.nextInt();
        }
        System.out.println("arr2:");
        arr2 = new int[size];
        for (int i = 0; i < arr2.length; i++) {
            System.out.printf("enter element " + i + " :");
            arr2[i] = scanner.nextInt();
        }
        int[] arr3 = new int[arr1.length + arr2.length];
        int position = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr3[position] = arr1[i];
            position++;
        }
        for (int j = 0; j < arr2.length; j++) {
            arr3[position] = arr2[j];
            position++;
        }
        System.out.println(Arrays.toString(arr3));
    }
}
