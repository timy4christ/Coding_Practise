import java.net.SocketPermission;
import java.util.*;

class ListWithoutType {
    public static void main(String[] args) {

        List list1 = new ArrayList(); // old and unrecommended method

        list1.add(1);
        list1.add(10.5);
        list1.add("hello");

        int a = list1.get(1); // returns type object

        System.out.println(a);

    }

}