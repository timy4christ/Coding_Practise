interface MyInterface{
    void myFun1();
    void myFun2();
}

class AnnonymousInnerClass {
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
    }
}