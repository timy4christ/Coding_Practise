class MyGen <T> {
    private T data;

    void setData(T data) {
        this.data = data;
    }

    T getData() {
        return data;
    }
}

class First{
    private int a;
    private int b;

    First(int a, int b){
        this.a = a;
        this.b = b;
    }

    public String toString(){
        return ("First [" + a + ", " + b + "]");
    }
}

class MyGenDemo {
    public static void main(String[] args) {
        MyGen<Integer> mg1 = new MyGen<Integer>();
        mg1.setData(5);
        int num = mg1.getData();

        System.out.println("num : " + num);

        MyGen<String> mg2 = new MyGen<String>();
        mg2.setData("HELLO");
        String sentence = mg2.getData();

        System.out.println("sentence : " + sentence);

        MyGen<First> mg3 = new MyGen<First>();
        mg3.setData(new First(15,20));
        
        First f = mg3.getData();

        System.out.println("f : " + f);

        mg1 = mg2; //type safe
    }
}