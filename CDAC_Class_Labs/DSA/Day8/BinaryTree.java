import java.util.Scanner;

class BinaryTree{
	
	Node root;
	static Scanner sc = new Scanner(System.in);
	
	class Node{
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
	
	
	public Node buildTree(Node root){
		
		System.out.println("Enter the data (-1 for null): ");
		int data = sc.nextInt();
		root = new Node(data);
		
		if(data == -1) return null;
		
		System.out.println("Inserting the data to the left : ");
		root.left = buildTree(root.left);
		
		System.out.println("Inserting the data to the right : ");
		root.right = buildTree(root.right);

		return root;		
		
	}
	
	
	public static void main(String[] args){
		
		BinaryTree bt = new BinaryTree(20);
		
		bt.root = bt.buildTree(bt.root);
		
	}
	
}