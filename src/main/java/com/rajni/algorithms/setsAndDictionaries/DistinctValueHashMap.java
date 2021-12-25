package com.rajni.algorithms.setsAndDictionaries;

import java.util.*;

public class DistinctValueHashMap {
    //Method to print distinct values
    public static void printValues(Map<Integer,String> map){
        //Write your code here

        Set<String> distinctValues = new HashSet<>(map.values());

        for (String str : distinctValues) {
            System.out.print(str+" ");
        }

    }

    public static void main(String[] x){
        Map<Integer,String> map = new LinkedHashMap<>();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int key;
        String value;
        for(int i = 1; i <= num; i++){
            key = sc.nextInt();
            value = sc.next();
            map.put(key,value);
        }
        printValues(map);
    }
}
