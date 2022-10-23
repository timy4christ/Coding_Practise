// Program 14: Reverse an arrayList through recursion and using 1-pointer
// learning to use sort function of collections class

import java.util.*;

class P14{

	static void swap(List<Integer> arr, int i){
		
		if(i>=(arr.size()/2)) return;
		
		Collections.swap(arr,i,arr.size()-i-1);
		swap(arr,i+1);
		
	}

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> arr = new ArrayList<>(n);
		
		for(int i=0; i<n; i++)
			arr.add(sc.nextInt());

		swap(arr,0);

		System.out.println();
		
		for(int x : arr)
			System.out.print(x + " ");
	}
}