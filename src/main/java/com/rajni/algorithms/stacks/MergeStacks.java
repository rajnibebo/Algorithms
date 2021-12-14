package com.rajni.algorithms.stacks;

import java.util.Stack;

public class MergeStacks {

    public static void main(String[] args) {
        Stack<Integer> stackOne = new Stack<>();
        stackOne.push(9);
        stackOne.push(10);
        stackOne.push(11);
        stackOne.push(12);
        stackOne.push(13);
        stackOne.push(14);
        stackOne.push(15);stackOne.push(21);
        stackOne.push(23);

        Stack<Integer> stackTwo = new Stack<>();
        stackTwo.push(1);
        stackTwo.push(20);
        stackTwo.push(30);
        stackTwo.push(40);
        stackTwo.push(50);

        Stack<Integer> mergedStack = mergeStacks(stackOne, stackTwo);

        while(!mergedStack.empty()) {
            System.out.println(mergedStack.pop());
        }

        Stack<Character> stack=new Stack<>();
        String inputString="(a+((b+c))))+a";

        for(int k=1;k<inputString.length()-1;k++) {
            stack.push(inputString.charAt(k+1));
            if(inputString.charAt(k+1)==')'&& !stack.isEmpty())
                stack.pop();
            if(inputString.charAt(k-1)=='(' && !stack.isEmpty())
                stack.pop();
        }
        while (!stack.isEmpty()){
            System.out.print(stack.peek());
            stack.pop();
        }
    }

    // Both the stacks are sorted.
    static Stack<Integer> mergeStacks(Stack<Integer> stack1, Stack<Integer> stack2) {
        Stack<Integer> mergedStack = new Stack<>();


        while (!(stack1.isEmpty() || stack2.isEmpty())) {
            if(stack1.peek() > stack2.peek()) {
                mergedStack.push(stack1.pop());
            } else {
                mergedStack.push(stack2.pop());
            }
        }

        while (!stack1.isEmpty()) {
            mergedStack.push(stack1.pop());
        }

        while (!stack2.isEmpty()) {
            mergedStack.push(stack2.pop());
        }
        return mergedStack;
    }


}
