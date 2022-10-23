// Program 9: Print factorial of a number using functional recursion
// functional recursion is used to make the function just return values and not to print through the function
import java.util.*;

class P9{

	static int fact(int n){
		
		if(n==1) return 1;
		
		return n * fact(n-1);
	}

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(fact(n));

	}
}