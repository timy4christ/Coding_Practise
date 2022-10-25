class StringEquality {
    public static void main(String[] args) {

		String s1 = "My name is Bob";
		String s2 = "my name is Bob"; // case sensitive
		String s3 = "My name is " + "Bob"; 
		String s4 = new String("My name is Bob");
		
		System.out.println("s1 == s2 : " + (s1 == s2)); // false
		System.out.println("s1 == s3 : " + (s1 == s3));	// true
		System.out.println("s1 == s4 : " + (s1 == s4));	// false
    }
}
