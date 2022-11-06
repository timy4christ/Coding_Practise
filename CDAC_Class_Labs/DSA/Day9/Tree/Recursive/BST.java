class BST{
	
	Node root;
	
	class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}		
	}
	
	BST(int data){
		root = new Node(data);
	}
	
	public Node insertAtLeaf(Node curr, int data){
			
		if(curr == null){
			curr = new Node(data);
			return curr;
		}
		
		if(data < curr.data)
			curr.left = insertAtLeaf(curr.left, data);
		else
			curr.right = insertAtLeaf(curr.right, data);
		
		return curr;
		
	}
	
	public void insert(int data){
		root = insertAtLeaf(root, data);
	}
	
	public void preOrder(Node curr){
		
		if(curr == null) return;
		
		System.out.println(curr.data);
		preOrder(curr.left);
		preOrder(curr.right);		
	}
	
	public void print(){
		preOrder(root);
	}
	
	
	public static void main(String[] args){
		
		BST bst1 = new BST(20);
		
		bst1.insert(15);
		bst1.insert(75);
		bst1.insert(95);
		
		bst1.print();
		
		
		
	}
}