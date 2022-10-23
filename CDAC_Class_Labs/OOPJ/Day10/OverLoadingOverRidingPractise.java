class OverLoadingOverRididngPractise {

    public static void main(String[] args) {
        new Child().f1(); // Class Child : f1
        new Child().f2(); // Class Parent : f2
        new Child().f2(5); // Class Child : f2
    }

}

class Parent {
    void f1() { // method overridden
        System.out.println("Class Parent : f1");
    }

    void f2() {
        System.out.println("Class Parent : f2");
    }
}

class Child extends Parent {

    void f1() { // method overriding
        System.out.println("Class Child : f1");
    }

    void f2(int x) { // method overloading
        System.out.println("Class Child : f2");
    }
}
