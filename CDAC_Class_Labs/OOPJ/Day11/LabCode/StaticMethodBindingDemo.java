class First {
	static void fun() { // type is default and static
		System.out.println("fun of First");
	}
}

class Second extends First {
	/*
	 * void fun() { // CE if static keyword is not used
	 * System.out.println("fun of Second");
	 * }
	 */

	// method overhiding
	static void fun() { // type static and default but is not an overriding method
		System.out.println("fun of Second");
	}
}

class StaticMethodBindingDemo {
	public static void main(String[] args) {

		First f = new Second();
		f.fun(); // fun of First
		((Second) f).fun(); // fun of Second

	}
}
