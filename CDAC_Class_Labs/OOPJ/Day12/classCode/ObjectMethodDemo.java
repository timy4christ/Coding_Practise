
class Demo extends Object {
    int a;
    int b;
    Demo() {
    }

    Demo(int a) {
        this.a = a;
    }

    void fun1() {
        System.out.println("fun1 of Demo");
    }
}

class ObjectMethodDemo {
    public static void main(String[] args) {
        Demo d1 = new Demo(5);
        Demo d2 = new Demo(5);
        Demo d3 = d1;
        int arr[] = new int[5];

        System.out.println("d1.hashCode() returns : " + d1.hashCode()); // 705927765
        System.out.println("d2.hashCode() returns : " + d2.hashCode()); // 366712642
        System.out.println("d2 : " + d2); // internally gives call to d2.toString()

        System.out.println("d1.toString() returns : " + d1.toString()); // classes.Demo@2a139a55
        System.out.println("d2.toString() returns : " + d2.toString()); // classes.Demo@15db9742
        System.out.println("d2 : " + d2); // internally gives call to d2.toString()
        System.out.println("arr.toString() returns : " + arr.toString()); // [I@6d06d69c

        System.out.println("d1.equals(d2) returns : " + d1.equals(d2)); // false : comparision based on references
        System.out.println("d1.equals(d3) returns : " + d1.equals(d3)); // true : comparision based on references
    }
}