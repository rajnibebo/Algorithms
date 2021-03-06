package com.rajni.algorithms.stacks;

import java.util.Stack;

public class JavaStackUsage {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println(stack.empty());
        stack.push(11);
        stack.push(22);
        stack.push(33);
        stack.push(44);
        stack.push(55);
        System.out.println(stack);
        System.out.println(stack.search(22));
        System.out.println(stack.search(6));
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
