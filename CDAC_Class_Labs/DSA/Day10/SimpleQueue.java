class SimpleQueue{
	
	int arr[];
	int front;
	int rear;
	int size;
	
	SimpleQueue(int n){
		this.size = n;
		arr = new int[size];
		front = rear = -1;		
	}
	
	public boolean isFull(){
		
		if(rear == size-1){
			return true;
		}
		
		return false;
	}
	
	public boolean isEmpty(){
		
		if(rear == -1){
			return true;
		}
		
		return false;
		
	}
	
	public void enQueue(int data){
		if(isFull()){
			System.out.print("Queue is full: ");
			System.out.println(data + " not inserted");
		}
		else {
			if(front == -1){
				front++;
				rear++;	
			}
			
			else{
				rear++;
			}
			
			arr[rear] = data;
			System.out.println(arr[rear] + " is inserted");
		}
	}
	
	public void deQueue(){
		
		if(isEmpty()){
			System.out.println("Queue is Empty");
		}
		
		else{
			if(front == rear){ // one element is present
				System.out.println(arr[front] + " is deleted");
				front = rear = -1; // done to save space : memory utilization
			}
			
			else{
				System.out.println(arr[front] + " is deleted");
				front++;
			}
		}	
	}
	
	public int size(){
		
		if()
		
		return rear - front + 1;
	}
	
	public static void main(String[] args){
		
		SimpleQueue sq = new SimpleQueue(5);
		
		System.out.println("Size: " + sq.size());
		sq.enQueue(10);
		sq.enQueue(20);
		sq.enQueue(30);
		sq.enQueue(40);
		sq.enQueue(50);
		sq.enQueue(60);
		
		sq.deQueue();
		sq.deQueue();
		sq.deQueue();
		sq.deQueue();
		sq.deQueue();
		sq.deQueue();
		
		
		
		
	}
	
}