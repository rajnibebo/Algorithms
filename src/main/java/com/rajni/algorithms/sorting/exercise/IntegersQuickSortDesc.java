package com.rajni.algorithms.sorting.exercise;

import java.util.Scanner;

public class IntegersQuickSortDesc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0 ; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        quickSort(array, 0, array.length - 1);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    static void quickSort(int[] array, int start, int end) {
        if(start < end) {
            int position = partition(array, start, end);
            quickSort(array, 0, position - 1);
            quickSort(array, position + 1, end);
        }
    }

    static int partition(int[] array, int start, int end) {
        int position = start;
        int pivotElement = array[end];

        for (int i = start; i < end; i++) {
            if(array[i] >= pivotElement) {
                swap(array, position, i);
                position++;
            }
        }

        swap(array, position, end);
        return position;
    }

    static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }
}
