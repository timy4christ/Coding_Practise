// making use of superclass Constructor and getMessage;

import java.io.IOException;

class MyCheckedException extends Exception {
    String mssg;

    MyCheckedException() {
        super("this is a default message");
    }

    public MyCheckedException(String mssg) {
        super(mssg);
    }
}

class UserDefinedException {
    public static void main(String args[]) {
        System.out.println("In main");

        try {
            // throw new MyCheckedException();
            throw new MyCheckedException("Usergenerated Exception message");
        } catch (ArithmeticException e) {

        } catch (MyCheckedException f) {
            System.out.println("Handled " + f.getMessage());
        }

        System.out.println("End of main");

    }
}