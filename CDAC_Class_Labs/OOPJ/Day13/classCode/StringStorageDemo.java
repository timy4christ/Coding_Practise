class StringStorageDemo {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "Hello";

        System.out.println("s1 hashcode: " + s1.hashCode());
        System.out.println("s2 hashcode: " + s2.hashCode());
        System.out.println("s1 == s2 : " + (s1 == s2)); // true

        String s3 = new String("Hello");
        String s4 = new String("Hello");

        System.out.println("s3 hashcode: " + s3.hashCode());
        System.out.println("s4 hashcode: " + s4.hashCode());
        System.out.println("s3 == s4 : " + (s3 == s4)); // false

        System.out.println("s1 == s3 : " + (s1 == s3)); // false

        System.out.println("s1.equals(s2) : " + s1.equals(s2));
        System.out.println("s1.equals(s3) : " + s1.equals(s3));
        System.out.println("s3.equals(s4) : " + s3.equals(s4));

    }
}
