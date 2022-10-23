import java.util.*;

class SetBasicDemo {

    public static void main(String[] args) {

        Set<Integer> a1 = new LinkedHashSet<>(); // order is not maintained

        a1.add(2);
        a1.add(49);

        a1.add(3);
        a1.add(49); // duplicate not inserted
        a1.add(1);

        System.out.println("\nList 1 elements : " + a1); // [49, 1, 2, 3]
    }

}

// Set has HashSet, LinkedHashSet:
// Implemented similar to List
