package com.rajni.algorithms.setsAndDictionaries;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        HashMap<Character, Integer> charMap = new LinkedHashMap<>();
        //HashSet
        String str = "abcdabdef";
        for (int i = 0 ; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(charMap.get(ch) == null) {
                charMap.put(ch, 1);
            }  else {
                //charMap.put(ch, freq+1);
                charMap.remove(ch);
            }
        }
        if(!charMap.isEmpty()) {
            for (Character chars : charMap.keySet()) {
                System.out.println(chars);
                break;
            }
        } else {
            System.out.println("-1");
        }

    }
}
