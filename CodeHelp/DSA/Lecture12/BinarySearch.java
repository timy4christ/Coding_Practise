class BinarySearch{
	
	public static void main(String[] args){
		
		int[] arr={10,20,30,40,50};
		int key = 55;
		
		int index = bSearch(arr, key);
		if(index >= 0)
			System.out.println(key + " is found at index " + index);
		else
			System.out.println(key + " is not found");
		
	}
	
	
	public static int bSearch(int[] arr, int key){
		
		int start=0;
		int end=arr.length-1;
		int mid = start + (end - start)/2;
		
		while(start<=end){
			
			if(arr[mid] == key) return mid;
			
			if(arr[mid] > key)
				end = mid - 1;

			if(arr[mid] < key)
				start = mid + 1;
			
			mid = start + (end - start)/2;
		}
		
		return -1;
		
		
	}
}