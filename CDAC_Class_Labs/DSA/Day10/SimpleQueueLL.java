class SimpleQueueLL{
	
	Node front;
	Node rear;
	
	static class Node{
		int data;
		Node next;
		static int counter;
		
		Node(int data){
			this.data = data;
			next = null;
			counter++;
		}
	}
	
	public boolean isEmpty(){
		
		if(rear == null){
			return true;
		}
		
		return false;
		
	}
	
	public void enQueue(int data){
		
		Node newNode = new Node(data);
		
		if(rear == null){
			front = rear = newNode;
			System.out.println(data + " is inserted");
			return;
		}
		
		rear.next = newNode;
		rear = newNode;
		
		System.out.println(data + " is inserted");
		
	}
	
	public void deQueue(){
		
		if(isEmpty()){
			System.out.println("Queue is Empty");
		}
		
		else{
			if(front == rear){ // one element is present
				System.out.println(front.data + " is deleted");
				front = rear = null; // done to save space : memory utilization
			}
			
			else{
				System.out.println(front.data + " is deleted");
				front = front.next;
			}
		}	
		
		Node.counter--;
	}
	
	public int size(){
		
		if(isEmpty()) return 0;
		
		return Node.counter;
	}
	
	public static void main(String[] args){
		
		SimpleQueueLL sq = new SimpleQueueLL();
		
		sq.deQueue();
		System.out.println("Size: " + sq.size());
		sq.enQueue(10);
		sq.enQueue(20);
		sq.enQueue(30);
		System.out.println("Size: " + sq.size());
		sq.enQueue(40);
		sq.enQueue(50);
		sq.enQueue(60);
		System.out.println("Size: " + sq.size());
		
		sq.deQueue();
		sq.deQueue();
		sq.deQueue();
		System.out.println("Size: " + sq.size());
		sq.deQueue();
		sq.deQueue();
		sq.deQueue();
		sq.deQueue();
		
		System.out.println("Size: " + sq.size());
		
		
		
	}
	
}