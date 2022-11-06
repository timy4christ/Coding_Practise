class DLLPractice{
	
	Node head;
	
	class Node{
		
		int data;
		Node prev;
		Node next;
		
		Node(int data){
			this.data = data;
			this.prev = null;
			this.next = null;
		}
		
	}
	
	public void addFirst(int data){
		
		Node newNode = new Node(data);
		
		if(head == null){
			head = newNode;
			return;
		}
		
		newNode.next = head;
		head.prev = newNode;
		head = newNode;		
		
	}
	
	public void addLast(int data){
		
		Node newNode = new Node(data);
		
		if(head == null){
			head = newNode;
			return;
		}
		
		Node trav = head;
		
		while(trav.next != null){
			trav = trav.next;
		}
		
		trav.next = newNode;
		newNode.prev = trav;	
				
	}
	
	public void deleteAtPos(int pos){
		
		if(head == null){
			System.out.println("List is Empty");
			return;
		}
		
		// if there is only one element and we want to delete that
		if(head.next == null && pos == 0){ 
			head = null;
			return;
		}
		
		// deleting first node of a list
		if(pos == 0){
			head = head.next;
			head.prev = null;
		}
		
		// deleting any other node in the list
		Node trav = head;
		int counter = 0;
		
		while(counter < pos){
			trav = trav.next;
			counter++;
		}
		
		trav.prev.next = trav.next;
		
		// if its not the last node
		if(trav.next != null)
			trav.next.prev = trav.prev;
		
	}
	
	public void insertAtPos(int data){
		
	}
	
	
	public void display(){
		
		if(head == null){
			System.out.println("List is Empty");
			return;
		}
		
		Node trav = head;
		
		// forward traversal
		System.out.println("Forward Traversal:");
		while(trav.next != null){
			System.out.print(trav.data + "-->");
			trav = trav.next;				
		}
		System.out.println(trav.data + "-->null");		
		
		System.out.println("Backward Traversal:");
		while(trav != null){
			System.out.print(trav.data + "-->");
			trav = trav.prev;
		}
		System.out.println("null");	
		
		
	}
	
	
	
	public static void main(String[] args){
		
		DLLPractice list = new DLLPractice();
		
		list.display();
		list.addLast(555);
		list.addFirst(20);
		list.addFirst(30);
		list.addLast(333);
		list.addFirst(40);
		
		list.display();
		
		
		
	}
	
	
	
}