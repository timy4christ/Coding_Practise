/*
    *    
   ***   
  *****  
 ******* 
*********
   
 */
class P7 {
    public static void main(String[] args) {

        int n = 5;
        // left half
        for (int i = 1; i <= n; i++) {

            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // stars
            // for left half pyramid part
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }

            // for right half pyramid part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}