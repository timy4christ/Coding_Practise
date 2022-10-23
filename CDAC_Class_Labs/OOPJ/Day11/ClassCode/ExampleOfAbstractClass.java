class ExampleOfAbstractClass{ 
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(55,63);
        rect.printArea();
    }
}

abstract class Shape{
    int area;
    abstract void getArea();

    void printArea(){
        System.out.println("Area is : " + area);
    }
}

class Circle extends Shape{
    int radius;
    void getArea(){
        area = (int)(Math.PI * radius * radius);
    }
}

class Rectangle extends Shape{
    int l, b;

    Rectangle(){ }

    Rectangle(int l, int b){
        this.l = l;
        this.b = b;
    }
    void getArea(){
        area = l * b;
    }

}

class Square extends Shape{
    int side;
    void getArea(){
        area = side * side;
    }
}

