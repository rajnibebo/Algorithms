package com.rajni.algorithms.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] numbers = {3,4,12,1,5,9,2,66,11};
        mergeSort(numbers, 0, numbers.length-1);
        System.out.println(Arrays.toString(numbers));
    }

    public static void mergeSort(int[] numbers, int start, int end) {
        if(start < end) {
            int mid = (start + end)/2;
            mergeSort(numbers, start, mid);
            mergeSort(numbers, mid+1, end);
            merge(numbers, start, mid, end);
        }
    }

    public static void merge(int[] array, int start, int mid, int end) {
        int leftSubArray = start;
        int rightSubArray = mid + 1;
        int mergeIndex = 0;

        int[] newMergedArray = new int[array.length];

        while (leftSubArray <= mid && rightSubArray <= end ) {
            if(array[leftSubArray] < array[rightSubArray]) {
                newMergedArray[mergeIndex++] = array[leftSubArray++];
            } else {
                newMergedArray[mergeIndex++] = array[rightSubArray++];
            }
        }

        while (leftSubArray <= mid) {
            newMergedArray[mergeIndex++] = array[leftSubArray++];
        }

        while (rightSubArray <= end) {
            newMergedArray[mergeIndex++] = array[rightSubArray++];
        }


        leftSubArray = start;
        mergeIndex = 0;
        while (leftSubArray <= end) {
            array[leftSubArray++] = newMergedArray[mergeIndex++];
        }
    }
}
