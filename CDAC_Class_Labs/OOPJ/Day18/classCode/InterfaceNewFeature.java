interface MyInterface{
    
    public abstract void fun1();

    static void fun2(){
        System.out.println("MyInterFace fun2 static implementation");
    }
    
    default void fun3(){
        System.out.println("MyInterface fun3 default implementation");
    }
}

class Demo implements MyInterface{
    static void fun2(){
        System.out.println("MyInterFace fun2 static implementation overriden in fun2");
    }
    public void fun1(){
        System.out.println("fun1 implemented in Demo");
    }
    public void fun3(){
        System.out.println("MyInterface fun3 default implementation overriden in Demo");
    }
}

class InterfaceNewFeature {
        public static void main(String[] args) {
            MyInterface.fun2();

            MyInterface d = new Demo();
            d.fun3();
            Demo.fun2();

            // MyInterface.fun3();
        }
}
