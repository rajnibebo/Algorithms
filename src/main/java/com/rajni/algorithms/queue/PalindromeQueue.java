package com.rajni.algorithms.queue;

import java.util.LinkedList;
import java.util.Queue;

public class PalindromeQueue {
    public static void main(String[] args) {
        String input = "MALAYALAM";
        Queue<Character> queue = new LinkedList<>();

        String reversedString = "";

        for (char ch : input.toCharArray()) {
            queue.add(ch);
            reversedString = ch + reversedString;
        }
        System.out.println(reversedString.equals(input));
    }
}
