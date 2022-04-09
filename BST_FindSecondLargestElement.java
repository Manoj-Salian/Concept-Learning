//find second largest element in BST
//https://www.geeksforgeeks.org/second-largest-element-in-binary-search-tree-bst/#:~:text=The%20second%20largest%20element%20is,2%2C%20we%20print%20the%20node.
public class BST_FindSecondLargestElement {

	Node1 root;
	
	static int count = 0;
	
	public BST_FindSecondLargestElement() {
		this.root = null;
	}
	public void insert(int data) {
		this.root = insertRec(this.root,data);
	}
	public Node1 insertRec(Node1 node , int data) {
		
		if(node == null) {
			this.root = new Node1(data);
			return this.root;
		}
		
		if(data < node.data) {
			node.left = this.insertRec(node.left,data);
		}else {
			node.right = this.insertRec(node.right, data);
		}
		return node;
	}
	public static void main(String[] args) {
		
		BST_FindSecondLargestElement bst = new BST_FindSecondLargestElement();
		bst.insert(50);
		bst.insert(30);
		bst.insert(20);
		bst.insert(40);
		bst.insert(70);
		bst.insert(60);
		bst.insert(80);
		
		bst.findSecondLargestElement(bst.root);
	}
	private void findSecondLargestElement(Node1 node) {
		if(node == null || count > 2) {
			return;
		}
		
		findSecondLargestElement(node.right);
		
		count++;
		
		if(count == 2) {
			System.out.println("Element is : " + node.data);
			return;
		}
		
		findSecondLargestElement(node.left);
		
	}

}


class Node1 {
	
	int data;
	Node1 left, right = null;
	
	public Node1(int value) {
		this.data = value;
		this.left = this.right = null;
	}
}