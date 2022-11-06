import java.net.SocketPermission;

// sum of series
// 1 -  

class P1{
	public static void main(String[] args){
		
		int n = 3;
		double sum = sumOfSeries(1,n);
		System.out.println("Answer: " + sum);
	}
	
	public static double sumOfSeries(int i, int n){
		
		if(i==n) return (1.0/i);
		
		if(i % 2 == 0)
			return ((1.0/i) + sumOfSeries(i+1, n));
		
		else
			return ((1.0/i) - sumOfSeries(i+1, n));
		
	}
}