class First {
    void fun() {
        System.out.println("fun of First");
    }

    void fun1() {
        System.out.println("fun1 of First");
    }
}

class Second extends First {
    void fun() {
        System.out.println("fun of Second");
    }

    void fun2() {
        System.out.println("fun2 of Second");
    }
}

class Third {
    void fun() {
        System.out.println("fun of Third");
    }
}

class TypeCasting {
    public static void main(String args[]) {
        First f = new First();
        Second s = new Second();
        Third t = new Third();

        // f.fun(); //parent fun()
        // s.fun();
        // t.fun();

        // f = s; // f = s; is also fine; Upcasting
        // f.fun1();
        // f.fun();
        // f.fun2(); // error: becuase fun2 is not of type f;
        // s.fun();
        // t.fun();
        // f = (First)t; //Error, as there is no inheritance relationship between First
        // and Third

        // s = f; //Error, child ref = parent obj

        // s = (Second)f; //No compilation error, but runtime error :ClassCastException:
        // First cannot be //cast to Second
        // s.fun();

        // ((Second) f).fun(); // RuntimeError: first cannot be converted to second
        f.fun();

    }
}
