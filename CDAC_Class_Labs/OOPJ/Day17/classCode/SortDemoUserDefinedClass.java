import java.util.*;

class Student implements Comparable<Student> {
    int x;

    Student(int x) {
        this.x = x;
    }

    public String toString() {
        return "" + x;
    }

    public int compareTo(Student l) {
        if (this.x < l.x)
            return -1;

        if (this.x > l.x)
            return 1;

        return 0;
    }

}

class test {
    public static void main(String[] agrs) {
        List<Student> l1 = new ArrayList<>();

        Student s1 = new Student(10);
        Student s2 = new Student(50);
        Student s3 = new Student(3);
        Student s4 = new Student(20);
        Student s5 = new Student(1);

        l1.add(s1);
        l1.add(s2);
        l1.add(s3);
        l1.add(s4);
        l1.add(s5);

        System.out.println("Before sort : " + l1);

        Collections.sort(l1);
        // calls String.valueOf(Object obj) ==> which inturns calls obj.toString() method

        System.out.println("After sort : " + l1);
    }

}