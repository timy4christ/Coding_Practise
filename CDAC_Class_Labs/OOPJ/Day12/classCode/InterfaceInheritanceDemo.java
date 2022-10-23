
interface Interface1 {
    void fun1();
}

interface Interface2 extends Interface1 {
    void fun2();
}

interface Interface3 extends Interface1 {
    void fun3();
}

class InterfaceImplementation implements Interface3 {
    public void fun1() {
        System.out.println("fun1 of Interface1");
    }

    public void fun2() {
        System.out.println("fun2 of Interface2");
    }

    public void fun3() {
        System.out.println("fun3 of Interface3");
    }
}

class InterfaceInheritanceDemo {
    public static void main(String[] args) {
        Interface1 demo = new InterfaceImplementation();
        demo.fun1();
        demo.fun2();
        demo.fun3();


    }
}