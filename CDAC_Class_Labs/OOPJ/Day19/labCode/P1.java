// write a regular expression to represent all valid identifiers in java language

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class P1{
	
	public static void main(String[] args){
		
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		String regex = "[a-zA-Z][a-zA-Z0-9-#]+";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(s);
				
		boolean res = m.matches();
		if(res)
			System.out.println("Valid Identifier");
		else
			System.out.println("Invalid Identifier");
	}
	
}