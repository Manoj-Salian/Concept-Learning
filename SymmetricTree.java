package com.learning;

//https://www.geeksforgeeks.org/symmetric-tree-tree-which-is-mirror-image-of-itself/
class Node1 {
	
	int data;
	Node1 left,right;
	
	public Node1(int val) {
		this.data = val;
		this.left= this.right = null;
	}
}

public class SymmetricTree {

	Node1 root;
	
	
	public static void main(String[] args) {
		SymmetricTree tree = new SymmetricTree();
		tree.root = new Node1(1);
        tree.root.left = new Node1(2);
        tree.root.right = new Node1(2);
        tree.root.left.left = new Node1(3);
        tree.root.left.right = new Node1(4);
        tree.root.right.left = new Node1(4);
        tree.root.right.right = new Node1(3);
		
		boolean isSymmetric = tree.isSymmetric(tree.root,tree.root);
		if(isSymmetric) {
			System.out.println("Is symmetric");
		}else {
			System.out.println("Is not symmetric");
		}
	}


	private boolean isSymmetric(Node1 node1,Node1 node2) {
		
		if(node1 == null && node2 == null) return true;
		
		if(node1 != null && node2 != null && node1.data == node2.data) {
			return isSymmetric(node1.left, node2.right) && isSymmetric(node1.right, node2.left);
		}
		
		return false;
	}
	
	
}
