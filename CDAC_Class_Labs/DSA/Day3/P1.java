import java.util.Scanner;

class P1{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		
		int a[] = new int[size];
		int b[] = new int[size];
		int i, k=0;
		
		for(i=0; i<a.length; i++){
			a[i] = sc.nextInt();
		}
		

		boolean flag = true;
		for(i=0; i<a.length-1; i++){
			int j;
			for(j=i+1; j<a.length; j++){
				
				if(a[i]==a[j] && search(b,a[i],k)==1){
					flag=false;
					b[k++] = a[i];
					// break;
				}
			}
		}
		
		if(flag)
			System.out.print(-1);
		else{
			for(i=0; i<k;i++)
				System.out.print(b[i] + " ");
		}
	}
	
	public static int search(int[] b, int key, int n){
		
		for(int i=0; i<n; i++){
			if(b[i] == key){
				return -1;
			}
		}
		
		return 1;
		
	}
}