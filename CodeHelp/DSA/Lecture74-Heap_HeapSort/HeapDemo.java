// max heap implementation using array
// parent element is greater than children 

/*
	Parent --> i
	Leaf Node --> 2*i
	Right Node --> 2*i + 1

*/

class HeapDemo{
	
	int arr[];
	int size;
	
	HeapDemo(){
		arr = new int[1000];
		size = 0;		
	}
	
	public void insert(int data){
		
		size = size + 1;
		int index = size;
		arr[index] = data;
		
		while(index > 1){
			
			int parent = index/2;
			
			if(arr[index] > arr[parent]){
				swap(arr, index, parent);
				index = parent;
			}
			else{
				return;
			}
		}
		
	}
	
	public void swap(int[] arr, int index, int parent){
		
		int temp = arr[index];
		arr[index] = arr[parent];
		arr[parent] = temp;
		
	}
	
	public void display(){
		
		for(int i=1; i<=size; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public void delete(){
				
		// put last element in root index
		arr[1] = arr[size];
		
		// remove last element
		size--;
		
		// place root element in correct position
		
		int index = 1;
		
		while(index < size){
			
			int leftIndex = 2*index;
			int rightIndex = 2*index + 1;
			
			// leftIndex should be within range
			if(leftIndex <= size && arr[index] < arr[leftIndex]){
				swap(arr, index, leftIndex);
				index = leftIndex;
			}
			
			// right index should be within range
			else if(rightIndex <= size && arr[index] < arr[rightIndex]){
				swap(arr, index, leftIndex);
				index = rightIndex;
			}
			
			else{
				return;
			}
		
		}
	}
	
	public void heapify(int[] arr, int n, int i){
		
		int largest = i;
		int left = 2*i;
		int right = 2*i + 1;
		
			
		if(left <= size && arr[largest] < arr[left]){
			largest = left;
		}
		
		if(right <= size && arr[largest] < arr[right]){
			largest = right;
		}
		
		// if index index is updated
		if(largest != i){
			swap(arr, largest, i);
			heapify(arr, n, largest);
		}
		
	}
	
	public static void main(String[] args){
		
		HeapDemo h = new HeapDemo();
		
		h.insert(55);
		h.insert(54);
		h.insert(53);
		h.insert(50);
		h.insert(52);
		
		h.display();
		
		h.delete();
		
		h.display();
		
		int[] arr = {-1,54,53,55,50,52};
		int n = arr.length;
		
		// index starts from non-leaf node to root node, without comparing leaf nodes
		// leaf nodes in CBT are already heaps
		for(int i=n/2; i>0; i--){
			
			// building a heap
			h.heapify(arr, n, i);
		} 
		
		for(int i=1; i<n; i++){
			System.out.print(arr[i] + " ");
		}
	}
	
}