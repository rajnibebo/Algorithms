package com.rajni.algorithms.tree;

public class BinarySearchTree {

    static boolean search(Tree<Integer>.Node node, int key) {
        if(node == null) {
            return false;
        }

        if(node.data == key) {
            return true;
        }

        if(node.data < key) {
            // search in right subtree
            return search(node.right, key);
        } else {
            return search(node.left, key);
        }
    }

    static int countNodes(Tree<Integer>.Node node, int start, int end) {
        if(node == null) {
            return 0;
        }

        if(node.data <= end && node.data >= start) {
            return  1 + countNodes(node.left, start, end) + countNodes(node.right, start, end);
        } else if(node.data < start) {
            return countNodes(node.left, start, end);
        } else {
            return countNodes(node.right, start, end);
        }

    }

    static Tree<Integer>.Node insertNode(Tree<Integer>.Node node, Tree<Integer> tree, int key) {
        if(node == null) {
            return tree.new Node(key);
        }

        if (key < node.data) {
            node.left = insertNode(node.left, tree, key);
        } else if(key > node.data) {
            node.right = insertNode(node.right, tree, key);
        }
        return node;
    }

    public static void main(String[] args) {
        Tree<Integer> intsTree = new Tree<>();
        Tree<Integer>.Node rootNode = intsTree.new Node(4);

        rootNode.left = intsTree.new Node(2);
        rootNode.right = intsTree.new Node(6);
        rootNode.left.left = intsTree.new Node(1);
        rootNode.left.right = intsTree.new Node(3);
        rootNode.right.left = intsTree.new Node(5);
        rootNode.right.right = intsTree.new Node(7);

        intsTree.root = rootNode;

        System.out.println(search(rootNode, 5));

        System.out.println(countNodes(rootNode, 4, 7));
        System.out.println();
        intsTree.bfs(rootNode);

        insertNode(rootNode, intsTree, 11);
        System.out.println();
        intsTree.bfs(rootNode);


    }
}
