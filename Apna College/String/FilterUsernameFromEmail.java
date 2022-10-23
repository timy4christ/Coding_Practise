/*
* Input an email from the user. You have to create a username from the email by deleting the part that comes after '@'. 
* Display that username to the user.
* Example : 
* email = "apnaCollegeJava@gmail.com" ; username = "apnaCollegeJava" 
* email = "helloWorld123@gmail.com"; username = "helloWorld123"
*/

import java.util.Scanner;

class FilterUsernameFromEmail{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter email : ");
		String email = sc.nextLine();
		String username = "";
		
		/*
		int i=0;
		while( email.charAt(i) != '@'){
			username += email.charAt(i);
			i++;
		}*/ /* problem: the loop doesnt stop at the end of the string(if input is invalid) so it gives outOfIndex exception */
		
		for(int i=0; i < email.length(); i++){
			if(email.charAt(i) == '@')
				break;
			else
				username += email.charAt(i);
				
		}
		
		System.out.println("Username : " + username);	
	}
}