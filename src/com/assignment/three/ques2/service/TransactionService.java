package com.assignment.three.ques2.service;


import com.assignment.three.ques2.model.Node;

public class TransactionService {

    public static Node prevNode = null;
    public static Node headNode = null;

    /*
     * Function to convert the binary
     * search tree into a skewed tree in
     * increasing  order
     */
    public void convertBTToRightSkewed(Node root) {

        // Base Case
        if (root == null) {
            return;
        }

        //recurse for the left
        convertBTToRightSkewed(root.getLeft());

        Node rightNode = root.getRight();


        /*
         * Condition to check if the root Node
         * of the skewed tree is not defined
         */
        if (headNode == null) {
            headNode = root;
            root.setLeft(null);
            prevNode = root;
        } else {
            prevNode.setRight(root);
            root.setLeft(null);
            prevNode = root;
        }

        // Similarly recurse for the right
        convertBTToRightSkewed(rightNode);

    }

    /*
     * Function to traverse the right
     * skewed tree using recursion
     */
    public void traverseRightSkewed(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.getData() + " ");
        traverseRightSkewed(root.getRight());
    }
}
