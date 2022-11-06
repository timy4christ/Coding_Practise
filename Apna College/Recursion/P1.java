// Print x^n (Stack height is n)

class P1{
	public static void main(String[] args){
		int power = calPower(2,5);
		System.out.println(power);
	}
	
	public static int calPower(int x, int n){
		
		if(n==1) return x; // base case1
		
		if(x==0) return 0; // base case2
		
		int calPownm1 = calPower(x,n-1);
		int power =  x * calPownm1;
		return power; 
		
		// return x * calPower(x,n-1);
	}
}