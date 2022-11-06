
import java.util.Scanner;

class BinarySearch{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		for(int i=0; i<size; i++)
			arr[i] = sc.nextInt();		
		
		System.out.print("The array elements are : ");
		for(int x : arr)
			System.out.print(x + " ");
		System.out.println();
		
		int key = sc.nextInt();
		
		int index = bsearch(arr,key,0,size-1);
		if(index >= 0)
			System.out.println(key + " found at index " + index);
		else
			System.out.println(key + " not found");
		
	}
	
	public static int bsearch(int[] arr, int key, int left, int right){
		
		
		if(left<=right){
			int mid = left + (right-left)/2;
			
			if(arr[mid]==key) return mid;
			
			if(arr[mid] > key)
				bsearch(arr,key,left,mid-1);
			
			if(arr[mid] < key)
				bsearch(arr,key,mid+1,right);			
			
		}
		
		return -1;
	}
	
}