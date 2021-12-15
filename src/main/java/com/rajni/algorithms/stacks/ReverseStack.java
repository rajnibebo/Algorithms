package com.rajni.algorithms.stacks;

import java.util.Scanner;

public class ReverseStack {
    Node topNode;
    class Node {
        char data;
        Node next;

        public Node(char data) {
            this.data = data;
            next = null;
        }
    }

    public void push(char data) {
        Node newNode = new Node(data);
        if(topNode != null) {
            newNode.next = topNode;
        }
        topNode = newNode;
    }

    public Node pop() {
        Node temp = topNode;
        if(topNode != null) {
            topNode = topNode.next;
        }
        return temp;
    }

    public void display(Node node) {
        Node temp = node;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }

    public Node reverse() {
        Node temp = topNode;
        ReverseStack stack = new ReverseStack();
        while (temp != null && temp.next != null) {
            // 1 -> next = A, A -> next 1, 1 next B
            stack.push(temp.data);
            temp = temp.next;
        }

        topNode = temp;
        while (temp != null) {
            temp.next = stack.pop();
            temp = temp.next;
        }
        //temp.next = null;

        return topNode;
    }

    public static void main(String[] args) {
        ReverseStack obj = new ReverseStack();
        Scanner in = new Scanner(System.in);
        int n = in .nextInt();
        for (int i = 0; i < n; i++) {
            obj.push( in .next().charAt(0));

        }

        obj.display(obj.topNode);
        System.out.println(" ");
        // reverse
        Node temp = obj.reverse();
        obj.display(temp);

    }
}
