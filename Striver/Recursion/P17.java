// Program 17: Find fibonacci series recursion ( multiple recursion )
// has order of approx. 2^n (exponential in nature) : which is not good can be improved by dp

import java.util.*;

class P17{
	
	public static int fib(int n){
		if(n<=1) return n;
		
		int last = fib(n-1);
		int beforeLast = fib(n-2);
		
		return last + beforeLast;
		// return fib(n-1) + fib(n-2);
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(fib(n));
	}
}