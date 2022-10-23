class GenericDemo{
    public static void main(String[] args){
        TwoNumbers <Integer> tn1 = new TwoNumbers <Integer> (12,16);
        double dres = tn1.add();
        System.out.println(dres);

        int ires = (int)tn1.add();
        System.out.println(ires);
    }
}

class TwoNumbers <T extends Number> {
    T a;
    T b;

    TwoNumbers(T num1, T num2){
        a = num1;
        b = num2;
    }
    double add(){
        double res = a.doubleValue() + b.doubleValue();
        return res;
    }
}