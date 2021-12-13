package com.rajni.algorithms.stacks;

import java.util.Scanner;

public class ParenthesisMatching {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String enterString = scanner.nextLine();
        int count = 0;
        for (int i = 0 ; i < enterString.length(); i++) {
            if(enterString.charAt(i) == '(') {
                count++;
            } else if(enterString.charAt(i) == ')') {
                count--;
            }
        }

        if(count == 0) {
            System.out.println("String is well formed.");
        } else {
            System.out.println("String is ill-formed.");
        }
    }

    // This method is not working correctly for )) ((, Hence this is not a correct solution.
    public static boolean match(String parens) {
        int count = 0;
        for (int i = 0 ; i < parens.length(); i++) {
            if(parens.charAt(i) == '(') {
                count++;
            } else if(parens.charAt(i) == ')') {
                count--;
            }
        }

        return count == 0;
    }
}
