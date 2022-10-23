import java.util.*;

class Student {
    int x;

    Student(int x) {
        this.x = x;
    }

    public String toString() {
        return "" + x;
    }

}

class HetrogeneousCollection {
    public static void main(String[] agrs) {
        List l1 = new ArrayList();

        Student s1 = new Student(10);
        Student s2 = new Student(50);

        l1.add(s1);
        l1.add(s2);
        l1.add(1.89); // they are not type safe
        l1.add("Rohit"); 

        System.out.println(l1);

        Student s = l1.get(2); // it returns Object type,
        //so type compatibility error is seen
    }

}