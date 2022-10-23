import java.util.*;

class Student {
    int roll;
    String name;
    double marks;

    Student() {
    }

    Student(int roll, String name, double marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        String s = roll + "   " + name + "   " + marks;
        return s;
    }
}

class test {

    static void printDetails(List<Student> myList) {
        Iterator<Student> it = myList.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            System.out.println(s);
        }
    }

    public static void main(String[] args) {

        List<Student> l1 = new ArrayList<>();
        
        Student s1 = new Student(1, "Timy", 49.5);
        l1.add(s1);
        l1.indexOf(s1);
        l1.add(new Student(2, "Manish", 65.0));

        System.out.println("\nl1 elements : ");
        Iterator<Student> it = l1.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            System.out.println(s); // will actually print Classname@HashCode
                                   // but here toString is overridden.
        }
        // System.out.println(l1);

        List<Student> l2 = new ArrayList<>();

        // add()
        Student s2 = new Student(3, "Souvick", 78.5);
        l2.add(s2);

        l2.add(new Student(4, "Srijeet", 65.0));

        System.out.println("\nl1 elements : ");
        printDetails(l2);

        // addAll()
        l1.addAll(l2);

        System.out.println("\nl2 elements after adding l2: ");
        printDetails(l1);

        // contains()
        boolean b = l1.contains(l2);
        System.out.println("\nl1.contains(l2) : " + b); // false
        System.out.println("l1.contains(s1) : " + l1.contains(s2));
        System.out.println();

        //remove()

        //contains()

        //containsAll()

        //override after using them raw to see the difference

    }
}
