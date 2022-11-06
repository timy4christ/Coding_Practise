// write a regular expression to represent all Mail Ids

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class P3{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		String regex = "[a-zA-Z][a-zA-Z0-9_\\.]*@(gmail|yahoo)\\.com";
		
		boolean res = s.matches(regex);
		if(res)
			System.out.println("Valid Email Id");
		else
			System.out.println("Invalid Email Id");
	
	}
	
}