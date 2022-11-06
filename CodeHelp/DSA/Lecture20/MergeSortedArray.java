class MergeSortedArray{
	
	public static void main(String[] args){
		
		int a1[] = {1,3,5,7,9};
		int a2[] = {2,4,6};
		int n=a1.length;
		int m=a2.length;
		int[] c = new int[n+m];
		
		
		print(a1);
		print(a2);
		
		merge(a1,n,a2,m,c);
		
		print(c);
	}
	
	public static void merge(int[] a1, int n, int[] a2, int m, int[] c){
		
		int i = 0;
		int j = 0;
		int k=0;
		
		
		while(i<n && j<m){
			
			if(a1[i]<a2[j]){
				c[k++] = a1[i++];
			}
			
			else{
				c[k++] = a2[j++];
			}
		
		}
		
		//printing remaining elements of first array
		while(i<n){
			c[k++] = a1[i++];
		}
		
		// printing remaining elements of second array
		while(j<m){
			c[k++] = a2[j++];
		}
		
		
	}
	
	public static void print(int[] arr){
		
		for(int x : arr){
			System.out.print(x + " ");
		}
		System.out.println();
		System.out.println();
	}
	
}