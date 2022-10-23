import java.io.IOException;

class MyCheckedException extends Exception {
    String mssg;

    MyCheckedException() {
        mssg = "This is default message";
        getMessage();
    }

    public MyCheckedException(String mssg) {
        this.mssg = mssg;
    }

    public String getMessage() {
        return mssg;
    }
}

class UserDefinedOverridenException {
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