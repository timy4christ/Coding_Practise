/*
Given a string name, we have to find the initials of the name 
• Examples 1: 
	• Input : Kabhi Haa Kabhi Naa
	• Output : K H K N
		• We take the first letter of all
		• words and print in capital letter.
• Example 2:
	• Input : Mahatma Gandhi
	• Output : M G
• Example 3:
	• Input : Shah Rukh Khan
	• Output : S R K
• Example 4: your own name
*/

import java.util.Scanner;

class P3{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		// String str = "kabhi Haa Kabhi Naa";
		// String str = "Mahatma Gandhi";
		// String str = "Shah Rukh Khan";
		String str = sc.nextLine();
				
		for(int i=0; i<str.length(); i++){			
			
			char ch = str.charAt(i);			
			if(i==0) {
				System.out.print(Character.toUpperCase(ch) + " ");
				continue;
			}
			else if(str.charAt(i-1)==' ' && (ch>='a' && ch<='z' || ch>='A' && ch<='Z')){
				System.out.print(Character.toUpperCase(ch) + " ");
			}
			
		}
		
	}
}