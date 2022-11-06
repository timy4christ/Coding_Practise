// write a regular expression to represent all mobile numbers

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class P2{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		// String regex = "[7-9][0-9]{9}"; // fixed 10 digit
		// String regex = "0?[7-9][0-9]{9}"; // for 10 digit or 11 digit 
		String regex = "(91|0)?[7-9][0-9]{9}"; // for 10 digit or 11 digit or 12 digit
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(s);		
		
		boolean res = m.matches();
		if(res)
			System.out.println("Valid Mobile Number");
		else 
			System.out.println("Invalid Mobile Number");
	
	}
	
}