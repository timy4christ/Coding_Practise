public class TryCatchFinally {
    public static void main(String[] args){
        int b = 0;
        int a  = 2;
        int res = 0;
        int arr[] = {5,6,7,8,9};
        try{
            res = a/b;

            try{
                System.out.println(arr[5]);
            }
            catch(ArithmeticException e){
                System.out.println("Arithmetic ");
            }
            catch(ArrayIndexOutOfBoundsException t){
                System.out.println("ArrayIndexOutOfBound");
            }
            finally{
                System.out.println("finally inner");
            }
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception is generated");
        }
        catch(ArrayIndexOutOfBoundsException t){
            System.out.println("ArrayIndexOutOfBound");
        }
        finally{
            System.out.println("Finally outer");
        }
    }
}
