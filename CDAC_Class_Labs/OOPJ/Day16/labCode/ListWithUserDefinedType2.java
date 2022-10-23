// with overridden toString(), equals(), hashCode() methods for ensuring deep comparision;

import java.util.*;

class Student{
	int roll;
	String name;
	double marks;
	
	Student(){
		roll = 0;
		String name = "";
		marks = 0.0;
	}	
	
	Student(int roll, String name, double marks){
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	
	public String toString(){
		return "Student[" + roll + ", " + name + ", " + marks + "]";
	}
	
	public int hashCode(){
		return roll*(int)marks;
	}
	
	public boolean equals(Object o){ // Object o will hold the students type reference
		Student s = (Student)o; // and so its logically correct to typecast Object(parent) to Student(child)
		// System.out.println("In equals()");
		if(s == null)
			return false;
		
		if(this.roll == s.roll && this.name.equals(s.name) && this.marks == s.marks){
			
			return true;
		}
		else
			return false;
	}
}

class ListWithUserDefinedType2{
	
	public static void print(List<Student> l){
		Iterator<Student> it = l.iterator();
		while(it.hasNext()){
			Student s = it.next();
			System.out.println(s); //reference
		}
	}

	public static void main(String[] args){
	
		List<Student> l1 = new ArrayList<>();
		
		Student s1 = new Student(1,"Srijeet",85.65);
		Student s2 = new Student(2,"Shubham",89.26);
		l1.add(s1);
		l1.add(s2);
		l1.add(new Student(3,"Tushar",88.56));
		
		System.out.println("\nL1 elements : ");
		print(l1);
		
		// System.out.print(l1); // [Student@2a139a55, Student@15db9742, Student@6d06d69c]
		
		List<Student> l2 = new ArrayList<>();
		Student s3 = new Student(3,"Shubham",85.26); 
		l2.add(s3);
		l2.add(new Student(4,"Rajesh",53.6));
		
		System.out.println("\nL2 elements : ");
		print(l2);
		
		// l1.add(l2); // error
				
		// addAll()
		l1.addAll(l2);
		System.out.println("\nL1 elements after l1.addAll(l2) : ");
		print(l1);
		
		// contain() , containsAll() ==> calls equals() method of Object Class so, Shallow Comparision
		/*System.out.println("\nl1.contains(s2) : "+ l1.contains(s2)); //true
		System.out.println("l2.contains(s1) : "+ l2.contains(s1)); //false
		System.out.println("l1.contains(s3) : "+ l1.contains(s3)); //true */
			
		Student s4 = new Student(1,"Srijeet",85.65); // this not a part of any List
		System.out.println("\ns4 contains : " + s4);
		System.out.println("l1.contains(s4) : "+ l1.contains(s4)); //false : because reference is bring compared not the content
		System.out.println();
		System.out.println("l1.contains(s2) : "+ l1.contains(s2)); 
		System.out.println();
		System.out.println("l2.contains(s1) : "+ l2.contains(s1)); 
		System.out.println();
		System.out.println("l1.contains(s3) : "+ l1.contains(s3)); 
		//System.out.println("l2.contains(s1) : "+ l2.contains(s1)); 
		
		// System.out.println("\nl1.contains(s2) : "+ l1.contains(s4));
		
		System.out.println("hashCode of s1 : " + s1.hashCode());
		System.out.println("hashCode of s2 : " + s2.hashCode());
		System.out.println("hashCode of s3 : " + s3.hashCode());
		System.out.println("hashCode of s4 : " + s4.hashCode());
		
		
		System.out.println(b);
		
	}
}