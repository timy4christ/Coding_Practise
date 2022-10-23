class ThrowException {
    public static void main(String[] args){

        try{
            ArithmeticException ae = new ArithmeticException();
            throw ae;
        }
        catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("Arithmetic Exception/ ArrayIndexOutOfBoundsException is generated");
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Finally outer");
        }
    }
}
