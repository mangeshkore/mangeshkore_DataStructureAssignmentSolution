package com.assignment.three.ques2.main;


import com.assignment.three.ques2.model.Node;
import com.assignment.three.ques2.service.TransactionService;

/*
 * Solution for Question 2
 */
public class Transactions {
    public Node node;

    // Driver Code
    public static void main(String[] args) {
        TransactionService transactionService = new TransactionService();

        //creating tree
        Transactions tree = new Transactions();
        tree.node = new Node(50);
        tree.node.setLeft(new Node(30));
        tree.node.setRight(new Node(60));
        tree.node.getLeft().setLeft(new Node(10));
        tree.node.getLeft().setRight(new Node(40));

        //converting binary search tree to right skewed tree
        transactionService.convertBTToRightSkewed(tree.node);
        transactionService.traverseRightSkewed(TransactionService.headNode);
    }
}