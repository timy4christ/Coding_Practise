public class StackTraceDemo {
    public static void fun3() {
        System.out.println("In fun3");
        int res = 5 / 0;
        System.out.println("Out fun3");
    }

    public static void fun2() {
        System.out.println("In fun2");
        fun3();
        System.out.println("Out fun2");
    }

    public static void fun1() {
        System.out.println("In fun1");
        fun2();
        System.out.println("Out fun1");
    }

    public static void main(String args[]) {
        System.out.println("In main");
        try {
            fun1();
        } catch (ArithmeticException ae) {
            System.out.println("Exception caught");
            ae.printStackTrace();
        }
        System.out.println("End of main");
}
