class First {
	private void fun() {
		System.out.println("fun of First");
	}

	void accessPrivateMethodFun(){
		fun();
	}
}

class Second extends First {
	private void fun() {
		System.out.println("fun of Second");
	}

	void trialAccess(){
		accessPrivateMethodFun();
	}
}

class PrivateMethodRestrictionDemo {
	public static void main(String[] args) {
		First f = new Second();
		((Second)f).trialAccess();
		
	}
}
