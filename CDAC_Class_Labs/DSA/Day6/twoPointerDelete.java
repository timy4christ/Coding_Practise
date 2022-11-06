class twoPointerDelete{
	
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
	
	public void deleteKey(int key){
		
		if(head==null){
			System.out.println("List is Empty");
			return;
		}
		
		if(head.data == key){
			head = head.next;
			return;
		}
		
		Node currNode = head;
		Node prevNode = null;
		
		while(currNode != null && currNode.data != key ){
			prevNode = currNode;
			currNode = currNode.next;
		}
		
		if(currNode == null){
			System.out.println(key + " not found");
			return;
		}
		
		prevNode.next = currNode.next;
		System.out.println(key + " deleted");
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
		
		LL list = new LL();
		list.print();
		list.addFirst(5);
		list.addLast(0);
		list.addFirst(20);
		list.addLast(2);
		list.addLast(6);
		list.addLast(7);
		list.addLast(67);
		
		list.print();

		list.deleteKey(67);
		list.deleteKey(5);
		list.deleteKey(0);
		list.deleteKey(20);
		
		list.print();
	}
	
}