import mypack1.*;
import mypack2.*;

class AccessSpecifierDemo {

    public static void main(String[] args) {
        System.out.println("===================Inside AccessSpecifierDemo==================");
        First f = new First();
        System.out.println("--------Calling myFun(public) of First Class--------");
        f.myFun();
        Second s = new Second();
        System.out.println("--------Calling myFun(public) of Second Class--------");
        s.myFun();
        Third t = new Third();
        System.out.println("--------Calling myFun(public) of Third Class--------");
        t.myFun();
        Fourth fourth = new Fourth();
        System.out.println("--------Calling myFun(public) of Third Class--------");
        fourth.myFun();
    }
}
