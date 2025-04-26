package com.blind75needcode.tree;

import com.sun.source.tree.BinaryTree;
import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class InvertBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);



        System.out.println("After");
        invertBinaryTree(root);

        List<Integer> result = new ArrayList<>();
        preorderTraversal(root, result);
        System.out.println(result);

    }

    public static TreeNode invertBinaryTree(TreeNode root) {

        //breaking condition
        if (root == null) {
            return null;
        }

        //Swap left to right

        TreeNode temp = new TreeNode();
        temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertBinaryTree(root.left);
        invertBinaryTree(root.right);

        return root;

    }

    // Preorder traversal: root -> left -> right
    public static void preorderTraversal(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        result.add(root.val);
        preorderTraversal(root.left, result);
        preorderTraversal(root.right, result);
    }
}
