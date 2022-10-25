// Program 16: Find fibonacci series using loop

import java.util.*;

class P16{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a = 0;
		int b = 1;
		
		for(int i=1; i<n; i++){
			b = a + b;
			a = b - a;
			System.out.println(b);
		}
		
		
	}
}