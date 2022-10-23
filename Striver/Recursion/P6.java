// Program 6: Print sum of N natural numbers, using parameterized recursion

import java.util.*;

class P6{
	
	static void sum(int n, int sum){
		
		if(n==0) { 
			System.out.println(sum);
			return;
		}
		
		sum(n-1, sum+n);
	}

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		sum(n,0);
	}
}