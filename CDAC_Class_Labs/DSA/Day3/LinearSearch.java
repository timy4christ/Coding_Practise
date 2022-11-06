
import java.util.Scanner;

class LinearSearch{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		for(int i=0; i<size; i++)
			arr[i] = sc.nextInt();		
		
		for(int x : arr)
			System.out.print(x + " ");
		System.out.println();
		
		int key = sc.nextInt();
		
		int index = lsearch(arr,key);
		if(index >= 0)
			System.out.println(key + " found at index " + index);
		else
			System.out.println(key + " not found");
		
	}
	
	public static int lsearch(int[] arr, int key){
		
		for(int i=0; i<arr.length; i++){
			if(arr[i]==key){
				return i;
			}
		}
		
		return -1;
	}
	
}