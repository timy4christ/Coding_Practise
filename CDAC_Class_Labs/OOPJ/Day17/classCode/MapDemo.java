import java.util.*;

class Student{
    int age;
    String name;

    Student(int age, String name){
        this.age = age;
        this.name = name;
    }
}
class MapDemo {
    Map <Integer,Student> map1 = new HashMap <Integer,Student>();
    Student s1 = new Student(10, "Rohit");
    Student s2 = new Student(20,"Timy");

    map1.put(3,new Student(3,"Geeta",73.0,20));
		map1.put(4,new Student(3,"Sita",63.0,21));
		
		Student s=map1.get(3);
		System.out.println(s);


}
