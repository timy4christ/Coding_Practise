import java.util.*;

class ArraysClassMethodsDemo {
    public static void main(String[] args) {

        int arr[] = { 5, 100, 35, 22, 61 };

        System.out.print("Elements of array : ");
        for (int x : arr)
            System.out.print(x + " "); // 5 100 35 22 61
        System.out.println();

        // sorting
        // Arrays.sort(arr);
        // System.out.print("After sorting : ");
        // for (int x : arr)
        // System.out.print(x + " ");
        // System.out.println();

        // sorting specific indexes range
        // Arrays.sort(arr,2,5);
        // System.out.print("After sorting from index 2 to 4 : ");
        // for (int x : arr)
        // System.out.print(x + " ");
        // System.out.println();

        // fill()
        // Arrays.fill(arr,1);
        // System.out.print("After filling all elements with 1 : ");
        // for (int x : arr)
        // System.out.print(x + " ");
        // System.out.println();

        // filling specific range of array
        // Arrays.fill(arr, 1, 4, 1);
        // System.out.print("After filling all index 1 to 3 with 1 : ");
        // for (int x : arr)
        //     System.out.print(x + " ");
        // System.out.println();

        // toString method
        String s = Arrays.toString(arr); // [5, 100, 35, 22, 61]
        System.out.println(s);

    }

}
