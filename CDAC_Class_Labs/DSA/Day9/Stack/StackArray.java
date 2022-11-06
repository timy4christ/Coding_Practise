class StackArray{
	
	final int MAX = 1000;
	int[] arr;
	int top;
	int size;
	
	StackArray(int size){
		this.size = size;
		this.arr = new int[size];
		this.top = -1;
	}
	
	public void push(int data){
		if(top < MAX-1){
			top++;
			arr[top] = data;
			System.out.println("Pushed " + data);
		}
		
		else{
			System.out.println("Stack Overflow : " + data + " not inserted");
		}
			
	}
	
	public void pop(){
		if(top != -1){
			System.out.println("Popped " + arr[top]);
			top--;
		}
		
		else{
			System.out.println("Stack UnderFlow");
		}
	}
	
	public int peek(){
		if(top != -1)
			return arr[top];
		
		else{
			System.out.print("Stack is Empty: ");
			return -1;
		}
			
	}
	
	public boolean empty(){
		if(top == -1){
			return true;
		}
		
		else{
			return false;
		}
	}
	
	public static void main(String[] args){
		
		StackArray st = new StackArray(10);
		
		if(st.empty()){
			System.out.println("Stack is Empty");
		}
		
		else{
			System.out.println("Stack is not empty");
		}
		
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(70);
		st.push(3000);
		st.push(50);
		
		System.out.println("Current Top: " + st.peek());
		
		st.pop();
		
		System.out.println("Current Top: " + st.peek());
		
		st.pop();
		st.pop();
		
		System.out.println("Current Top: " + st.peek());
		
		if(st.empty()){
			System.out.println("Stack is Empty");
		}
		
		else{
			System.out.println("Stack is not empty");
		}
		
		st.pop();
		st.pop();
		st.pop();
		
		System.out.println("Current Top: " + st.peek());
		
		if(st.empty()){
			System.out.println("Stack is Empty");
		}
		
		else{
			System.out.println("Stack is not empty");
		}
	}
	
}