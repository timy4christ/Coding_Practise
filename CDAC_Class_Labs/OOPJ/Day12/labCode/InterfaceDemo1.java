interface MyInter {
    // int x; // must be initialised at declaration
    // x = 56; // not allowed
    int x = 45;

    void fun(); // the type is public
}

class InterfaceDemo1 implements MyInter {

    public void fun() {
        System.out.println("x = " + x);
        System.out.println("Implemented fun() in InterfaceDemo1");
    }

    public static void main(String[] args) {
        InterfaceDemo1 t = new InterfaceDemo1();
        t.fun();
    }
}
