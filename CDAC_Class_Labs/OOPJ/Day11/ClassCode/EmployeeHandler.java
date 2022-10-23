class EmployeeHandler{
	public static void main(String[] args){
		
		Employee emp1 = new Employee(1,"Timy A Sam",50000.0,"timy4christ@gmail.com","9842052386");
		Employee emp2 = new Employee(2,"Dany A Sam",90000.0,"danysam2000@gmail.com","7223024612");
		
		emp1.printDetails();
		emp2.printDetails();
	}
}

class ContactDetails{
	String email;
	String mobNo;
	ContactDetails(){}
	
	ContactDetails(String email, String mobNo){
		this.email = email;
		this.mobNo = mobNo;
	}
}

class Employee{
	int empId;
	String name;
	double salary;
	ContactDetails contDetails;
	
	Employee(){}
	
	Employee(int empId, String name, double salary, String email, String mobNo){
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		contDetails = new ContactDetails(email, mobNo);
	}
	
	void printDetails(){
		System.out.println(empId + "   " + name + "   Rs." + salary + "   " + contDetails.email + "   " + contDetails.mobNo);
	}
}