public class StringMethodDemo {
    public static void main(String[] args) {
        
        String s = "Welcome";
        System.out.println("\ncharAt Method");

        System.out.println(s.charAt(0)); // W
        System.out.println(s.charAt(6)); // e
        // System.out.println(s.charAt(7)); // StringIndexOutOfBoundsException
        // System.out.println(s.charAt(6));

        char[] ch = new char[10];
        
        s.getChars(2,5,ch,2);

        System.out.println("\nPrinting using normal for loop\n");
        for(int i = 0; i<ch.length; i++){
            if(ch[i] == '\0')
                System.out.print("\\0 "); // prints empty space as \0
            else
                System.out.print(ch[i] + " ");
        }

        System.out.println("\nPrinting using for-each loop\n");

        for(char x : ch){
            if(x == '\0')
                System.out.print("\\0 "); // prints empty space as \0
            else
                System.out.print(x + " ");
        }
        System.out.println();

        System.out.println("\nequalsIgnoreCase( )\n");
        String s5 = "WElcoMe";
        String s6 = "welComE";

        System.out.println("s5.equals(s6) : " + s5.equals(s6)); // false : equals() is case- sensitive
        System.out.println("s5.equalsIgnoreCase(s6) : " + s5.equalsIgnoreCase(s6)); //true : is not case-sensitive

        System.out.println("\ntoCharArray() method\n");
        char charr[] = s5.toCharArray();

        for(char c : charr)
            System.out.println(c);


    }
}
