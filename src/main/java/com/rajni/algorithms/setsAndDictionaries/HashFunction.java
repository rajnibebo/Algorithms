package com.rajni.algorithms.setsAndDictionaries;

import java.util.HashSet;
import java.util.Set;

public class HashFunction {
    public static void main(String[] args) {
        HashSet<Integer> keysForMod10 = new HashSet<>();
        HashSet<Integer> keysForMod100 = new HashSet<>();
        HashSet<Integer> keysForMod1000 = new HashSet<>();
        HashSet<Integer> keysForMod10000 = new HashSet<>();

        for (int i = 0 ; i < 10000; i++) {
            keysForMod10.add(i % 10);
            keysForMod100.add(i % 100);
            keysForMod1000.add(i % 1000);
            keysForMod10000.add(i % 10000);
        }

        System.out.println(keysForMod10.size());
        System.out.println(keysForMod100.size());
        System.out.println(keysForMod1000.size());
        System.out.println(keysForMod10000.size());

        Set<Integer> keysISquare = new HashSet<>();
        Set<Integer> keysICube = new HashSet<>();
        Set<Integer> keys12I = new HashSet<>();
        Set<Integer> keys11ISquare = new HashSet<>();

        for (int i = 0; i< 100; i++) {
            keysISquare.add((i*i) % 10);
            keysICube.add((i*i*i) % 10);
            keys12I.add((12 * i) % 10);
            keys11ISquare.add((11*i*i) % 10);
        }

        System.out.println(keysISquare.size());
        System.out.println(keysICube.size());
        System.out.println(keys12I.size());
        System.out.println(keys11ISquare.size());

    }
}
