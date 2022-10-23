class MethodLocalInnerClassDemo{

    public static void myFun(){

        System.out.println("myFun of MethodLocalInnerClassDemo");

        class MyClass{
            int add(int a, int b){
                return a + b;
            }
        }
        // object must be inside the function itself
        MyClass myObj1 = new MyClass();

        int res = myObj1.add(5,10);
        System.out.println("Sum is : " + res);

    }




    public static void main(String[] args) {
        myFun();        
    }
}