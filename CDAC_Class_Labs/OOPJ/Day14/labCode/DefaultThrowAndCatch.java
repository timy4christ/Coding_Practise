class DefaultThrowAndCatch{
    public static void main(String[] args){
		
		int n = 1;
		try{
			n = 5/0; // default throw of exception and handled by default catch mechanism
		}
		
		finally{
			System.out.println("This Line must be printed"); // will surely be printed even if there is no self defined catch handler
		}
		
		System.out.println("Out of finally "); // not printed
	}
}