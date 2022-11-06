class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		this.next = null;
	}
}

class ReverseLL{
	
	Node head;
	
	public void addFirst(int data){
		
		Node newNode = new Node(data);
		
		if(head == null){
			head = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
		
	}
	
	public void print(){
		
		if(head == null){
			System.out.println("List is Empty");
			return;
		}
		
		Node trav = head;
		
		while(trav != null){
			System.out.print(trav.data + "-->");
			trav = trav.next;
		}
		
		System.out.println("null");
	}
	
	public void reverse(){
		
		if(head == null){
			System.out.println("List is Empty");
			return;
		}
		
		if(head.next==null){
			return;
		}
		
		Node curr = head;
		Node next = null;
		Node prev = null;
		
		while(curr != null){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;	
		}
		
		head = prev;		
	}
	
	
	public static void main(String[] args){
		
		ReverseLL list = new ReverseLL();
		list.print();
		
		System.out.println("Original LL:");
		list.addFirst(20);
		list.addFirst(10);
		list.addFirst(5);
		list.print();
		System.out.println("Reversed LL:");
		list.reverse();
		list.print();
		
		
	}
}