class AbstractDemo{
    public static void main(String[] args) {
        // new Demo(); // CE: Demo is abstract, cannot be instantiated
    }

}

/*
class Demo{ //Demo is not abstract and does not override abstract method myFun() in Demo
    // abstract void myFun(){ // CE: abstract methods cannot have a body
    //     System.out.println("myFun of First");
    // }

    // abstract void myFun(){} // CE: no braces also allowed
    abstract void myFun();  // 

    void anotherFun(){ //allowed
        System.out.println("Another is a concrete method");
    }
} */


abstract class Demo2{ // cannot be instantiated

    int a;
    int b;
    /*abstract void myFun(){ // CE: abstract methods cannot have a body
        System.out.println("myFun of First");
    }*/

    // abstract void myFun(){} // CE: no braces also allowed
    abstract void myFun();  // compulsory must be implemented in the child class
                            // if not overridden then the class that inherits must
                            // be abstract
    void anotherFun(){ //allowed
        System.out.println("Another is a concrete method");
    }
}

abstract class First extends Demo2{

}