// Method Overriding : Covarient Type

class First {
}

class Second extends First {
}

class Third {
}

class Demo {

    First myFun() { // non primitive
        First f = new First();
        return f;
    }

    long myFunPrimitve() { // non primitive
        return 10;
    }

}

class Demo1 extends Demo {

    Second myFun() { // Second as return type is allowed as Second is subtype of First.
        Second s = new Second();
        return s;
    }

    // Third myFun(){ // will give error as Third is not subtype of First class
    // //code
    // }

    int myFunPrimitve() { // non primitive type dont have covarient
        return 10;
    }

}