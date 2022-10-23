// Program 5: Print linearly from N to 1 using backtracking. Dont use i-1

import java.util.*;

class P5{
	
	static void print(int i, int n){
		
		if(i>n) return;
		
		print(i+1,n);
		System.out.println(i);
	}
	
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		print(1,n);
	}
}