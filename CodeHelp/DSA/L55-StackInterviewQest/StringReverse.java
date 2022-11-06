// reversing string using stack DSAKey
import java.util.Stack;

class StringReverse{
	
	public static void main(String[] args){
		
		Stack <Character> st = new Stack<>();
		String str = "babbar";
		
		for(int i=0; i<str.length(); i++){			
			char ch = str.charAt(i);
			st.push(ch);
		}
		
		String res = "";
		
		while(!st.empty()){	
			res += st.peek(); // returns character data type
			st.pop();			
		}
		
		System.out.println(res);
		
	}
}