import java.io.*;
// import java.util.*;

class BufferStreamDemo {

    public static void main(String[] args) throws IOException {
        File fin = new File("D:\\CDAC\\CDAC\\Self_Study\\Course_Practise\\Codes\\OOPJ\\Day17\\labCode\\source.txt");
        File fout = new File("D:\\CDAC\\CDAC\\Self_Study\\Course_Practise\\Codes\\OOPJ\\Day17\\labCode\\dest.txt");

        if (!fin.exists()) {
            System.out.println("File doesnt exist");
            return;
        }

        FileInputStream fis = new FileInputStream(fin);
        FileOutputStream fos = new FileOutputStream(fout);

        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        int ch;
        while ((ch = bis.read()) != -1) {
            bos.write(ch);
        }
        fis.close();
        bis.close();
        // fos.close(); // throws IOEception: Stream Closed
        bos.flush();
        bos.close();
        System.out.println("File Content has been copied to destination file");

    }

}