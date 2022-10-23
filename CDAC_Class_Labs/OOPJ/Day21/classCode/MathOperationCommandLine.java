class MathOperationCommandLine{

	public static void main(String args[]){
	
		try{
			String op = args[0];
			int num1 = Integer.parseInt(args[1]);
			int num2 = Integer.parseInt(args[2]);
			int res = 0;
			
			switch(op){
				
				case "-a":
					res = num1 + num2;
					break;
					
				case "-m":
					res = num1 * num2;
					break;
					
				case "-d":
					try{
						res = num1 / num2;
					}
					
					catch(ArithmeticException ae){
						System.out.println("Division by 0 not allowed");
					}
					break;
					
				case "-s":
					res = num1 - num2;
					break;
					
			}
			
			System.out.println("Result is : " + res);
		}
		
		catch(ArrayIndexOutOfBoundsException aie){
			System.out.println("Arguments missing");
		}
		
	
	
	}

}