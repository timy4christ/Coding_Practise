class Demo implements Cloneable{
    int b;

    Demo() {
    }

    Demo(int b) {
        this.b = b;
    }

	public Demo clone() throws CloneNotSupportedException{
		Demo dobj = (Demo)super.clone();
		return dobj;
	}

    public String toString() {
        return "Demo[b = " + b + "]";
    }
}

class First implements Cloneable {
    int a;
    Demo d;

    First() {

    }

    First(int a, Demo d) {
        this.a = a;
        this.d = d;
    }

    public First clone() throws CloneNotSupportedException {
        First f = (First) super.clone();
		f.d = d.clone();
        return f;
    }

    public String toString() {
        return "Demo[a =" + a + ", " + d + "]";
    }
}

class DeepCloning {
    public static void main(String[] args) throws CloneNotSupportedException {

        Demo d1 = new Demo(10);
        First f1 = new First(5, d1);

        // First f2 = f1;
        First f2 = f1.clone(); // creates a clone and passes t
        f2.a = 15;
		f2.d.b = 25;
        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);

    }
}