class ExampleOfAbstractClass{ 
    public static void main(String[] args) {
        Shape[] s = new Shape[3];
        s[0] = new Rectangle(4,5);
        s[1] = new Square(8);
        s[2] = new Circle(5);    

        for(int i=0; i < s.length; i++){
            s[i].calArea();
            s[i].printArea();
        }
    }
}

abstract class Shape{
    double area;
    abstract void calArea();

    double getArea(){
        return area;
    }

    void printArea(){
        System.out.println("Area: " + area);
    }
}

class Circle extends Shape{
    double radius;

    Circle(){}

    Circle(double r) { radius = r; }

    void calArea(){
        area = (Math.PI * radius * radius);
    }
}

class Rectangle extends Shape{
    double l, b;

    Rectangle(){ }

    Rectangle(double l, double b){
        this.l = l;
        this.b = b;
    }
    void calArea(){
        area = l * b;
    }

}

class Square extends Shape{
    double side;
    Square(){ }

    Square(double l) { side = l; }

    void calArea(){
        area = side * side;
    }
}

