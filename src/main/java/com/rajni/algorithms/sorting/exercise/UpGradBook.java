package com.rajni.algorithms.sorting.exercise;

import java.util.Scanner;
import java.util.stream.Stream;

public class UpGradBook {
    public static void main(String[] args) {
        partBSolution();
    }
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] array = new int[size + 1];
        for (int i = 1; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 1; i < array.length ; i++ ) {
            if(i == array[i]) {
                System.out.println(i);
                break;
            }
        }
    }

    static void partBSolution() {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int keyElement = scanner.nextInt();

        int[] array = new int[size + 1];
        for (int i = 1; i < array.length ; i++) {
            array[i] = scanner.nextInt();
        }
        findEndIndex(array, keyElement);
    }

    private static void findEndIndex(int[] array, int key) {
        int endIndex = -1;
        int startIndex = 1;
        int previousIndex = -1;
        boolean found = false;
        while (true) {
            if(array[startIndex] < key) {
                previousIndex = startIndex;
                if(startIndex * 2 < array.length ) {
                    startIndex *= 2;
                } else {
                    startIndex++;
                }

            } else if(array[startIndex] == key) {
                System.out.println(startIndex);
                found = true;
                break;
            } else {
                endIndex = startIndex-1;
                break;
            }
        }

        // Apply binary search on previousIndex and endIndex
        if(! found) {
            int foundIndex = binarySearch(array, previousIndex, endIndex, key);
            if(foundIndex != -1) {
                System.out.println(foundIndex);
            } else {
                System.out.println("NOT_FOUND");
            }
        }


    }

    static int binarySearch(int[] array, int start, int end, int keyToSearch) {
        if(start < end) {
            int mid = (start + end)/2;
            if(array[mid] == keyToSearch) {
                return mid;
            } else if(array[mid] < keyToSearch) {
                return binarySearch(array, mid +1, end , keyToSearch);
            } else {
                return binarySearch(array, start, mid - 1 , keyToSearch);
            }
        }
        return -1;
    }
}
