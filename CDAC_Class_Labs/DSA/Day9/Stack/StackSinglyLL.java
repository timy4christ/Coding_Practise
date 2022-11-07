// I think this is stack implementation using linkedlist (singly)
// to ensure add first, delete first

class StackSinglyLL{
	
	Node top;
	
	static class Node{
		int data;
		Node next;
		static int counter;

		Node(int data){
			this.data = data;
			this.next = null;
			counter++;
		}
	}
	
	public boolean isEmpty(){
		if(top == null) return true;
		
		return false;
	}
	
	public void push(int data){
		
		Node newNode = new Node(data);
		
		// achieving add at first
		newNode.next = top;
		top = newNode;
		
		System.out.println(data + " is inserted");
		
	}
	
	public int pop(){
		
		if(isEmpty()) {
			System.out.println("Stack Underflow");
			return -1;
		}
			
		int data = top.data;
		
		// achieving delete first
		top = top.next;
		
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
		
		StackSinglyLL st = new StackSinglyLL();
		
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