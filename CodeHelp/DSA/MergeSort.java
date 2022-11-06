class MergeSort{
	
	public static void main(String[] args){
		
		int a1[] = {38,27,43,3,9,82,10};
		
		
		mergeSort(a1,0,a1.length-1);
		
		for(int x : a1)
			System.out.print(x + " ");
		
		
	}
	
	public static void mergeSort(int[] a1, int s, int e){
		
		int mid = s + (e - s)/2;
		
		if(s>=e) return;
		
		
		// left wala part ki division
		mergeSort(a1,s,mid);
		
		//right wala part ki division
		mergeSort(a1,mid+1,e);
		
		// this takes care of merging in sorted order
		merge(a1, s, mid, e);
		
		
	}
	
	public static void merge(int[] a1, int s, int mid, int e){
		
			
		int n = mid - s + 1;
		int m = e - mid;
		
		int L[] = new int[n];
		int R[] = new int[m];
		
		// int k=0; // mistake 1
		int k=0;
		
		// copied left part into another array
		for(int i=s; i<=mid; i++){
			L[k] = a1[i];
			k++;
		}
		
		k=0;
		// copied right part into another array
		for(int i=mid+1; i<=e; i++){
			R[k] = a1[i];
			k++;
		}
				
		int i=0;
		int j=0;
		k=s;
		while(i<n && j<m){
			
			if(L[i] < R[j]){
				a1[k] = L[i];
				k++;
				i++;
			}
			
			else{
				a1[k] = R[j];
				k++;
				j++;
			}
					
		}
		
		while(i<n){
			a1[k++] = L[i];
			i++;
		}
		
		while(j<m){
			a1[k++] = R[j];
			j++;
		}
	}
}