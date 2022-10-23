class MethodHidingDemo{
    public static void main(String[] args) {
        Second f = new Second();
        f.myFun();
        f.anotherFun();
    }
}

class First{
    static void myFun(){ //bound at compile time
        System.out.println("myFun of First");
    }

    void anotherFun(){ //overridden method
        System.out.println("anotherFun of First");
    }
}

class Second extends First{
    // static void myFun(){ // method hiding
    //     System.out.println("myFun of Second");
    // }

    void myFun(){ //CE: static method cannot be overridden
        System.out.println("myFun of First");
    }

    void anotherFun(){ //method overridding
        System.out.println("anotherFun of Second");
    }
}
