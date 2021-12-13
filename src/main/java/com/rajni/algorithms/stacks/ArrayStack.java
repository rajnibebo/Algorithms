package com.rajni.algorithms.stacks;

import java.util.EmptyStackException;

public class ArrayStack {
    private int[] array;
    private int capacity;
    private int top = -1;

    public ArrayStack(int capacity) {
        this.array = new int[capacity];
        this.capacity = capacity;
    }

    public void push(int number) {
        if(!isFull()) {
            array[++top] = number;
        } else {
            throw new StackOverflowError();
        }

    }

    public int pop() {
        if(!isEmpty()) {
            return array[top--];
        } else {
            throw new EmptyStackException();
        }

    }

    public boolean isFull() {
        return top == array.length -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);
        stack.push(1);
        stack.push(23);
        stack.push(14);
        stack.push(556);
        stack.push(77);
        stack.push(233);stack.push(565);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());


    }
}
