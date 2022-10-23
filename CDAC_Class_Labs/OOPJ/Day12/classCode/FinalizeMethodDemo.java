class FinalizeMethodDemo {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj = null; // null referencing
        Demo.myFun();
        Runtime.getRuntime().gc();
    }
}

class Demo {
    static void myFun() {
        First f = new First("first object"); // local reference
    }

    protected void finalize(){
        System.out.println("finalize of Demo Object");
    }

}

class First {

    String name;

    First() {
    }

    First(String name) {
        this.name = name;
    }

    protected void finalize() {
        System.out.println("Finalize method called for:" + name);
    }
}


