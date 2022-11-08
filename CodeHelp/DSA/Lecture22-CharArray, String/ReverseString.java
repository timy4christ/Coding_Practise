// reverse a string

import java.util.Scanner;
import java.util.Arrays;

class ReverseString{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		String reversed = reverseString(str);
		
		System.out.println("Reversed String: " + reversed);
		
	}
	
	public static String reverseString(String str){
		
		char[] arr = str.toCharArray();
		int n = arr.length;		
		
		int i=0;
		while(i < (n/2)){
			char temp = arr[i];
			arr[i] = arr[n-i-1];
			arr[n-i-1] = temp;
			i++;
		}

		String res = "";
		for(i=0; i<n; i++){
			res += arr[i];
		}
		
		return res;
		
	}
}