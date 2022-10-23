package mypack1;

public class Third { //purpose to check accessiblility of Class First members within same package
    public void myFun() {
        
        System.out.println("=================Inside Third Class in the same package as First Class==================");
        First f = new First();
        System.out.println("--------------Trying to access members of First Class-------------------");
        System.out.println("public member of First Class a= " + f.a);
        // System.out.println("private member of First Class b= " + f.b); // b is private of member of First class(unaccessible)
        System.out.println("default member of First Class c= " + f.c); 
        System.out.println("protected member of First Class b= " + f.d);
    }
}
