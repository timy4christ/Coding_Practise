class MethodHidingDemo{
    public static void main(String[] args) {
        First f = new Second();
        //System.out.println(f.num); // Output : 5, member variables are statically binded
    
        ((Second)f).print(); // casting
    }
}

class First{
    int num=5;
}

class Second extends First{
    int num = 10;

    void print(){
        System.out.println("Inside print of Second Class");
        System.out.println("this.num = " + this.num);
        System.out.println("super.num = " + super.num);
    }
}
