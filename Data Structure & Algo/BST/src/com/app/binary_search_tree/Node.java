package com.app.binary_search_tree;

public class Node {
	private int data;
	private Node left,right;
	
	public Node()
	{
		this.data=0;
		this.left=this.right=null;
	}
	public Node(int data)
	{
		this.data=data;
		this.left=this.right=null;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	
}
