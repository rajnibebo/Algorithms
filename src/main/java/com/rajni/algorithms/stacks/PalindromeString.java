package com.rajni.algorithms.stacks;

import java.util.Stack;

public class PalindromeString {
    public static void main(String[] args) {
        String s = "MALAYALAM";

        StringBuilder reversedString = new StringBuilder();

        Stack<Character> originalStack = new Stack<>();
        for (char ch : s.toCharArray()) {
            originalStack.push(ch);
        }

        while (!originalStack.empty()) {
            reversedString.append(originalStack.pop());

        }

        if(reversedString.toString().equals(s)) {
            System.out.println("The given input is a palindrome.");
        } else {
            System.out.println("The given input is not a palindrome.");
        }




    }
}
