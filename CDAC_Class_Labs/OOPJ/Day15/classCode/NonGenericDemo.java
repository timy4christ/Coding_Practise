class NonGenericDemo{
    public static void main(String[] args){
        TwoNumbers tn1 = new TwoNumbers(12,16);
        tn1.add();
    }
}

class TwoNumbers{
    int a;
    int b;

    TwoNumbers(int num1, int num2){
        a = num1;
        b = num2;
    }
    void add(){
        int res = a + b;
        System.out.println(res);
    }
}