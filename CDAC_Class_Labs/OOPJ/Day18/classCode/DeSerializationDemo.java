import java.io.*;

class Demo implements Serializable {
    int a;
    String s;
    double d;

    Demo() {
    }

    Demo(int a, String s, double d) {
        this.a = a;
        this.s = s;
        this.d = d;
    }

    public String toString() {
        return "Demo[a = " + a + ", s = " + s + ", d = " + d + "]";
    }
}

class DeSerializationDemo {

    public static void main(String[] args) throws ClassNotFoundException,IOException {
       
        FileInputStream fos = new FileInputStream("myobjects.txt");

        ObjectInputStream ois = new ObjectInputStream(fos);
        Demo d = (Demo)ois.readObject(); // returns Object Type
        ois.close();

        System.out.println("Object of class Demo deserialised from the Secondary Storage");
		System.out.println("Object state: " + d);
    }
}