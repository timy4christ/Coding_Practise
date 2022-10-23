class Parent{
    void fun1(){
        System.out.println("in child fun1");
    }
}

class Child extends Parent{

    void fun1(){
        System.out.println("in child fun1");
    }
    void fun2(){
        System.out.println("in child fun2");
    }
}

class Third{
    void fun3(){
        System.out.println("in third fun3");
    }
}

class NonPrimitiveTypeCasting {
    public static void main(String args[]) {
        System.out.println("In main");
        Parent p = new Parent();
        Child c = new Child();
        Third t = new Third();
        // p = c; // upcasting, automatic widening
        //p = (Parent)c; //explicit upcasting, OK
        // p.fun1(); // overridden fun1 is called
        // p.fun2(); // error : because fun2 is undefined in Parent
        
        ((Child)p).fun1(); // inline type casting
        
        // c = p; // CompileTime: Type is checked, Parent cannot be converted to Child ==> narrowing, is not implicit
        c = (Child)p; // not logically correct
        c.fun1(); // Runtime Error.
        // c.fun2();
        // p = t; // p and t are not compatible


        System.out.println("End of main");
    }
}