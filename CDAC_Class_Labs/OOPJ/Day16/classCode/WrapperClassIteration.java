import java.util.*;

class WrapperClassIteration {

    public static void main(String[] args) {

        List<Integer> a1 = new ArrayList<>(); // order is not maintained

        a1.add(2);
        a1.add(49);

        a1.add(3);
        a1.add(49);
        a1.add(1);

        System.out.println("\nList 1 elements printed directly using the reference variable: " + a1); // [49, 1, 2, 3]

        System.out.print("List 1 elements using for each: ");
        for (Integer x : a1)
            System.out.print(x + " ");

        System.out.println();
        System.out.print("\nList 1 elements using Iterator Object: ");
        Iterator<Integer> itr1 = a1.iterator();
        while (itr1.hasNext()) {
            Integer s = itr1.next();
            System.out.print(s + " ");
        }
        System.out.println();

        System.out.print("\nList 1 elements using List Iterator(next() method): ");
        ListIterator<Integer> itr2 = a1.listIterator();
        while (itr2.hasNext()) {
            Integer s = itr2.next();
            System.out.print(s + " ");

        }
        System.out.println();

        System.out.print("\nList 1 elements using List Iterator(previous() method): ");
        while (itr2.hasPrevious()) {
            Integer s = itr2.previous();
            System.out.print(s + " ");

        }
        System.out.println();

        System.out.print("\nList 1 elements using Enumeration: ");
        Enumeration<Integer> em = Collections.enumeration(a1);
        while (em.hasMoreElements()) {
            Integer s = em.nextElement();
            System.out.print(s + " ");

        }
        System.out.println();
    }

}

// Set has HashSet, LinkedHashSet:
// Implemented similar to List
