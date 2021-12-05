package com.rajni.algorithms.sorting.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
    public static void quickSort(String[] array, int start, int end) {
        if(start < end) {
            int position = partition(array, start, end);
            quickSort(array, 0, position - 1);
            quickSort(array, position + 1, end);
        }
    }


    public static int partition(String[] array, int start, int end) {
        String pivotElement = array[end];
        int pivotLength = pivotElement.length();
        int position = start;

        for (int i = start; i < end; i++) {
            if(array[i].length() <= pivotLength) {
                swap(array, i, position);
                position++;
            }
        }

        swap(array, position, end);
        return position;
    }

    public static void swap(String[] array, int firstIndex, int secondIndex) {
        String temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] strArray = new String[n];
        for (int i = 0 ; i < n; i++) {
            strArray[i] = scanner.next();
        }

        quickSort(strArray, 0, strArray.length - 1);
        System.out.println(Arrays.toString(strArray));
    }
}
