// Program 12: Reverse an array using recursion 2-pointer
// passing arguments(variables/ positions) are simulated as pointers to respective indexs

import java.util.*;

class P12{

	static void reverse(int arr[], int i, int n){	
		
		if(i>=(arr.length/2)) return;
		
		int x = arr[i];
		arr[i] = arr[n-1];
		arr[n-1] = x;
		
		reverse(arr, i+1, n-1);
	}

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();

		reverse(arr,0,n);
		
		System.out.println();
		
		for(int x : arr)
			System.out.print(x + " ");
	}
}