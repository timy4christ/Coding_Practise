class OverridingDemo {

    public static void main(String[] args) {

        System.out.println("==================Parent Object===============");
        Parent p1 = new Parent();
        p1.myFun(100, 200);
        System.out.println("p1.p = " + p1.p);

        System.out.println("==================Child Object===============");
        Child c1 = new Child();
        c1.myFun(12, 13);
        System.out.println("c1.p = " + c1.p);
        System.out.println("c1.c = " + c1.c);
        System.out.println("p1.p = " + p1.p);

    }

}

class Parent {

    int p;

    void myFun(int x, int y) { // Overridden method
        System.out.println("myFun of Parent");
    }

    void anotherFun(int x) {
        System.out.println("anotherFun of Parent");
    }
}

class Child extends Parent {

    int c;

    void myFun(int x, int y) { // Overridding method
        System.out.println("myFun of Child");
        this.p = x;
        this.c = y;
        // super.p = 56;
    }

}