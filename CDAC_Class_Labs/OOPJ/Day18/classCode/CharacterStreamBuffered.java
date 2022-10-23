import java.io.*;

class CharacterStreamBufferedDemo {

    public static void main(String[] args) throws IOException {
        File fin = new File("D:\\CDAC\\CDAC\\Self_Study\\Course_Practise\\Codes\\OOPJ\\Day18\\classCode\\source.txt");
        File fout = new File("D:\\CDAC\\CDAC\\Self_Study\\Course_Practise\\Codes\\OOPJ\\Day18\\classCode\\dest.txt");

        if (!fin.exists()) {
            System.out.println("File doesnt exist");
            return;
        }

        FileReader fr = new FileReader(fin);
        // Method 1:
        FileWriter fw = new FileWriter(fout); // creats a new file and
        // if already exist overwrites the content

        BufferedReader br = new BufferedReader(fr);
        BufferedWriter bw = new BufferedWriter(fw);
        int ch;
        while ((ch = br.read()) != -1) {
            bw.write(ch);
        }

        fr.close();
        fw.close();
        System.out.println("File Content has been copied to destination file");

    }

}