import java.util.ArrayList;

//https://practice.geeksforgeeks.org/problems/right-view-of-binary-tree/1
public class PrintRightViewOfBinaryTree {

	public static void main(String[] args) {
		Node1 root = new Node1(1);
		root.left = new Node1(2);
		root.right = new Node1(3);
		root.left.right = new Node1(4);
		root.right.left = new Node1(5);
		root.right.right = new Node1(6);
		root.right.left.left = new Node1(7);
		root.right.left.right = new Node1(8);

		printRightView(root);
	}

	public static void printRightView(Node1 root) {

		ArrayList<Node1> list = new ArrayList<>();
		rightView(root, 0, list);

		ArrayList<Integer> ans = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			ans.add(list.get(i).key);
		}

		for (int ele : ans) {
			System.out.print(ele + " ");
		}
	}

	private static void rightView(Node1 root, int level, ArrayList<Node1> list) {
		if (root == null)
			return;
		if (level == list.size())
			list.add(root);

		rightView(root.right, level + 1, list);
		rightView(root.left, level + 1, list);
	}

}

//A class to store a binary tree node
class Node1 {
	int key;
	Node1 left = null, right = null;

	Node1(int key) {
		this.key = key;
	}
}
