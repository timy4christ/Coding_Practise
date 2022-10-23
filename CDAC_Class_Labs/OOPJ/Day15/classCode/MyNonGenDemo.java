class MyNonGen{

    private Object data;

    void setData(Object data){
        this.data = data;
    }

    Object getData(){
        return data;
    }
}


public class MyNonGenDemo {
    public static void main(String[] args) {
        MyNonGen mng1 = new MyNonGen();
        mng1.setData(56); // AutoBoxing: Object data = new Integer(5)
        int a = (Integer)(mng1.getData()); // Integer = Object; child = parent
        System.out.println(a);
        
        MyNonGen mng2 = new MyNonGen();
        mng2.setData("Welcome");    // Object data = "welcome"
        // mng2.setData(10);    // Object data = "welcome"
        
        String s = (String)(mng2.getData()); // String  = Object; child = parent 
        System.out.println(s);

        //mng2 = mng1; //No type Safety : possible 
    }
}
