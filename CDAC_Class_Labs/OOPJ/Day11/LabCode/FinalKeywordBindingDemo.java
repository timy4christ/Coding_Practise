class First {
	final void fun() { // type is default
		System.out.println("fun of First");
	}
}

class Second extends First {
	// void fun() { // type is defualt but is not allowed to overriden fun() of First class :CE
	// 	System.out.println("fun of Second");
	// }
}

class FinalKeywordBindingDemo {
	public static void main(String[] args) {
		First f = new Second();
		f.fun(); // fun of First

	}
}
