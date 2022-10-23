class Demo <T>
{
    void fun1(Demo<T> d){

    }

    void fun2(Demo<?> d){
        
    }

    void fun3(Demo<? extends Number> d){
        
    }

}

class WildCardGenericsDemo {
    public static void main(String[] args) {

        Demo<Integer>d1 = new Demo<Integer>();
        Demo<Double>d2 = new Demo<Double>();
        Demo<String>d3 = new Demo<String>();
        
        d1.fun1(d2);

    }
}
