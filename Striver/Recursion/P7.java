// Program 7: Print sum of N natural numbers, using functional recursion
// functional recursion is used to make the function just do the work and return the value not to print it through the function

import java.util.*;

class P7{

	static int sum(int n){

		// if(n==0) return 0;
		if(n==1) return 1;
		
		return n + sum(n-1);
	}

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println(sum(n));
	}
}