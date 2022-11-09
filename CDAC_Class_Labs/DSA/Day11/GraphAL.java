// Graph implementation in Adjacent List Representation

import java.util.*;

class GraphAL{
	
	ArrayList < ArrayList <Integer> > adj = new ArrayList<>();
	
	public void addEdge(int u, int v, boolean direction){
		
		// direction--> true : directed
		// direction--> false : undirected
		
		if(direction == true){
			adj.get(u).add(v);	
		}
		
		else{
			adj.get(u).add(v);	
			adj.get(v).add(u);
		}

	}
		
	public void print(){
		
		for(ArrayList<Integer> i : adj){
			
			System.out.print(i + "-->");
			
			for(Integer j : i){				
				System.out.print(j + " ");				
			}
			
			System.out.println();	
		} 
		
	}
	
	
	public static void main(String[] args){
		
		GraphAL graph = new GraphAL();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of nodes: ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++){
			graph.adj.add(new ArrayList<Integer>());
		}
		
		System.out.println("Enter the number of edges: ");
		int m = sc.nextInt();
		
		for(int i=0; i<m; i++){
			int u, v;
			
			u = sc.nextInt();
			v = sc.nextInt();

			graph.addEdge(u, v, true);	
		}
		
		graph.print();
		
		
	}
	
	
	
	
}