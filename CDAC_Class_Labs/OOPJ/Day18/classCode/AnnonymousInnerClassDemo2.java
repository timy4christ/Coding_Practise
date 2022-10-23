interface MyInterface{
    void myFun1();
    void myFun2();
}

class AnnonymousInnerClassDemo2 {
    public static void main(String[] args) {
        MyInterface  mif1 = new MyInterface(){
            public void myFun1(){
                System.out.println("myFun1 of anonymout inner class");
            }

            public void myFun2(){
                System.out.println("myFun2 of anonymous inner class");
            }
        };

        mif1.myFun1();
        mif1.myFun2();

        MyInterface mif2 = mif1;
        mif2.myFun1();
        mif2.myFun2();
        // anonymous child class of MyClass
        test t = new test(){
            public void fun3(){
                System.out.println("fun3 is of class");
            }
            
        };
        t.fun3();
        
    }
}