package com.rajni.algorithms.sorting.exercise;

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.TreeSet;

public class UnsortedArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n1 = s.nextInt();
        int[] array1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            array1[i] = s.nextInt();
        }

        int n2 = s.nextInt();
        int[] array2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            array2[i] = s.nextInt();
        }

        // write your code here
        int wrongIndex = -1;
        int previousElement = -1;
        int nextElement = -1;
        // first and last index values will never be unsorted.
        for (int i = 2 ; i < array1.length - 1; i++) {
            if(array1[i - 1] > array1[i]) {
                wrongIndex = i;
                nextElement = array1[i + 1];
                previousElement = array1[i - 1];
                break;
            }
        }

        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 1 ; i < array2.length; i++) {
            int currentValue = array2[i];
            if(currentValue <= nextElement && currentValue >= previousElement) {
                treeSet.add(currentValue);
            }
        }

        try {
            int maxElement = treeSet.last();
            if(maxElement <= nextElement && maxElement >= previousElement) {
                array1[wrongIndex] = maxElement;
                System.out.println(maxElement);
            } else {
                System.out.println("Not Possible");
            }
        } catch (NoSuchElementException e) {
            System.out.println("Not Possible");
        }

    }
}
