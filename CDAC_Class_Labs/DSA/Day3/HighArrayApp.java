import java.util.Scanner;

class HighArrayApp{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			
			System.out.println("\n1.Insert an element");
			System.out.println("2.Display Array");
			System.out.println("3.Search");
			System.out.println("4.Delete");
			System.out.println("5.Exit");
			
			System.out.print("Enter you choice: ");
			int choice = sc.nextInt();
			
			switch(choice){
				case 1:
					System.out.print("Enter size of array: ");
					int size = sc.nextInt();
					
					HighArray arr = new HighArray(size);
					
					for(int i=0; i<size; i++){
						System.out.print("Enter element " + (i+1) + " : ");
						int x = sc.nextInt();
						arr.insert(x);
					}
					break;
				
				case 2:
					System.out.print("Array elements are : ");
					arr.display();
				
				
				
			}
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		System.out.print("\nEnter the key to search: ");
		int key = sc.nextInt();
		
		if(arr.find(key)){
			System.out.println(key +" found");
		} else {
			System.out.println(key + " not found");
		}
		
		System.out.print("\nEnter the element to delete: ");
		key = sc.nextInt();
		
		if(arr.delete(key)){
			System.out.println(key +" deleted");
		} else {
			System.out.println(key + " not deleted");
		}
		
		System.out.println();
		arr.display();
		
	}
}

class HighArray{

	private int[] arr;
	private int index;
		
	public HighArray(){ }
		
	public HighArray(int size){ 
		arr = new int[size];
		index = 0;
	}
	
	public void insert(int x){
		arr[index] = x;
		index++;
	}
	
	public void display(){
		for(int x : arr){
			System.out.print(x + " ");
		}
		System.out.println();
	}
	
	public boolean find(int key){
		for(int i=0; i<arr.length; i++){
			if(arr[i]==key){
				return true;
			}
		}
		return false;		
	}
	
	public boolean delete(int key){
		boolean keyExists = false;
		int i;
		for(i=0; i<arr.length; i++){
			if(arr[i] == key){
				keyExists = true;
				break;
			}
		}
		if(keyExists){
			int j;
			for(j=i; j<arr.length-1; j++){
				arr[j] = arr[j+1];
			}
			arr[j] = 0;
			return true;
		} 
		else {
			return false;
		}
	}
	
	
}