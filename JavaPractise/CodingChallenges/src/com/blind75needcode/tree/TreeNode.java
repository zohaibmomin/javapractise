package com.blind75needcode.tree;

public class TreeNode {
    TreeNode left;
    TreeNode right;
    int val;

    public TreeNode() {
        //default constructor
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(TreeNode left, TreeNode right, int val) {
        this.left = left;
        this.right = right;
        this.val = val;
    }
}
