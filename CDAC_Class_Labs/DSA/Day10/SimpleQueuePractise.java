class SimpleQueuePractise{

	// data members
	int []arr;
	int front;
	int rear;
	int size;
	
	SimpleQueuePractise(int size){
		this.size = size;
		arr = new int[size];
		front = rear = 0;
	}
	
	public void isEmpty(){
		if(rear == 0)
			System.out.println("Queue is Empty");
		
		else
			System.out.println("Queue is not Empty");
	}
	
	public void enqueue(int data){
		if(rear == size){
			System.out.println("Queue is Full: " + data + " not inserted");
			return;
		}

		arr[rear] = data;
		System.out.println(arr[rear] + " is inserted");
		rear++;	
	}

	public void dequeue(){
		if(front == rear){
			System.out.println("Queue is Empty");
			
			// to avoid wasting of memory: efficient in memory saving
			front = rear = 0;
			
			return;
		}
		
		System.out.println(arr[front] + " is deleted");
		front++;
	}

	public int front(){
		if(rear == 0)
			return -1;
		
		return arr[front];
	}
	
	public int size(){
		return rear - front;
	}

	
	public static void main(String[] args){
		
		SimpleQueuePractise q = new SimpleQueuePractise(5);
		
		q.dequeue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.enqueue(60);
		q.dequeue();
		System.out.println("Front element: " + q.front());
		System.out.println("Size: " + q.size());
		
	}
	
}