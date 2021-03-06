package com.app.binary_search_tree;

public class BST {
	private Node root;

	public BST() {
		super();
		this.root = root;
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	public boolean insertNode(int data)
	{
		Node newnode=new Node(data);
		
		if(newnode==null)//chk for empty node
			return false;
		if(root==null)//chk for tree is empty
		{
			root=newnode;
			return true;
		}
		Node temp=root;  //create temp node for traverse
		while(true) {
			if(temp.getData()==data)//chk for dublicate
				return false;
			if(temp.getData()>data)
				{
					if(temp.getLeft()!=null)//if child present
					{
						temp=temp.getLeft();//traverse left
					}
					else {
						//if child is absent
						temp.setLeft(newnode);
						return true;
					}
				}
			else
			{
				if(temp.getRight()!=null)//if child present
				{
					temp=temp.getRight();//traverse left
				}
				else {
					//if child is absent
					temp.setRight(newnode);
					return true;
				}
				
			}
		}
		
	}
	public boolean inorder(Node temp)
	{
		if(temp==null)
			return false;
		
			inorder(temp.getLeft());
			System.out.print(temp.getData()+"   ");
			inorder(temp.getRight());
			return true;

	}
}
