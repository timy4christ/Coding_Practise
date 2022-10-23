import java.io.*;

class FileStreamDemo {

    public static void main(String[] args) throws IOException {
        File fin = new File("D:\\CDAC\\CDAC\\Self_Study\\Course_Practise\\Codes\\OOPJ\\Day17\\labCode\\source.txt");
        File fout = new File("D:\\CDAC\\CDAC\\Self_Study\\Course_Practise\\Codes\\OOPJ\\Day17\\labCode\\dest.txt");

        if (!fin.exists()) {
            System.out.println("File doesnt exist");
            return;
        }

        FileInputStream fis = new FileInputStream(fin);
        // Method 1:
        FileOutputStream fos = new FileOutputStream(fout); // creats a new file and
        // if already exist overwrites the content

        // Method 2:
        // FileOutputStream fos = new FileOutputStream(fout, true); // creats and
        // appends to the existing file

        // Method 3:
        // FileOutputStream fos = new
        // FileOutputStream("D:\\CDAC\\CDAC\\Self_Study\\Course_Practise\\Codes\\OOPJ\\Day17\\labCode\\dest.txt")

        int ch;
        while ((ch = fis.read()) != -1) {
            fos.write(ch);
        }

        fis.close();
        fos.close();
        System.out.println("File Content has been copied to destination file");

    }

}