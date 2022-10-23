import java.io.*;
import java.util.*;

class test {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> l1 = new ArrayList<>(6);

        try {
            for (int i = 0; i < 6; i++)
                l1.add(sc.nextInt());
        } catch (Exception e) {
        }

        for (int i = 0; i < l1.size(); i++)
            System.out.print(l1.get(i));

    }
}