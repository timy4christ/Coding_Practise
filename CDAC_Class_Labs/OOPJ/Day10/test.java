class AccessSpecifierDemo(){

    public static void main(String[] args){
        First f = new First();
        System.out.println(f.a);
        System.out.println(f.b);
    }
}

class First{

    public int a;
    private int b;

    void myFun(){

    }
}



