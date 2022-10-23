// Program 15: Check if the string is palindrom or not using recursion


import java.util.*;

class P15{
	
	static boolean isPalindrome(String s, int i){
	
		if(i>=(s.length()/2)) return true;
		
		// this code is to make the comparision case insensitive
		/*if(s.charAt(i) == s.charAt(s.length()-i-1) || s.charAt(i) == (s.charAt(s.length()-i-1)+32) || s.charAt(i) == (s.charAt(s.length()-i-1)-32)){
			isPalindrome(s,i+1);
			return true;
		}*/
		
		if(s.charAt(i) != s.charAt(s.length()-i-1)) return false;
		
		return isPalindrome(s,i+1);
		
	}

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		if(isPalindrome(s,0))
			System.out.println(s + " is a Palindrome.");
		else
			System.out.println(s + " is not a Palindrome.");

	}
}