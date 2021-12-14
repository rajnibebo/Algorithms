package com.rajni.algorithms.stacks;

import java.util.Scanner;
import java.util.Stack;

public class ReverseSecondHalf {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());

        reverseLastHalf(stack.size() / 2, stack);
        System.out.println(stack);
    }

    public static void reverseLastHalf(int half, Stack<Integer> stack) {
        int tos = stack.pop();
        if(stack.size() > 0)
            reverseLastHalf(half, stack);
        if(stack.size() > half)
            insert_at_bottom(tos, stack);
        else
            stack.add(tos);
    }

    static void insert_at_bottom(int x, Stack<Integer> stack) {

        if(stack.isEmpty()) {
            stack.push(x);
        }
        else {
            int y = stack.peek();
            stack.pop();
            insert_at_bottom(x,stack);
            stack.push(y);
        }

    }
}
