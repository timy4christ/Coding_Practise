// Program 4: Print linearly from 1 to N using backtracking. Dont use i+1

import java.util.*;

class P4{
	
	static void print(int i, int n){
		
		if(i<1) return;
			
		print(i-1,n); // function call before actually printing
		System.out.println(i);
		
	}
	
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		print(n,n);
	}
}