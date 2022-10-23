class SuperKeywordWithConstructor {

    public static void main(String[] args) {
        System.out.println("============Parameterless Constructor Call of Child Class===================");
        Child c1 = new Child(); // first calls parent constructor with 0 args
        // and then child constructor with 0 args
        System.out.println();
        System.out.println("=============2 arg Constructor Call Of Child Class===================");
        Child c2 = new Child(2, 3); // first implicitally calls parent constructor 0 args
                                    // and then child constructor with 2 args i

        // Child c3 = new Child(100); //erro : bcz no single argmt constructor in Child
        // class
    }
}

class Parent {
    int p;

    Parent() {
        System.out.println("Parent Constructor with no parameter");
    }

    Parent(int a) {
        System.out.println("Parent Constructor with 1 parameters");
        this.p = a;
    }

    Parent(int a, int b) {
        System.out.println("Parent Constructor with 2 parameters");
    }
}

class Child extends Parent {

    int c;

    Child() {
        // super(); //by default this is the first statement: a call to default/
        // parameterless constructor
        System.out.println("Child Constructor with no arguments");
    }

    Child(int a, int b) {
        //super(); //this would have been default id super(a) was not written
        super(a); // this must be the first statement // this calls the parent 1 argmt constructor
        this.c = b;
        //this(); : must be the first statement
        System.out.println("Child Constructor with two arguments");
    }
}