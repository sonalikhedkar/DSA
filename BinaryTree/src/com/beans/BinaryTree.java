package com.beans;

public class BinaryTree {
     class Node{
    	 int data;
    	 Node left;//for left subtree
    	 Node right;//for right subtree
    	 public Node(int data) {
    		 this.data=data;
    		 left=null;
    		 right=null;
    	 }
     }
     private Node root;
     public BinaryTree() {
    	 root=null;
     }
     //method Adding data into tree
     public void insert(int data) {
    	root=addTotree(root,data);
    	 
     }
	private Node addTotree(Node root, int data) {
		//if tree is empty 
		if(root==null) {
			root=new Node(data);
			return root;
		}
		//adding left subtree if data smaller than root data
		if(data<root.data) {
			root.left=addTotree(root.left,data);
		}else {//adding into right subtree if data greater than root data
			root.right=addTotree(root.right,data);
		}
		return root;
	}
	//In order traversal of tree
	//Left subtree then root data then right subtree
	public void inorder() {
		inorderTraversal(root);
	}
	private void inorderTraversal(Node root) {
		if(root!=null) {
	   inorderTraversal(root.left);
	   System.out.print(root.data+",");
		inorderTraversal(root.right);
		}	
	}
	//Pre order traversal of tree
	//first read root data then left subtree and then right subtree
	public void preorder() {
		preorderTraversal(root);
	}
	private void preorderTraversal(Node root) {
		if(root!=null) {
			System.out.print(root.data+",");
			preorderTraversal(root.left);
			preorderTraversal(root.right);
		}
	}
	//post order traversal of tree
		//first read  data of left subtree and then right subtree and last root data 
		public void postorder() {
			postorderTraversal(root);
		}
		private void postorderTraversal(Node root) {
			if(root!=null) {
				postorderTraversal(root.left);
				postorderTraversal(root.right);
				System.out.print(root.data+",");
			}
		}
}
