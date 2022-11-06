class DLL{
	
	Node head;
	
	class Node{
		int data;
		Node next;
		Node prev;
		
		Node(int data){
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}
	
	public void addFirst(int data){
		
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
			System.out.println(data + " added at first");
			return;
		}
		
		head.prev = newNode;
		newNode.next = head;
		head = newNode;
		
		System.out.println(data + " added at first");
		
	}
	
	public void addLast(int data){
		
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
			System.out.println(data + " added at last");
			return;
		}
		
		Node trav = head;
		
		while(trav.next != null){
			//  System.out.println("while loop");
			trav = trav.next;
		}
		
		trav.next = newNode;
		newNode.prev = trav;
		
		System.out.println(data + " added at last");
	}
	
	public void addAtPos(int data, int pos){
		
		Node newNode = new Node(data);
		
		Node trav = head;
		int counter = 0;
		
		while(counter < pos - 1){
			trav = trav.next;
			counter++;
		}
		
		newNode.next = trav.next;
		trav.next.prev = newNode;
		newNode.prev = trav;
		trav.next = newNode;	
		
	}
	
	public void deleteFirst(){
		if(head == null) return;
		
		head = head.next;
		
		if(head != null)
			head.prev = null;
		
	}
	
	public void deleteLast(){
		
		if(head == null) return;
		
		if(head.next == null) {
			head = null;
			return;
		}
		
		Node trav = head;
		
		while(trav.next != null){
			trav = trav.next;
		}
		
		trav.prev.next = null;
		
	}
	
	public void merge(DLL list){
		
		if(head == null){
			head = list.head;
			return;
		}
		
		Node trav = head;
		
		while(trav.next != null){
			trav = trav.next;
		}
		
		trav.next = list.head;
		if(list.head != null)
			list.head.prev = trav;
	}
	
	public void print(){
		if(head == null){
			System.out.println("List is empty");
			return;
		}
		
		Node trav = head;
		System.out.println("Forward Direction:");
		while(trav.next != null){
			System.out.print(trav.data + "-->");
			trav = trav.next;
		}
		System.out.println(trav.data + "-->null");
		
		/*
		System.out.println("Backward Direction:");
		while(trav != null){
			System.out.print(trav.data + "-->");
			trav = trav.prev;
		}
		
		System.out.println("null");*/
	}
	
	public static void main(String[] args){
		
		DLL list1 = new DLL();
		
		list1.addFirst(30);
		list1.addFirst(20);
			
		list1.addLast(40);
		list1.addLast(70);
		list1.addLast(400);
			
		list1.print();
		/*
		DLL list2 = new DLL();
		
		list2.addFirst(300);
		list2.addFirst(200);
			
		list2.addLast(400);
		list1.print();
		
		// list1.merge(list2);
		
		// list1.print();
		
		list2.merge(list1);
		
		list2.print();
		*/
	}
	
}