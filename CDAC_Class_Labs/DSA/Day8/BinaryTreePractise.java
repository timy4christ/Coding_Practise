import java.util.Scanner;

class BinaryTreePractise{
	
	static Node root;
	static Scanner sc = new Scanner(System.in);
	
	static class Node{
		int data;
		Node left, right;
		
		Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
		
	}
	
	BinaryTree(int data){
		root = new Node(data);
	}
	
	/*
	public void inorderTraversal(Node root){
		
		if(root == null) return;
		
		inorderTraversal(root.left);
		System.out.print(root.data + " ");
		inorderTraversal(root.right);
	}*/
		
	
	public void preTraversal(Node root){
		
		if(root == null) return;
		
		System.out.print(root.data + " ");
		preTraversal(root.left);
		preTraversal(root.right);	
	}
	
	public void postTraversal(Node root){
		
		if(root == null) return;
		
		postTraversal(root.left);
		postTraversal(root.right);	
		System.out.print(root.data + " ");
	}
	
	public static void main(String[] args){
		
		BinaryTreePractise bt = new BinaryTreePractise();
		
		Node root = new Node(1);
		
		root.left = new Node(3);
		root.left.left = new Node(7);
		root.left.right = new Node(11);
		
		root.right = new Node(5);
		root.right.left = new Node(17);
		
		System.out.print("\nPre-order Traversal: ");
		bt.preTraversal(root);
		System.out.println("\n");

		System.out.print("Post-order Traversal: ");
		bt.postTraversal(root);
		System.out.println("\n");

		System.out.print("In-order Traversal: ");
		bt.inorderTraversal(root);
		System.out.println("\n");

	}
	
}