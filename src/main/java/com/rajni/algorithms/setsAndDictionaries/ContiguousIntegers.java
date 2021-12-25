package com.rajni.algorithms.setsAndDictionaries;

import java.util.Arrays;
import java.util.HashSet;

public class ContiguousIntegers {
    public static void main(String[] args) {
        System.out.println(checkContiguousIntegersBruteForce(new int[] {4, 5, 8, 9, 7, 6, 7, 3, 3}));
        System.out.println(checkContiguousIntegersBruteForce(new int[] {4, 5, 8, 9, 6, 3, 3}));

        System.out.println(checkContiguousIntegers(new int[] {4, 5, 8, 9, 7, 6, 7, 3, 3}));
        System.out.println(checkContiguousIntegers(new int[] {4, 5, 8, 9, 6, 3, 3}));
    }

    static boolean checkContiguousIntegersBruteForce(int[] array) {
        // Sort the array
        Arrays.sort(array);
        boolean exists = true;

        for (int i = 1; i < array.length; i++) {
            int previous = array[i - 1];
            int current = array[i];
            int difference = Math.abs(current - previous);
            if (difference > 1) {
                exists = false;
                break;
            }
        }
        return exists;
    }

    static boolean checkContiguousIntegers(int[] array) {
        HashSet<Integer> allInts = new HashSet<>();
        for (int j : array) {
            allInts.add(j);
        }

        int count = 0;
        if(array.length > 1) {
            int lesserThanFirst = array[0];
            int greaterThanFirst = array[0] + 1;
            while (allInts.contains(lesserThanFirst)) {
                count++;
                lesserThanFirst--;
            }
            while (allInts.contains(greaterThanFirst)) {
                count++;
                greaterThanFirst++;
            }
            return count == allInts.size();
        }
        return true;
    }
}
