class SingleCatchMultipleException {
    public static void main(String[] args){
        int b = 0;
        int a  = 2;
        int res = 0;
        int arr[] = {5,6,7,8,9};
        try{
            res = a/b;
            System.out.println(arr[5]);
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
