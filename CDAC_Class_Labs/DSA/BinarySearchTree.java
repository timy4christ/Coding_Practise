import java.util.Scanner;

class BinarySearchTree{
	
	Node root;
	
	class Node{
		int data;
		Node left, right;
		
		Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
		
	}
	
	BinarySearchTree(int data){
		root = new Node(data);
	}
	
	
	public Node insert(Node curr, int key){
		
		if(curr == null){
			curr = new Node(key);
			return curr;
		}
		
		if(curr.data <= key)
			curr.left = insert(curr.left, key);
		else
			curr.right = insert(curr.right, key);
		
		return curr;		
		
	}
	
	public void insertKey(int key){
		root = insert(root,key);
	}
	
	public void preTraversal(Node root){
		
		if(root == null) return;
		
		System.out.print(root.data + " ");
		preTraversal(root.left);
		preTraversal(root.right);	
	}
	
	public static void main(String[] args){
		
		BinarySearchTree bt = new BinarySearchTree(20);
		
		bt.insertKey(15);
		bt.insertKey(30);
		bt.insertKey(15);
		bt.insertKey(55);
		bt.insertKey(45);
		
		bt.preTraversal(bt.root);
		
	//	bt.deleteKey(55);
		

	}
	
}