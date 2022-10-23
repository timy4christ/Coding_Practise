class ParentReferenceDemo{
    public static void main(String[] args) {
        First f = new Second();
        f.fun1();
        f.fun2(); // child class fun2 is call
        f.f3();  // cannot find f3 in Type First

        // Second s = new First(); // cannot convert First type to Second type
    }
}

abstract class First{
    void fun1(){
        System.out.println("fun1 of First Class");
    }

    void fun2(){ // overridden
        System.out.println("fun2 of First");
    }
}

class Second extends First{
    void fun2(){ // overridding
        System.out.println("fun2 of Second Class");
    }

    void fun3(){
        System.out.println("fun3 of Second");
    }
}
