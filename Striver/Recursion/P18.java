// Program 18: Print all the subsequences
// subsequence: a contiguous or non-contiguous sequence, which follow the order given

import java.util.List;
import java.util.ArrayList;

class P18{
	
	public static void print(int i, List<Integer> l, Integer[] arr, int n){
		
		if(i==n){
			if(l.size() == 0){
				System.out.print("{}");
			} 
			for(Integer x : l){
				System.out.print(x + " ");
			}
			System.out.println();
			return;	
		}
		// System.out.println(l.size());
		l.add(arr[i]);
		print(i+1,l,arr,n);
	
		l.remove(arr[i]); // this sometimes get confused with element and index, so be careful, thats why i have taken Integer array
		// System.out.println(l.size());
		print(i+1,l,arr,n);
	
	}
	
	public static void main(String[] args){
		
		Integer arr[] = {3,1,2};
		int n = 3;
		
		List<Integer> l = new ArrayList<>();
		
		print(0,l,arr,n);
		
	}
}