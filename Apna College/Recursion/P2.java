// Print x^n (Stack height is log n)

class P2{
	public static void main(String[] args){
		int output = calPower(2,5);
		System.out.println(output);
	}
	
	public static int calPower(int x, int n){
		
		if(n==1) return x;		
		
		if(n%2==0){
			 return calPower(x,(n/2)) * calPower(x,(n/2));
		} else {
			return calPower(x,(n/2)) * calPower(x,(n/2)) * x;
		}
	}
}