package com.rajni.algorithms.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        selectionSort(new int[] {22,33,11,9,8,5,7,1});
    }

    static void selectionSort(int[] array) {
        for (int i = 0 ; i < array.length; i++) {
            int min = i;//array[i];
            for (int j = i+1; j < array.length; j++) {
                if(array[min] > array[j]) {
                    min = j;
                }
            }

            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }

        System.out.println(Arrays.toString(array));
    }
}
