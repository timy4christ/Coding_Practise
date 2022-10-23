class FinalDemo{
    public static void main(String[] args) {
        final int a = 16;
        // a = 35; //error
    }

}

final class First{
    final int a;
    First(){
        a = 15; // first time initialization allowed
       // a = 46; //error
    }

    final void myFun(){
        System.out.println("myFun of First");
    }


}

class Second extends First { // cannot inherit final First
    // void myFun(){ // error becasue its overriden method is final
    //     System.out.println("myFun of Second");
    // }
}