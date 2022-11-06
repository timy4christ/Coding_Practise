// multiple of table using recursion

class P2{
	public static void main(String[] args){
		
		int n = 8;
		table(1,n);
	}
	
	public static void table(int i, int n){
		
		if(i>10) return;
		
		System.out.println(n + " * " + i + " = " + (n*i));
		table(i+1,n);
			
	}
}