/*
* Input a string from the user. 
* Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
* Example : 
original = “eabcdef’ ; result = “iabcdif”
Original = “xyz” ; result = “xyz”
*/

import java.util.Scanner;

class TotalStringLength{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("No of inputs : ");
		int size = sc.nextInt();
		sc.nextLine(); //clearing input buffer
		int sum = 0;
		String[] str = new String[size];
		
		for(int i=0; i < size; i++){
			str[i] = sc.nextLine();
			sum += str[i].length();
		}
		
		System.out.println("Combined Length : " + sum);
	}

}