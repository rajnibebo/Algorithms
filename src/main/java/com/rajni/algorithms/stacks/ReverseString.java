package com.rajni.algorithms.stacks;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();

        String data = scanner.nextLine();
        for (int i = 0 ; i < data.length(); i++) {
            stack.push(data.charAt(i));
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
