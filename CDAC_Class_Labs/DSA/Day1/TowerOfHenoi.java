class TowerOfHenoi{
	
	public static void toh(int n, char src, char helper, char dest){
		
		if(n==1){
			System.out.println(src + " to " + dest);
			return;
		}
		
		toh(n-1,src, dest, helper);
		System.out.println(src + " to " + dest);
		toh(n-1,helper, src, dest);
		
	}
	
	public static void main(String[] arg){
		
		int n=3;
		
		toh(n,'A', 'B', 'C');
	}
}