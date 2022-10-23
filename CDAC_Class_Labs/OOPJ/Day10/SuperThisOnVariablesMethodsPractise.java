class SuperThisOnVariablesMethodsPractise {

    public static void main(String[] args) {
        Parent obj = new Child();
        obj.f1();
    }

}

class Parent {
    int z;
    void f1() {
        System.out.println("Class Parent : f1");
    }

    void f2() {
        System.out.println("Class Parent : f2");
    }
}

class Child extends Parent {
    int z;
    void f1() {
        System.out.println("Class Child : f1");
        //super.f1();
    }

    void f2() {
        int z;
        z=6; // local
        this.z=10; // instance z of Child class 
        super.z=25; // instance z of Child class inherited from Parent class
    }
}
