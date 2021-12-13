package com.rajni.algorithms.stacks;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyStack<E> {
    private final LinkedList<E> linkedList = new LinkedList<>();

    public void push(E string) {
        this.linkedList.add(string);
    }

    public void pop() {
        if(linkedList.size() > 0) {
            System.out.println(linkedList.get(linkedList.size() - 1));
            linkedList.remove(linkedList.size() - 1);
        } else {
            throw new EmptyStackException();
        }

    }

    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<>();

        stack.push("My");
        stack.push("name");
        stack.push("is");
        stack.push("Rajni");

        try {
            while (true) {
                stack.pop();
            }
        } catch (EmptyStackException e) {
            System.out.println("Exited from loop iteration as stack is empty now.");
        }
    }
}
