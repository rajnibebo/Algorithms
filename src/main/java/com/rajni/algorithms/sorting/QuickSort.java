package com.rajni.algorithms.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {99, 88, 77, 66, 55, 44, 33, 22, 11};
        quickSort(array, 0, array.length-1);
        System.out.println(Arrays.toString(array));
    }

    static void quickSort(int[] array, int start, int end) {
        if(start < end) {
            int partitionIndex = partition(array, start, end);
            quickSort(array, 0, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, end);
        }
    }

    public static int partition(int[] ar, int start, int end) {
        int pivot = ar[end];
        int i = start;
        for (int j = start; j < end; j++) {
            if (ar[j] <= pivot) {
                swap(ar, j, i);
                i++;
            }
        }
        swap(ar, i, end);

        return i;
    }

    static  void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }
}
