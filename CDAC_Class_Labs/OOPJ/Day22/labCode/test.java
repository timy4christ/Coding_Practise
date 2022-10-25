abstract class Demo{
    private void add(int x, int y){
        System.out.println("Allowed");
    }

    void accessMe(){
        add(5,6);
    }
}

class test extends Demo{
    public static void main(String[] args){
        Demo d = new test();
        d.accessMe();
    }
}