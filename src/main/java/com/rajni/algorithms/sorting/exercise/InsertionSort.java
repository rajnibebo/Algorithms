package com.rajni.algorithms.sorting.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

    static void sortIncreasingOrder(String[] firstNameArray) {
        for (int i = 0 ; i < firstNameArray.length ; i++) {
            String str = firstNameArray[i];
            int j = i;
            while (j >= 1 && firstNameArray[j-1].compareTo(str) > 0) {
                firstNameArray[j] = firstNameArray[j-1];
                j--;
            }
            firstNameArray[j] = str;
        }
    }

    static void sortDecreasingOrder(String[] firstNameArray) {
        for (int i = 0 ; i < firstNameArray.length ; i++) {
            String str = firstNameArray[i];
            int j = i;
            while (j >= 1 && firstNameArray[j-1].compareTo(str) < 0) {
                firstNameArray[j] = firstNameArray[j-1];
                j--;
            }
            firstNameArray[j] = str;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstNameArray = new String[scanner.nextInt()];
        for (int i = 0 ; i < firstNameArray.length ; i++) {
            firstNameArray[i] = scanner.next();
        }
        sortIncreasingOrder(firstNameArray);
        System.out.println(Arrays.toString(firstNameArray));

        sortDecreasingOrder(firstNameArray);
        System.out.println(Arrays.toString(firstNameArray));
    }
}
