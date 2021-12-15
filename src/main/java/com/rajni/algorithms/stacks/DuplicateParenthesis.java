package com.rajni.algorithms.stacks;

import java.util.Stack;

public class DuplicateParenthesis {
    public static void main(String[] args) {
        String inputString = "(a+b)+(2(c*d))";
        Stack<Character> stack = new Stack<>();
        boolean duplicate = false;
        for (char ch : inputString.toCharArray()) {
            if(ch == ')') {
                char previousChar = ch;
                while (!stack.isEmpty()) {
                    char popoutChar = stack.pop();
                    if(popoutChar == '(') {
                        if(previousChar == ')' ) {
                            duplicate = true;
                        }
                        break;
                    }
                    previousChar = popoutChar;
                }
            } else {
                stack.push(ch);
            }

            if(duplicate) {
                break;
            }
        }

        if(duplicate) {
            System.out.println("Input string contains duplicate parenthesis");
        } else {
            System.out.println("Input string does not contain duplicate parenthesis");
        }
    }
}
