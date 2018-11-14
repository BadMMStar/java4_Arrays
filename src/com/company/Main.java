package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Main myObj = new Main();

        myObj.swapMaxMin();
        myObj.sortAscending();
        myObj.Average();
        myObj.sumEvenOdd();
        myObj.table3x5();
//        myObj.MaxX();
        myObj.equalsAddsStrings();
    }

    void swapMaxMin() {
        System.out.println("Task 1.");
        int n = 25;
        int arr[] = new int[n];
        Random r = new Random();

        int indexMin = 0;
        int indexMax = 0;

        System.out.println("Initial array: ");
        for (int i = 0; i < n; ++i) {
            arr[i] = r.nextInt(100);
            System.out.print(arr[i] + "\t");
            if (arr[i] > arr[indexMax])
                indexMax = i;
            else if (arr[indexMin] > arr[i])
                indexMin = i;
        }

        System.out.println("\nMax element -> " + arr[indexMax]); // answer to task 6

        int tmp = arr[indexMax];
        arr[indexMax] = arr[indexMin];
        arr[indexMin] = tmp;

        System.out.println("Array after replacing the maximum and minimum values: ");
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + "\t");
        }
    }

    void sortAscending() {
        System.out.println("\n\nTask 2.");
        int n = 25;
        int arr[] = new int[n];
        Random r = new Random();
        System.out.println("Initial array: ");
        for (int i = 0; i < n; ++i) {
            arr[i] = r.nextInt(100);
            System.out.print(arr[i] + "\t");
        }
        System.out.println("\nSorted array ascending:");
        for (int i = 0; i < n - 1; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
            System.out.print(arr[i] + "\t");
        }
    }

    void Average() {
        System.out.println("\n\nTask 3.");
        int average = 0;
        int n = 20;
        int arr[] = new int[n];
        Random r = new Random();
        System.out.println("Initial array: ");
        for (int i = 0; i < n; ++i) {
            arr[i] = r.nextInt(100);
            System.out.print(arr[i] + "\t");
            average += arr[i];
        }
        average /= n;
        System.out.println("\nThe average value -> " + average);
    }

    void sumEvenOdd() {
        System.out.println("\n\nTask 4.");
        int n = 30;
        int sumOfEven = 0;
        int sumOdd = 0;
        int arr[] = new int[n];
        Random r = new Random();
        System.out.println("Initial array: ");
        for (int i = 0; i < n; ++i) {
            arr[i] = r.nextInt(100);
            System.out.print(arr[i] + "\t");
            if (arr[i] % 2 == 0) {
                sumOfEven += arr[i];
            } else {
                sumOdd += arr[i];
            }
        }
        System.out.println("\nSum of even -> " + sumOfEven);
        System.out.println("Odd sum -> " + sumOdd);
    }

    void table3x5() {
        System.out.println("\nTask 5.");
        int arr[][] = new int[3][5];
        Random r = new Random();
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 5; ++j) {
                arr[i][j] = r.nextInt(100);
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

/*    void MaxX() {
        System.out.println("\n\nTask 6.");
        int n = 25;
        int arr[] = new int[n];
        Random r = new Random();

        int indexMax = 0;

        System.out.println("Initial array: ");
        for (int i = 0; i < n; ++i) {
            arr[i] = r.nextInt(100);
            System.out.print(arr[i] + "\t");
            if (arr[i] > arr[indexMax])
                indexMax = i;
        }

        System.out.println("\nMax element -> " + arr[indexMax]);
    }*/

    void equalsAddsStrings() {
        System.out.println("\n\nTask 7.");
        String  s1 = "Hello",
                s2 = ", Howdy ho!",
                s3 = ", What's up?",
                s4 = "Hi",
                s5 = "Hi";
        if (s4.equals(s5)) {
            System.out.print(s1 + s2);
        }else {
            System.out.print(s1 + s3);
        }
    }
}
