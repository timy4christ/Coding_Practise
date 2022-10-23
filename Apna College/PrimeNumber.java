/*
* Print if a number is prime or not (Input n from the user). 
* [In this problem you will learn how to check if a number is prime or not]
*/

import java.util.Scanner;

class PrimeNumber{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter postive number: ");
		int n = sc.nextInt();
		
		boolean isPrime=true;
		

		if(n == 1)
			System.out.println("1 is neither prime nor composite");
	
		else if(n == 2)
			System.out.println("2 is the only even prime number");
	
		else{
			if(n%2==0){
				isPrime=false;
			}	
			
			else {
				for(int i=3; i<=(n/2); i+=2){
					
					if(n % i == 0){
						isPrime = false;
						break;
					}
				
				}		
			}
			System.out.println(isPrime ? "Prime" : "Not Prime");	
		}

	}

}
