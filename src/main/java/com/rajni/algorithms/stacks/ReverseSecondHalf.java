package com.rajni.algorithms.stacks;

import java.util.Scanner;
import java.util.Stack;
/*
* //Pseudocode to reverse the stack
function reverse()
   A. IF stack is not empty
        //Hold all items in function call stack until we reach the end of the stack
        1. LET i contains top element from stack.
        2. POP the top element from stack.
        3. reverse()
        // Insert all the items in function call stack one by one from the bottom to top. Each item is inserted at the bottom of the stack
        4. insertAtEnd(i)

// The following function inserts an element at the bottom of a stack
function insertAtEnd(i)
    A. IF stack is empty
           1. PUSH i to the top of the stack
    B. ELSE
         All items are held in function call stack until we reach end of the stack.
     When the stack becomes empty the item is inserted at the bottom.
           1. In varaible j we will store the value which is at the top of stack.
                   2. POP the top element from the stack
                   3. insertAtEnd(i)
                   //Push all the items which are held in function call stack once the item is inserted at the bottom
                   4. PUSH j to the top of the stack
*
*
*
* */
public class ReverseSecondHalf {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());

       // reverseLastHalf(stack.size() / 2, stack);
        System.out.println(stack);

        reverseStack(stack, 0);
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

    static void reverseStack(Stack<Integer> stack, int count) {
        if(stack.size() > 0) {
            reverseStack(stack, count);
        } else {
            int top = stack.pop();
            insert_at_bottom(top, stack);
            stack.push(top);
        }
    }
}
