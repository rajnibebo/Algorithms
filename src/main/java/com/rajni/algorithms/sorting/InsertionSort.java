package com.rajni.algorithms.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
      //  insertionSortInDecreasingOrder(new int[] {99,88,77,66,55,44,3,2,1});
        insertionSortInDecreasingOrder(new int[] {11,22,33,44,55,66,77,88,99});
    }

    static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int val = array[i];
            int j = i;
            while (j >= 1 && array[j-1] > val) {
                array[j] = array[j-1];
                j--;
            }
            array[j] = val;

        }
        System.out.println("Array has been sorted");
        System.out.println(Arrays.toString(array));
    }

    static void insertionSortInDecreasingOrder(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int val = array[i];
            int j = i;

            while (j >= 1 && array[j-1] < val) {
                array[j] = array[j-1];
                j--;
            }
            array[j] = val;
        }
        System.out.println(Arrays.toString(array));
    }
}
