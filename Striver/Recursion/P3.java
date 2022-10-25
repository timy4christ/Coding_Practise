// Program 3: print linearly from n to 1 

import java.util.*;

class P3{
	/*static void print(int n){ 	// my way1 
		
		if(n<1) return;
		
		System.out.println(n);
		print(n-1);
	}*/
	
	/*static void print(int i, int n){	// my way2 
		
		if(i<n) return;
		
		System.out.println(i);
		print(i-1, 1);
	}*/
	
	static void print(int i, int n){
		
		if(i<1) return;
		
		System.out.println(i);  // print before the function call
		print(i-1,n);
	}
	
	public static void main(String []args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		// print(n); // my way1
		// print(n,1); // my way2
		print(n,n); //Strivers way
	}
}