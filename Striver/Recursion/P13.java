// Program 13: Reverse an arrayList through recursion and using 2-pointer
// learning to use sort function of collections class

import java.util.*;

class P13{

	static void swap(List<Integer> arr, int i, int n){
		
		if(i>=(arr.size()/2)) return;
		
		Collections.swap(arr,i,n-1);
		swap(arr,i+1,n-1);
		
	}

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> arr = new ArrayList<>(n);
		
		for(int i=0; i<n; i++)
			arr.add(sc.nextInt());

		swap(arr,0,n);

		System.out.println();
		
		for(int x : arr)
			System.out.print(x + " ");
	}
}