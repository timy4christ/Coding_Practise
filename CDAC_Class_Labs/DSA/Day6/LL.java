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
		
		newNode.next = head;
		head = newNode;
		
		System.out.println(data + " is added at first");
	}
	
	public void addLast(int data){
		
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
			System.out.println(data + " is added at last");
			return;
		}

		Node trav = head;
		
		while(trav.next != null){
			trav = trav.next;
		}
		
		trav.next = newNode;
		
		System.out.println(data + " is added at last");
		
	}
	/*
	public void addAtPos(int pos){
		
		if(head == null){
			head = newNode;
			return;
		}
		
		
		
		Node trav = head;
		
		int counter=0;
		
		while(counter<pos-1){
			trav = trav.next;			
			counter++;
		}
		
		newNode.next = trav.next;
		trav.next = newNode;
		
	}*/
	
	public void insertAfter(int key, int data){
		
		if(head==null){
			System.out.println("List is Empty");
			return;
		}
		
		
		Node newNode = new Node(data);
		
		Node trav = head;
		
		while(trav != null && trav.data != key){
			trav = trav.next;
		}
		
		if(trav == null){
			System.out.println(key + " not found");
			return;
		}
		
		newNode.next = trav.next;
		trav.next = newNode;
		System.out.println(data + " is inserted");
		
		
	}
	
	public void deleteFirst(){
		
		if(head==null){
			System.out.println("List is empty");
			return;
		}
		
		System.out.println(head.data + " is deleted from first");
		head = head.next;
	}
	
	public void deleteLast(){
		
		if(head==null){
			System.out.println("List is Empty");
			return;
		}
		
		if(head.next == null){ // if only one element is present
			System.out.println(head.data + " is deleted from last");
			head = null;
			return;
		}
		
		Node trav = head;
		
		while(trav.next.next != null){
		
			trav = trav.next;		
		}
		
		System.out.println(trav.next.data + " is deleted from last");
		trav.next = null;
		
	}
	
	// one pointer approach
	public void deleteKey(int key){
		
		if(head==null){
			System.out.println("List is empty");
			return;
		}
		
		// if one element and the key matches
		if(head.data == key){
			System.out.println(key + " found and deleted");
			head = head.next;
			return;
		}
				
		Node trav = head;
		
		// checking for key
		while(trav.next != null && trav.next.data != key){
			trav = trav.next;	
		}
		
		// comes out if next data is key or reached the last
		// node
		
		// key not found
		if(trav.next==null && trav.data != key){
			System.out.println(key + " not found");
			return;
		}
		
		// last element is the key
		if(trav.next.next == null){
			trav.next = null;
		}
		
		// some mid element is the key
		else{
			trav.next = trav.next.next;
		}
		
		System.out.println(key + " found and deleted");
	}
	
	public void search(int key){
		if(head==null){
			System.out.println("List is Empty");
			return;
		}
				
		Node trav = head;
		int counter=1;
		
		while(trav != null && trav.data != key){
			trav = trav.next;
			counter++;
		}
		
		if(trav == null){
			System.out.println(key + " not found");
			return;
		}
		
		System.out.println(key + " at position " + counter);
	
	}

	// recursive method to count nodes
	public int countOfNodes(Node currNode){
		
		if(currNode == null) return 0;
		
		return 1 + countOfNodes(currNode.next);
	}
	
	public void print(){
		
		if(head == null){
			System.out.println("The list is empty");
			return;
		}
		
		Node trav = head;
		
		while(trav != null){
			
			System.out.print(trav.data + "-->");
			trav = trav.next;
		}
		System.out.println("null");
	}
	
	public static void main(String[] args){
		
		LL list1 = new LL();
		list.print();
		list.insertAfter(47,100);
		// list.search(-1);
		list.addFirst(5);
		list.insertAfter(47,100);
		list.insertAfter(5,100);
		list.search(5);
		list.addLast(0);
		list.addFirst(20);
		list.addLast(2);
		list.addLast(6);
		list.addLast(7);
		list.addLast(67);
		list.addLast(47);
		list.insertAfter(47,100);
		list.addLast(87);
		list.addLast(67);
		list.addLast(57);
		list.addLast(66);
		list.print();
		
		list.deleteFirst();
		list.print();
		
		list.deleteLast();
		list.print();
		
		list.deleteKey(67);
		list.deleteKey(5);
		
		list.print();
		
		list.search(67);
		list.search(0);
		list.search(57);
		list.search(-1);
		
		int count = list.countOfNodes(list.head);
		
		System.out.println("No of nodes : " + count);
	}
	
}