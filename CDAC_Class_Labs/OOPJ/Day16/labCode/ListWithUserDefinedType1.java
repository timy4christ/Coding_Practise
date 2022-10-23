// with overridden toString();

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
}

class ListWithUserDefinedType1{
	
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
		l2.add(new Student(4,"Shubham",76.26));
		l2.add(new Student(5,"Rajesh",53.6));
		
		System.out.println("\nL2 elements : ");
		print(l2);
		
		// l1.add(l2); // error
				
		// addAll()
		l1.addAll(l2);
		System.out.println("\nL1 elements after l1.addAll(l2) : ");
		print(l1);
		
		// contain() , containsAll() ==> calls equals() method so, Shallow Comparision
		System.out.println("\nl1.contains(s2) : "+ l1.contains(s2)); //true
		System.out.println("l2.contains(s1) : "+ l2.contains(s1)); //false
		System.out.println("\nl1.contains(l2) : "+ l1.contains(l2)); //false
		System.out.println("l1.containsAll(l2) : "+ l1.contains(l2)); //true
		
		// remove( ) : removes the reference of one element of the ArrayList at a time
		l1.remove(s1);
		//System.out.println(l1.remove(s1)); // removes s1 reference from l1 and returns boolean
		System.out.println("\nL1 after l1.remove(s1) : ");
		print(l1);
		System.out.println("Index of s2 after removing s1 from l1 : " + l1.indexOf(s2));
	}
}