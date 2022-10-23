import java.io.*;

class test {
    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Enter a number : ");
        String snum = br.readLine();

        System.out.print("Enter a floating point number : ");
        String sdval = br.readLine();

        System.out.print("Enter a name : ");
        String sname = br.readLine();

        System.out.print("Enter a boolean : ");
        String sbool = br.readLine();

        int num = Integer.parseInt(snum);
        double dval = Double.parseDouble(sdval);
        boolean bool = Boolean.parseBoolean(sbool);

        System.out.println("\nThe input number is: " + num);
        System.out.println("The input floating number is: " + dval);
        System.out.println("The input name is: " + sname);
        System.out.println("The input boolean is: " + bool);

        br.close();
    }
}
