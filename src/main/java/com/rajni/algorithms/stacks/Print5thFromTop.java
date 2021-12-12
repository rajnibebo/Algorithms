package com.rajni.algorithms.stacks;

import java.util.Scanner;
import java.util.Stack;

public class Print5thFromTop {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        printFifthElementFromEnd(stack);
    }

    // Method to print the fifth element from the top of the stack
    static void printFifthElementFromEnd(Stack<Integer> stack) {
        // Write your code here
        if(stack.size() < 5) {
            System.out.println("There are not enough elements in the stack");
        } else {
            System.out.println(stack.elementAt(stack.size() - 5));
        }
    }

    // Method to print the fifth element from the bottom of the stack
    static void printFifthElementFromStart(Stack<Integer> stack) {
        // Write your code here
        if(stack.size() < 5) {
            System.out.println("There are not enough elements in the stack");
        } else {
            System.out.println(stack.elementAt(4));
        }
    }
}
