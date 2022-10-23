package mypack2;

import mypack1.*; 

public class Second {

    public void myFun() {
        
        System.out.println("=================Inside Second Class od mypack2==================");
        First f = new First();
        System.out.println("--------------Trying to access members of First Class from mypack2-------------------");
        System.out.println("public member of First Class a= " + f.a);
        // System.out.println("private member of First Class b= " + f.b); // private member b not accessible out of First Class
        // System.out.println("default member of First Class b= " + f.c); // default member b not accessible out of mypack1
        // System.out.println("protected member of First Class b= " + f.d);
    }
}
