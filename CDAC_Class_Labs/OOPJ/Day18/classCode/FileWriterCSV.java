import java.io.*;
import java.util.*;

class Student {

    int roll;
    String name;
    double marks;

    Student() {
    }

    Student(int roll, String name, double marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return "Student[roll = " + roll + ", name = " + name + ", marks = " + marks + "]";
    }
}

class test {

    public static void main(String[] args) throws IOException {

        File fin = new File("D:\\CDAC\\CDAC\\Self_Study\\Course_Practise\\Codes\\OOPJ\\Day18\\classCode\\source.txt");

        if (!fin.exists()) {
            System.out.println("File doesnt exist");
            return;
        }

        FileReader fr = new FileReader(fin);

        BufferedReader br = new BufferedReader(fr);

        List<Student> studlist = new LinkedList<>();

        String line;
        while ((line = br.readLine()) != null) { // Line1: 1, Timy A Sam, 96.5

            line = line.trim(); // only space before 1 and after 96.5 is removed.

            String str[] = line.split(",");

            if (line.isEmpty())
                continue;

            int roll = Integer.parseInt(str[0]);
            String name = str[1];
            double marks = Double.parseDouble(str[2]);

            Student s = new Student(roll, name, marks);
            // System.out.println(s.hashCode());

            studlist.add(s);
        }

        br.close();

        FileWriter fw = new FileWriter("stud_details_out.txt");

        BufferedWriter bw = new BufferedWriter(fw);

        for (Student s : studlist) {
            s.marks += 5;
            String str = s.roll + ", " + s.name + ", " + s.marks + "\n";
            bw.write(str);
        }
        bw.flush();
        bw.close();

        System.out.println("File Content has been copied to destination file");
    }
}