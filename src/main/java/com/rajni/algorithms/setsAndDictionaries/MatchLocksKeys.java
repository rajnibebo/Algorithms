package com.rajni.algorithms.setsAndDictionaries;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MatchLocksKeys {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // get the number of keys
        int n = in.nextInt();

        char keys[] = new char[n];
        char locks[] = new char[n];

        // store all the keys to the array "keys"
        for (int i = 0; i < n; i++) {
            keys[i] = in.next(".").charAt(0);
        }
        in.nextLine();

        //store all the locks to the array "locks"
        for (int i = 0; i < n; i++) {
            locks[i] = in.next(".").charAt(0);
        }

        Map<Character, Integer> locksMap = new HashMap<>();
        for (int i = 0 ; i < locks.length; i++) {
           locksMap.put(locks[i], i);
        }

        boolean print = true;
        for (int i = 0 ; i < n; i++) {
            if(locksMap.get(keys[i]) != null) {
                locks[i] = keys[i];
            } else {
                print = false;
                System.out.println("Not possible");
                break;
            }
        }

        if(print) {
            for (int i = 0 ; i < n; i++) {
                System.out.println(keys[i] +" "+locks[i]);
            }
        }

    }
}
