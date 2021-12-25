package com.rajni.algorithms.setsAndDictionaries;

import java.util.HashMap;
import java.util.Scanner;

public class SymmetricPair {
    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);

        //number of pairs in the array
        int n = in.nextInt();
        int arr[][] = new int[n][2];

        // store the input pairs to an array "arr"
        for (int i = 0; i < n; i++) {
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
        }
        // Write your code here
        HashMap<Integer, Integer> pairMap = new HashMap<>();
        boolean found = false;
        for(int i = 0 ; i < n; i++) {
            int firstKey = arr[i][0];
            int firstValue = arr[i][1];

            if(pairMap.containsKey(firstValue)) {
                int pairValue = pairMap.get(firstValue);
                if(pairValue == firstKey ) {
                    System.out.println(firstValue +" "+ firstKey);
                    pairMap.remove(firstValue);
                    found = true;
                }
            } else {
                pairMap.put(firstKey, firstValue);
            }
        }

        if(!found) {
            System.out.println("No Symmetric pair");
        }

    }
}
