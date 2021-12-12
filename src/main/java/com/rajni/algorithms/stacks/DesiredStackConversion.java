package com.rajni.algorithms.stacks;

import java.util.Stack;

public class DesiredStackConversion {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(14);
        stack.push(23);
        stack.pop();
        stack.push(12);


        //Write your code here. Your stack should finally look like this: [2, 45, 53, 54, 12].
        int last = stack.pop();

        stack.pop();
        stack.push(45);
        stack.push(53);
        stack.push(54);
        stack.push(last);
        System.out.print(stack);


    }
}
