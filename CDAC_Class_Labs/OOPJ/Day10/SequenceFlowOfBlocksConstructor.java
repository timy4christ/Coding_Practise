//Constructor in Inheritance.

class First{
	int a; //(8)
	First(){
		// super()
		
		System.out.println("inside class First"); //(10)
	}
	
	{ 
		System.out.println("inside class First instance block"); //(9)
	}
	static //(3)
	{
		System.out.println("inside class First static block");
	}
}

class Second extends First{
	int b; //(11)
	Second(){
		// super() //(7)
		//(13)
		System.out.println("inside class Second");
	}
	{
		System.out.println("inside class Second instance block"); //(12)
	}
	static //(4)
	{
		System.out.println("inside class Second static block");
	}
}

class Third extends Second{
	int c; //(14)
	Third(){
		// super(); //(6)
		//(16)
		System.out.println("inside class third  ");
	}
	{
		System.out.println("inside class third instance block"); //(15)
	}
	static{ //(5)
		System.out.println("inside class third static block");
	}
}

class ConstructorInInheritance{
	static{ //(1)
		System.out.println("inside ConstructorInInheritance");
	}
	public static void main(String[] args){
			System.out.println("inside main"); //(2)
	
		new Third(); //
	}
}