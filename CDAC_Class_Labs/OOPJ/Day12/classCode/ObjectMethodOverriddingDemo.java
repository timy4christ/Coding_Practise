
package classes;

class Demo {
    int a;
    int b;

    Demo() {
    }

    Demo(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void fun1() {
        System.out.println("fun1 of Demo");
    }

    public String toString() { // overriding toString() of Object class
        String str = "Demo[a = " + a + ", b = " + b + "]";
        return str;
    }

    public boolean equals(Object obj) { // overridding equals() of Object Class
        if (this.a == ((Demo) obj).a && this.b == ((Demo) obj).b)
            return true;
        else
            return false;
    }

    public int hashCode() {
        return 31 * (a + b); // this is not the correct way to generate the hashCode method.
    }
}

class ObjectMethodOverridingDemo {
    public static void main(String[] args) {
        Demo d1 = new Demo(5, 10);
        System.out.println("Overridden ==> d1 : " + d1); // implicitally d1.toString() gets called but this method is
                                                         // overridden

        Demo d2 = new Demo(5, 10);
        System.out.println("Overridden ==> d1.equals(d2) : " + d1.equals(d2));
        System.out.println("d1.hashCode() returns : " + d1.hashCode());
        System.out.println("d2.hashCode() returns : " + d2.hashCode());
    }
}