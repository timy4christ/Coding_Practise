/*
*Take an array of Strings input from the user & find the cumulative (combined) length of all those strings
*/

import java.util.Scanner;

class ReplaceLetter{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String result = "";
	
		System.out.println("Original : " + s);
	
		for(int i=0; i < s.length(); i++){
			if(s.charAt(i) == 'e'){
				result += 'i';
			} else {
				result += s.charAt(i);
			}
		}
		
		System.out.println("Result : " + result);
	
	}

}