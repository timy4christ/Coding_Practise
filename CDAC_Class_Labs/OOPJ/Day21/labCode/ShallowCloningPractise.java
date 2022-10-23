class Demo{
	
	int d;
	
	Demo() {}
	
	Demo(int d){
		this.d = d;
	}
}

class First implements Cloneable {
	
	int x;
	Demo d;
	
	First() {}
	
	First(int x, Demo d){
		
		this.x = x;
		this.d = d;	
	}
	
	protected First clone()throws CloneNotSupportedException {
		First f = (First)super.clone(); // calls the clone() method of Object class
		return f;
	}
	
	public String toString(){
		return "First[x = " + x + ", d = " + this.d.d + "]"; 
	}
	
}



class ShallowCloningPractise {
	
	public static void main(String[] args){
	
		try{
			Demo d1 = new Demo(25);
			First f1 = new First(5,d1);
			
			// First f2 = f1.clone();
			// if clone() is not overridden then this statement is not allowed because clone() of Object have protected access

			First f2 = f1.clone();
			
			f2.x = 10;
			f2.d.d = 100; // effects the value of d in Demo and this is reflected in f1 and f2 both
			
			System.out.println(f1);
			System.out.println(f2);
		}

		catch(CloneNotSupportedException ce){
			ce.printStackTrace();
		}
		
	}
	
}