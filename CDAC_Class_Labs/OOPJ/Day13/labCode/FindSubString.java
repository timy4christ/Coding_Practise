import java.util.Scanner;

class FindSubString{
	public static void main(String[] args){
		String sentence = "Rajesh Kumar is a student";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the substring to search : ");
		String subString = sc.nextLine();
		
		/*
		if( sentence.indexOf(subString) >= 0 )
			System.out.println("Yes! The substring is present in the String");
		else
			System.out.println("No! The substring is not present in the String");
		*/
		
		if( sentence.contains(subString) )
			System.out.println("Yes! The substring is present in the String");
		else
			System.out.println("No! The substring is not present in the String");
	}
}