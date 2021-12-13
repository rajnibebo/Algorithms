package com.rajni.algorithms.stacks;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class MatchingMultipleBracketsUsingStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        System.out.println(validateBrackets(string));
    }

    public static boolean validateBrackets(String str) {
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if(ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if(ch == ')' || ch == '}' || ch == ']') {
                try {
                    Character lastCharacter = stack.pop();
                    if((lastCharacter == '(' && ch != ')') || (lastCharacter == '{' && ch != '}') || (lastCharacter == '[' && ch != ']')) {
                        return false;
                    }
                } catch (EmptyStackException e) {
                    return false;
                }

            }
        }
        return stack.empty();
    }
}
