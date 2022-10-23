class ConstructorCallingDemo {

    public static void main(String[] args) {
        Child c1 = new Child();
        System.out.println("c1.p = " + c1.p);
        System.out.println("c1.c = " + c1.c);
    }

}
class Parent {

    int p;

    Parent() {
        System.out.println("Constructor of Parent Class");
        p = 1;
    }
}
class Child extends Parent {

    int c;

    Child() {
        System.out.println("Constructor of Child Class");
        c = 2;
    }
}