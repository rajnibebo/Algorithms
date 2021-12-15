package com.rajni.algorithms.stacks;

import java.util.Scanner;
import java.util.Stack;

public class StackApplicationForParenthesisMatching {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(match(in.nextLine()));
    }

    public static boolean match(String parens) {
        //write your code here
        int count = 0;
        Stack<Character> stack = new Stack<>();
        while (count < parens.length()) {
            char ch = parens.charAt(count++);
            if(ch == '(') {
                stack.push('(');
            } else if(ch == ')') {
                if(stack.empty()) {
                    return false;
                } else if(stack.peek() == '(') {
                    stack.pop();
                } else {
                    return false;
                }
            }
            System.out.println(stack);
        }

        return stack.empty();
    }
}
