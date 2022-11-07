class QuickSort{
    public static void main(String[] args) {
        
        int[] arr = {80,80,40,80,40,80,40};
		
		quickSort(arr, 0, arr.length-1);
		
		for(int x : arr){
			System.out.print(x + " ");
		}
		

    }
	
	public static void quickSort(int[] arr, int si, int ei){
		
		if(si>=ei) return;
		
		//step1: partioning
		
		int p = partition(arr,si,ei);
		
		//step: recursion
	
		quickSort(arr, si, p-1);
		quickSort(arr, p+1, ei);
		
		
	}
	
	public static int partition(int[] arr, int si, int ei){
		
		int pIndex = si;
		int pivot = arr[pIndex];
		int counter = 0;
		
		for(int i=si+1; i<=ei; i++){	
			if(arr[i] < pivot)
				counter++;	
		} 
		
		pIndex = si + counter;
		
		int temp = arr[pIndex];
		arr[pIndex] = arr[si];
		arr[si] = temp;
		
		int i = si;
		int j = ei;
		
		while(i < pIndex && j > pIndex){
			while(arr[i] < pivot){
				i++;
			}
			
			while(arr[j] > pivot){
				j--;
			}
			
			if(i != j){
				
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
				i++;
				j--;
				
			}
		}
		
		return pIndex;
		
	}
	
}