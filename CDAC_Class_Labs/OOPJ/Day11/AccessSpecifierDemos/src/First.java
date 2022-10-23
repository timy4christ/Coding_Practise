package mypack1;

public class First{ // made public to be accessed out of this package mypack1

    public int a = 20;
    private int b = 50;
    int c=30;
    protected int d = 60;

    // void myFun(){ // default: wont be accessible outside mypack1
    //     System.out.println("=================Inside First Class==================");
    //     System.out.println("public member a= " + a);
    //     System.out.println("private member b= " + b); 
    //     System.out.println("default member b= " + c); 
    // }

    public void myFun(){  // public so will be accessible anywhere even out of mypack1
        // all data memebers are accessible within this function 

        System.out.println("=================Inside First Class==================");
        System.out.println("public member of First Class a= " + a);
        System.out.println("private member of First Class b= " + b); 
        System.out.println("default member of First Class b= " + c); 
        System.out.println("protected member of First Class b= " + d); 
    }
}

