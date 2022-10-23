import java.io.IOException;

class test {
    public static void main(String args[]) throws IOException {
        System.out.println("In main");
        try {
            myFun1();
        } catch (ArrayIndexOutOfBoundsException ae) {

        }
        // catch(ArithmeticException e){

        // }
        // catch(IOException e){
        // System.out.println("In IOException catch block: " + e.getMessage());
        // }
        System.out.println("Hello");
    }

    public static void myFun1() throws IOException {
        myFun2();
    }

    public static void myFun2() throws IOException {

        System.out.println("In myFun");
        try {
            throw new IOException();
            // throw new ArithmeticException();
        } catch (ArrayIndexOutOfBoundsException ae) {

        }
        // catch(ArithmeticException z){

        // }
        // catch(IOException e){
        // System.out.println("In IOException catch block");
        // // throw e;
        // }

        // res = a/b;
    }
}