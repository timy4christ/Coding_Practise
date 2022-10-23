import java.io.*;
import java.util.*;

class test {
    public static void main(String[] args) {
        File f = new File("D:\\CDAC\\CDAC\\Self_Study\\Course_Practise\\Codes\\OOPJ\\Day17\\classCode");

        if (f.exists()) {
            System.out.println("exists");

            if (f.isDirectory()) {
                System.out.println("It is a directory and the files inside it is : ");
                
                String[] filename = f.list();
                System.out.println(Arrays.toString(filename));

                File[] fobj = f.listFiles();
                
                for(File file: fobj){

                    if(file.isDirectory()){
                        System.out.println(file.getName() + " is a Directory");
                    }
                    else
                        System.out.println(file.getName() + " is a file");
                }
            } else
                System.out.println("It is a file");
        } else 
            System.out.println("File doesnt Exist");

    }
}