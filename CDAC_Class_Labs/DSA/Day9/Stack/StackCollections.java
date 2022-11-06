import java.util.Stack;

class StackCollections{
	
	public static void main(String[] args){
		
		Stack<Integer> st = new Stack<>();
		
		System.out.println("Pushed : " + st.push(30));
		System.out.println("Pushed : " + st.push(20));
		System.out.println("Pushed : " + st.push(50));
		
		System.out.println("Size : " + st.size());
		
		
		System.out.println("Top Element: " + st.peek());
		
		if(st.empty()){
			System.out.println("Stack is Empty");
		}
		else{
			System.out.println("Stack is not Empty");
		}
		
		System.out.println("Poped : " + st.pop());
		System.out.println("Poped : " + st.pop());
		System.out.println("Poped : " + st.pop());

		if(st.empty()){
			System.out.println("Stack is Empty");
		}
		else{
			System.out.println("Stack is not Empty");
		}
	} 
	
}