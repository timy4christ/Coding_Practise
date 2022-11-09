// Largest element in the array
// Approach 1: Search the array from start to end keeping the first element
// as the reference


class LargestElement1{
	
	public static void main(String[] args){
		
		int[] arr = {10,5,35,23,999};
		
		int maxElement = largest(arr, arr.length);
		
		System.out.println("Max Element: " + maxElement);
		
	}
	
	public static int largest(int arr[], int n) {
        int maxIndex = 0;
        
        for(int i=1; i<n; i++)
            if(arr[i] > arr[maxIndex])
                maxIndex = i;
                
        return arr[maxIndex];
    }
}

// Time Complexity : O(n)