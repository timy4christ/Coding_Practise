class P8{
	public static void main(String[] args){
		
		int n=5;
		
		for(int i=n; i>=1; i--) {
			
			// spaces
			for(int j=n-i; j>=1; j--){
				System.out.print(" ");
			}
			
			// stars
			for(int j=2*i-1; j>=1; j--){
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}