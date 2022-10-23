// Program 1 : print name n times using recursion

import java.util.*;

class P1{
	
	static void print(int i, int n){
		
		if(i>n) return;
		
		System.out.println("Timy");
		print(i+1, n);
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	
		print(1,n); // print(start, base);
	}
}