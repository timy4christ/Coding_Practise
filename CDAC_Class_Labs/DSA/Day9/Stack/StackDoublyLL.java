// I think this is stack implementation using linkedlist (doubly)
// can be used with add first and add last but for that we can do with single 
// no need to put an extra overhead
// to ensure add last, delete last

class StackDoublyLL{
	
	Node top;	 // is our top
	
	static class Node{
		int data;
		Node next;
		Node prev;
		static int counter;

		Node(int data){
			this.data = data;
			this.next = null;
			this.prev = null;
			counter++;
		}
	}
	
	public boolean isEmpty(){
		if(top == null) return true;
		
		return false;
	}
	
	public void push(int data){
		// LL is dynamic in nature, so no need to check for full condition
		
		Node newNode = new Node(data);
		
		// when no element then directly insert
		if(isEmpty()){
			top = newNode;
			return;
		}
		
		newNode.prev = top;
		top.next = newNode;
		top = newNode;
		
		System.out.println(data + " is inserted");
		
	}
	
	public int pop(){
		
		if(isEmpty()) {
			System.out.println("Stack Underflow");
			return -1;
		}
			
		int data = top.data;
		
		top = top.prev;
		
		// top == null condition could be achieved when the last element is deleted
		if(top != null) 
			top.next = null;
		
		Node.counter--;
		return data;
	}
	
	public int size(){
		return Node.counter;
	}
	
	public int peek(){
		if(isEmpty()) return -1;
		
		return top.data;
	}
	
	
	public static void main(String[] args){
		
		StackDoublyLL st = new StackDoublyLL();
		
		st.pop();
		System.out.println("Size: " + st.size());
		st.push(50);
		System.out.println("Size: " + st.size());
		st.push(30);
		System.out.println("Top Element: " + st.peek());
		st.push(40);
		System.out.println("Top Element: " + st.peek());
		st.push(20);
		st.push(10);
		System.out.println("Size: " + st.size());
		st.pop();
		System.out.println("Top Element: " + st.peek());
		System.out.println("Size: " + st.size());
		st.pop();
		st.pop();
		st.pop();
		System.out.println("Size: " + st.size());
		st.pop();
		st.pop();
		System.out.println("Size: " + st.size());
		System.out.println("Top Element: " + st.peek());
		
	}
}