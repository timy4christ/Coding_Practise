import java.util.ArrayList;

class ArrayListDemo1 {

    public static void main(String[] args) {

        ArrayList<Integer> a1 = new ArrayList<>(); // order of elements stored is maintained

        a1.add(1);
        a1.add(2);
        a1.add(3);
        // a1.add(1, 20);
        // a1.add(4, 20);
        // System.out.println(a1);
        System.out.println("\nList1 elements : ");
        System.out.println("direct print : " + a1);

        // System.out.println("get & indexOf methid: " + (a1.get(a1.indexOf(20))));
        System.out.print("print using for loop: ");
        for (Integer x : a1)
            System.out.print(x + " ");

        System.out.println();

        ArrayList<Integer> a2 = new ArrayList<>();
        a2.add(3);
        a2.add(20);
        a2.add(30);
        // a1.add(1, 20);
        // a1.add(4, 20);

        a1.addAll(a2);

        System.out.println("\nAfter adding members of a2 to a1 : " + a1);

        System.out.println("a1.contains(20) : " + a1.contains(20));
        System.out.println("a1.contains(20) : " + a1.contains(50));
        System.out.println("a1.contains(a2) : " + a1.contains(a2));
        System.out.println("a1.containsAll(a2) : " + a1.containsAll(a2));
        // a2.clear();

        // System.out.println("\nMembers of a1 after clearing a2 : " + a1);
        // System.out.println("Members of a2 after clearing a2 : " + a2);

        ArrayList<String> a3 = new ArrayList<>();
        a3.add("souvick");
        a3.add("shubham");
        a3.add("srijeet");

        System.out.print("\nList3 elements : ");
        System.out.println(a3);
        System.out.println();
        System.out.println("a1.containsAll(a3) : " + a1.containsAll(a3));
        System.out.println("Is a1 empty : " + a1.isEmpty());
        System.out.println("Is a2 empty : " + a2.isEmpty());
        System.out.println("Is a3 empty : " + a3.isEmpty());

        // a1.addAll(a3); // not allows as a1 and a3 are not compatible


        a1.removeAll(a2); // removes all the elements of a2 from a1
        System.out.print("\nList3 elements after using a1.removeAll(a2) : " + a1);
        
        System.out.print("\nList3 elements after using a1.removeAll(a2) : " + a2);
        
        a3.removeAll(a3); // removes all the elements of a3 from a3
        System.out.print("\nList3 elements after using a3.removeAll(a3) : ");
        System.out.println(a3);
    
    }

}