class VarArgs{

	public static void printAll(String str, int... vals){
		System.out.println(str);
		for(int v : vals)
			System.out.println(v);
	}

	public static void main(String[] args){
		
		printAll("Hello", 2, 5, 7, 9, 10,16,7,35);
		for(String i : args)
			System.out.println(i);
		
		for(int i=0; i<args.length; i++)
			System.out.println(args[i]);
		
		for(int 
	
	}

}