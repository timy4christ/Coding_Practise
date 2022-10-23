
import java.util.*;

class CollectionsSortDemo {
    public static void main(String[] agrs) {
        List<Integer> l1 = new ArrayList<>();

        l1.add(10);
        l1.add(2);
        l1.add(6);
        l1.add(3);

        System.out.println("Before sort : " + l1); // [10, 2, 6, 3]

        Collections.sort(l1);

        System.out.println("After sort : " + l1); // [2, 3, 6, 10]
    }

}