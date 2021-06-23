package com.app.binary_search_tree;

public class TestBST {

	public static void main(String[] args) {
		BST bst=new BST();
		
		bst.insertNode(50);
		bst.insertNode(40);
		bst.insertNode(20);
		bst.insertNode(30);
		bst.insertNode(70);
		bst.insertNode(60);
		bst.insertNode(80);
		bst.insertNode(80);
		bst.insertNode(10);

		
		bst.inorder(bst.getRoot());


	}

}
