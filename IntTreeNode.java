// Chapter 17 Binary Search Tree Code Along
// Author:      Aaron Neagle
// Date:        12/9/2021
// Filename:    IntTreeNode.java

// Class for storing a single node of a binary tree of ints

public class IntTreeNode {
    public int data;
    public IntTreeNode left;
    public IntTreeNode right;

    // constructs a leaf node with given data
    public IntTreeNode(int data) {
        this(data, null, null);
    }

    // constructs a branch node with given data, left subtree,
    // right subtree
    public IntTreeNode(int data, IntTreeNode left,
                       IntTreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
