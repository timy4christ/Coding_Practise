class ThrowException {
    public static void main(String[] args) {
        int a = -1;
        try {
            try {
                if (a < 0) {
                    ArithmeticException ae = new ArithmeticException("Value cannot be negative");
                    throw ae;
                }
            } catch (Exception e) {
                System.out.println("Exception caught and thrown again");
                throw e;
            } finally {
                System.out.println("Finally is inner");
            }
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception is generated");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally outer");
        }
    }
}
