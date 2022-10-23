class ContactDetails
{
	String email;
	String mobNo;
	
	ContactDetails() { }
	
	ContactDetails(String email, String mobNo) {
		this.email = email;
		this.mobNo = mobNo;
	}
}

class Employee
{
	int empId;
	String name;
	double salary;
	ContactDetails contDetails;
	
	Employee() { } 
	
	Employee(int empId, String name, double salary, String email, String mobNo){
		contDetails = new ContactDetails(email, mobNo);
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	
	void printDetails(){
		System.out.println(empId + "\t" + name + "\t" + salary + "\t" + contDetails.email + "\t" + contDetails.mobNo);
	}
}

class EmployeeHandler
{
	public static void main(String args[])
	{
		Employee emp1 = new Employee(1,"Rajesh Patil",50000.00,"rajeshp@gmail.com","9876543232");
		Employee emp2 = new Employee(2,"Mohit Sinha",45000.00,"mohits@gmail.com","9878987676");
		
		emp1.printDetails();
		emp2.printDetails();
	}
}

/*
1	Rajesh Patil	50000.00 	rajeshp@gmail.com	9876543232
2	Mohit Sinha	45000.00	mohits@gmail.com	9878987676
*/