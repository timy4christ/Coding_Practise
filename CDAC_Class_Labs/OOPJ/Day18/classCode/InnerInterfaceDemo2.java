interface MyInterface{
    void fun1();
    interface AnotherInterface{
        void fun2();
    }
}

class First implements MyInterface{
    public void fun1() { 
        System.out.println("fun1 of First");
    }
    public void fun2(){
        System.out.println("fun2 of First");
    }
}

class Second extends First implements MyInterface.AnotherInterface{
    public void fun2(){
        System.out.println("fun2 of Second");
    }
}

class InnerInterfaceDemo2{

    public static void main(String[] args) {
        First f = new First();
        f.fun1();
        f.fun2();

        Second s = new Second();
        s.fun2();
    }
}
