package com.rajni.algorithms.setsAndDictionaries;

import jdk.jshell.execution.JdiInitiator;

import java.util.Arrays;
import java.util.HashSet;

public class PairWithGivenSum {
    public static void main(String[] args) {
        int[] array = {1, 7, 40, 8, -7, 3};
        int targetSum = 15;

        System.out.println(targetSumBruteForce(array, targetSum));
        System.out.println(targetSum(array, targetSum));

    }

    static boolean targetSumBruteForce(int[] array, int targetSum) {
        // sort the array
        Arrays.sort(array);

        int first = 0;
        int last = array.length - 1;

        int sum = 0;
        while (sum != targetSum && first < last) {
            sum = array[first] + array[last];
            if(sum == targetSum) {
                System.out.println(array[first] + " "+array[last]);
            } else if(sum < targetSum) {
                first++;
            } else {
                last--;
            }

        }
        return sum == targetSum;
    }

    static boolean targetSum(int[] array, int targetSum) {
        HashSet<Integer> hashSet = new HashSet<>();
        boolean found = false;
        for (int j : array) {
            int difference = targetSum - j;
            if (hashSet.contains(difference)) {
                found = true;
                break;
            } else {
                hashSet.add(j);
            }
        }
        return found;
    }
}
