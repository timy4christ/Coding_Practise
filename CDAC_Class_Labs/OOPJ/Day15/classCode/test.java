abstract class MyClass<T1>
{
	
	abstract void myFun1(T1 a);
	// {
	// 	System.out.println(a);
	// }
}

class First<T> extends MyClass<T1>	//generic First class 
{
	void myFun1(Integer a)
	{
		//super.myFun(5);							//directly you can call the method of parent class by using super.
		System.out.println(a);
	}
}

class Main
{
	public static void main(String[] args)
	{
		First<String>f = new First<String>();
		f.myFun1(2);
		/*MyClass<Integer>m = new MyClass<Integer>();		//this is also one of the method to create object seperately .
		m.myFun(5);*/
	}
}