package com.rajni.algorithms.tree;

import java.util.LinkedList;
import java.util.Queue;

public class Tree<T> {
    Node root;

    public Tree() {
        this.root = null;
    }

    enum Mode {
        PRE_ORDER, IN_ORDER, POST_ORDER;
    }

    class Node {
        T data;
        Node left;
        Node right;

        public Node(T data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }


    void dfs(Node node) {
        if(node  == null) {
            return;
        }
        // Pre - order
        System.out.println(node.data);
        if(node.left != null) {
            dfs(node.left);
        }
        // In - Order
        if(node.right != null) {
            dfs(node.right);
        }
        //Post - Order
    }

    void dfs(Node node, Mode mode) {
        if(node  == null) {
            return;
        }
        if(mode == Mode.PRE_ORDER) {
            System.out.print(node.data + " ");
        }
        dfs(node.left, mode);
        if(mode == Mode.IN_ORDER) {
            System.out.print(node.data+" ");
        }
        dfs(node.right, mode);
        if(mode == Mode.POST_ORDER) {
            System.out.print(node.data+" ");
        }
    }

    void bfs(Node node) {
        int height = height(node);

        for (int i = 1; i <= height; i++) {
            printNodesAtLevel(node, i, 1);
        }
    }

    void printNodesAtLevel(Node node, int level, int currentLevel) {
        if(node == null) {
            return;
        }

        if(level == currentLevel) {
            System.out.print(node.data +" ");
        } else {
            printNodesAtLevel(node.left, level, currentLevel + 1);
            printNodesAtLevel(node.right, level, currentLevel + 1);
        }
    }

    int height(Node node) {
        if(node == null) {
            return 0;
        }

        int leftTreeHeight = height(node.left);
        int rightTreeHeight = height(node.right);

        if(leftTreeHeight < rightTreeHeight) {
            return rightTreeHeight + 1;
        } else {
            return leftTreeHeight + 1;
        }
    }

    // This is O(N^2) complexity
    Boolean isfunc(Node node) {

        int lHeight;
        int rHeight;

        if(node == null)
            return true;

        lHeight = height(node.left);
        rHeight = height(node.right);

        return Math.abs(lHeight - rHeight) <= 1 && isfunc(node.left) && isfunc(node.right);
    }

    class Height {
        int height = 0;
    }

    boolean isBalanced(Node node, Height height) {
        // An empty tree is a balanced tree
        if(node == null) {
            height.height = 0;
            return true;
        }

        Height leftHeight = new Height();
        Height rightHeight = new Height();

        boolean left = isBalanced(node.left, leftHeight);
        boolean right = isBalanced(node.right, rightHeight);

        int lh = leftHeight.height;
        int rh = rightHeight.height;

        height.height = (Math.max(lh, rh)) + 1;

        if(Math.abs(lh -rh) >= 2) {
            return false;
        }
        return left && right;
    }


    void bfsUsingQueue() {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node temp = queue.remove();
            System.out.print(temp.data + " ");

            if(temp.left != null) {
                queue.add(temp.left);
            }

            if(temp.right != null) {
                queue.add(temp.right);
            }
        }
    }

    void spiralOrder() {
        boolean leftToRightFlag = false;
        int height = height(root);
        for (int i = 1; i <= height; i++) {
            printLevel(root, i, 1, leftToRightFlag);
            leftToRightFlag = !leftToRightFlag;
        }
    }

    void printLevel(Node root, int level, int currentLevel, Boolean leftToRightFlag) {
        if(root == null) {
            return;
        }
        if (level == currentLevel) {
            System.out.print(root.data+" ");
        }

        if (leftToRightFlag) {
            printLevel(root.left, level, currentLevel + 1, leftToRightFlag);
            printLevel(root.right, level, currentLevel + 1, leftToRightFlag);
        } else {
            printLevel(root.right, level, currentLevel + 1, leftToRightFlag);
            printLevel(root.left, level, currentLevel + 1, leftToRightFlag);

        }
    }

    void mirror(Node root) {
        if(root == null) {
            return;
        }
        mirror(root.left);
        mirror(root.right);

        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
    public static void main(String[] args) {
        Tree<Integer> intsTree = new Tree<>();
        Tree<Integer>.Node rootNode = intsTree.new Node(1);

        rootNode.left = intsTree.new Node(2);
        rootNode.right = intsTree.new Node(3);
        rootNode.left.left = intsTree.new Node(4);
        rootNode.left.right = intsTree.new Node(5);
        rootNode.right.left = intsTree.new Node(6);
        rootNode.right.right = intsTree.new Node(7);

        intsTree.root = rootNode;

        System.out.println("In-Order Traversal");
        intsTree.dfs(rootNode, Mode.IN_ORDER);
        System.out.println();
        System.out.println("Pre-Order Traversal");
        intsTree.dfs(rootNode, Mode.PRE_ORDER);
        System.out.println();
        System.out.println("Post-Order Traversal");
        intsTree.dfs(rootNode, Mode.POST_ORDER);

        System.out.println(intsTree.isfunc(rootNode));
        System.out.println(intsTree.isBalanced(rootNode, intsTree.new Height()));
        intsTree.bfs(rootNode);
        System.out.println();
        intsTree.bfsUsingQueue();
        System.out.println();
       // intsTree.mirror(rootNode);
        //intsTree.bfsUsingQueue();
        intsTree.spiralOrder();
    }
}
