class LL{
	Node head;
	
	class Node{
		
		int data;
		Node next;
		
		Node(int data){	
			this.data = data;
			this.next = null;
		}		
	}
	
	public void addFirst(int data){
		
		Node newNode = new Node(data);
		
		// corner cases
		if(head==null){
			head = newNode;
			System.out.println(data + " is added at first");
			return;
		}
		
		newNode.next = head;
		head = newNode;		
		
		System.out.println(data + " is added at first");
	}
	
	public void addLast(int data){
		
		Node newNode = new Node(data);
		
		// corner cases
		if(head==null){
			head = newNode;
			System.out.println(data + " is added at last");
			return;
		}
		
		Node trav = head;
		
		while(trav.next != null){
			trav = trav.next;
		}
		
		System.out.println(data + " is added at last");
		
		trav.next = newNode;		
	}
	
	public void deleteFirst(){
		
		// corner cases
		if(head == null){
			System.out.println("List is empty");
			return;
		}
			
		head = head.next;
		
		System.out.println("First node deleted");
		
	}
	
	public void deleteLast(){
		
		// corner cases: for no nodes
		if(head == null){
			System.out.println("List is empty");
			return;
		}
		
		
		// corner case : for only one node
		if(head.next == null){
			head = null;
			return;
		}
	
		Node trav = head;
		
		while(trav.next.next != null){
			trav = trav.next;
		}
		
		System.out.println("Last node deleted");
	
		trav.next = null;
		
		
	}
	/*
	public int noOfNodes(){
			
		if(head==null)
			return 0;
		
		int counter = 1;
		Node currNode = head;
		
		while(currNode.next != null){
			counter++;
			currNode = currNode.next;
		}
		
		return counter;
	}*/
	
	public int noOfNodes(Node currNode){
		
		if(currNode == null) return 0;
		
		return 1 + noOfNodes(currNode.next);

	}
	
	public void insertAtPos(int data,int pos){
		
		if(head == null){
			System.out.println("List is Empty");
		}
		
		if(pos>noOfNodes(head)) {
		//if(pos>noOfNodes()) {
			System.out.println("Position is invalid");
			System.out.println("Total nodes in the list is " + noOfNodes(head));
			return;
		}
		
		Node newNode = new Node(data);
		int counter = 1;
		
		Node currNode = head;
		
		while(counter < pos-1){
			currNode = currNode.next; 
			counter++;
		}

		newNode.next = currNode.next;
		currNode.next = newNode;
		
		System.out.println(data + " inserted at position " + pos);

	}
	
	public void deleteAtPos(int pos){ // considering first node position as 1
		
		if(head == null){
			System.out.println("List is empty");
			return;
		}
		
		if(pos>noOfNodes(head)){
			System.out.println(pos + " is an invalid Position");
			return;
		}
		
		if(pos==1){
			head = head.next;
			return;
		}
		
		Node trav = head;
		
		int counter=1;
		
		while(counter < pos-1){
			trav = trav.next;
			counter++;
		}
		
		trav.next = trav.next.next;
		
		System.out.println("Node at pos " + pos + " deleted");

	}
	
	public void deleteKey(int key){
		
		if(head==null){
			System.out.println("The list is empty");
			return;
		}
		
				
		Node trav = head;
		
		if(trav.next == null){
			System.out.println(key + " not found");
		}
			
			
		int nextData = trav.next.data;
		
		while(nextData != key && trav.next != null){
			trav = trav.next;
			nextData = trav.next.data;
		}
		
		if(trav.next == null){
			System.out.println(key + " not found");
			return;
		}
		
		trav.next = trav.next.next;
		System.out.println(key + " deleted");
		
	}
	
	public void deleteList(){
		head=null;
		System.out.println("Deleted List");
	}
	
	public void printList(){
		
		// corner cases
		if(head==null){
			System.out.println("The list is empty");
			return;
		}
		
		Node trav = head;
		
		while(trav != null){
			System.out.print(trav.data + " -> ");
			trav = trav.next;
		}
		
		System.out.println("null");	
		
	}
	
	public static void main(String[] args){
		
		LL list = new LL();
		list.printList();
		list.addFirst(2);
		list.addFirst(1);
		
		list.printList();
		
		list.addLast(3);
		list.addLast(4);
		list.addLast(15);
		
		list.printList();
		
		list.deleteFirst();
		
		list.printList();
		
		list.deleteLast();
		
		list.printList();
		
		System.out.println("No of nodes : " + list.noOfNodes(list.head));
		
		list.insertAtPos(10,3);
		
		list.printList();
		
		list.deleteKey(10);
		
		list.printList();
		
		list.deleteAtPos(6); // Invalid Position
		
		list.printList();
		
		list.deleteList();

		list.printList();
	}
	
	
}