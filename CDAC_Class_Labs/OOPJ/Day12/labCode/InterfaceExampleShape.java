class InterfaceExampleShape{
	public static void main(String[] args){
		double area;
		
		Circle cir = new Circle(2.45);
		area = cir.calArea();
		cir.printArea(area);
	}
}

interface Shape{
	//double area; // public,final,static
	
	double calArea(); // public , absract 
	void printArea(double area); // public, abstract
}

class Circle implements Shape{
	
	double radius;
	
	Circle(double radius){ this.radius = radius; }
	
	public double calArea(){
		return Math.PI * radius * radius;
	}
	
	public void printArea(double area){
		System.out.println("Area: " + area);
	}
	
}