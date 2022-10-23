import java.util.*;

class CollectionsClassMethodsDemo {
    public static void main(String[] args) {

        Vector<Integer> v = new Vector<>();
        v.add(100);
        v.add(16);
        v.add(33);
        v.add(2);

        //sorting
        System.out.println("Before sorting : " + v); // [100, 16, 33, 2]
        Collections.sort(v); // sorts ascending order
        System.out.println("After sorting: " + v); // [2, 16, 33, 100]

        // // binary search without sorting gives wrong results
        // int x1 = Collections.binarySearch(v, 33);  // 2
        // int x2 = Collections.binarySearch(v, 100); // 3
        // int x3 = Collections.binarySearch(v, 51);  // < 0 
        // System.out.println("33 at index : " + x1);
        // System.out.println("100 at index : " + x2);
        // System.out.println("51 at index : " + x3); // a negative index as 51 is not in the list


        //reverse
        // System.out.println("Before reversing : " + v); //  [100, 16, 33, 2]
        // Collections.reverse(v);
        // System.out.println("After reversing : " + v); // [2, 33, 16, 100]

        //shuffle
        // Collections.shuffle(v);
        // System.out.println("After Shuffling : " + v); //output is a random shuffle of the list

        //swap
        // System.out.println("Before swapping : " + v); //  [100, 16, 33, 2]
        // // Collections.swap(v,1,4); // ArrayIndexOutOfBoundsException
        // Collections.swap(v,1,3);
        // System.out.println("Swapping index 1 with index 3 : " + v);
    }

}
