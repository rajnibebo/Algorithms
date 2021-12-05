package com.rajni.algorithms.sorting.exercise;

import java.util.Scanner;

public class MergeSortedArray {
    public static void main(String ss[]) {
        Scanner scanner = new Scanner(System.in);
        int sizeArray1 = scanner.nextInt();
        int[] sortedArray1 = getArrayInput(sizeArray1, scanner);
        int sizeArray2 = scanner.nextInt();
        int[] sortedArray2 = getArrayInput(sizeArray2, scanner);

        int[] descendingMerge = mergeBothInDescendingOrder(sortedArray1, sortedArray2);

        for (int integer: descendingMerge) {
            System.out.println(integer);
        }

    }

    static int[] mergeBothInDescendingOrder(int[] sortedArrayOne, int[] sortedArrayTwo) {
        int[] newMergedArray = new int[sortedArrayOne.length + sortedArrayTwo.length];

        int leftArrayIndex = sortedArrayOne.length - 1;
        int rightArrayIndex = sortedArrayTwo.length - 1;
        int mergeArrayIndex = 0;

        while (leftArrayIndex >= 0 && rightArrayIndex >= 0) {
            if(sortedArrayOne[leftArrayIndex] <= sortedArrayTwo[rightArrayIndex]) {
                newMergedArray[mergeArrayIndex++] = sortedArrayTwo[rightArrayIndex--];
            } else {
                newMergedArray[mergeArrayIndex++] = sortedArrayOne[leftArrayIndex--];
            }
        }

        while (leftArrayIndex >= 0) {
            newMergedArray[mergeArrayIndex++] = sortedArrayOne[leftArrayIndex--];
        }

        while (rightArrayIndex >= 0) {
            newMergedArray[mergeArrayIndex++] = sortedArrayOne[rightArrayIndex--];
        }
        return newMergedArray;
    }

    public static int[] getArrayInput(int sizeArray, Scanner scanner){

        int[] array = new int[sizeArray];

        for(int i = 0; i < sizeArray; i++)
        {
            array[i]=scanner.nextInt();
        }

        return array;
    }
}
