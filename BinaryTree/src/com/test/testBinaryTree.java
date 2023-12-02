package com.test;

import com.beans.BinaryTree;

public class testBinaryTree {

	public static void main(String[] args) {
		
		BinaryTree bst=new BinaryTree();
		/*       60
		 *      /   \
		 *     35    75
		 *    /  \   / \
		 *   20  40 70  85
		 * 
		 * 
		 */
		bst.insert(60);
		bst.insert(35);
		bst.insert(75);
		bst.insert(40);
		bst.insert(20);
		bst.insert(70);
		bst.insert(85);
		System.out.println("in order Traversal: ");
		bst.inorder();
		System.out.println();
		System.out.println("Pre order Traversal: ");
		bst.preorder();
		System.out.println();
		System.out.println("Postorder Traversal: ");
		bst.postorder();
		System.out.println();

		BinaryTree bst2=new BinaryTree();
		/*         10
		 *      /     \
		 *     8       20
		 *    /  \    /  \
		 *   15  13  28  27
		 *    \    \     /
		 *     20   59  29
		 * 
		 */
		bst.insert(10);
		bst.insert(20);
		bst.insert(8);
		bst.insert(28);
		bst.insert(20);
		bst.insert(15);
		bst.insert(29);
		bst.insert(27);
		bst.insert(13);
		bst.insert(59);
		System.out.println("second tree: ");
		System.out.println("in order traversal: ");
		bst.inorder();
		System.out.println();
		System.out.println("pre order traversal: ");
		bst.preorder();
		System.out.println();
		System.out.println("post order traversal: ");
		bst.postorder();
	}

}
