abstract class Employee{

	private int id;
	private String name;
	
	Employee() { }
	
	Employee(int id, String name){ 
		this.id = id;
		this.name = name;
	}

	abstract double getSalary();
	
	void printDetails(){
		System.out.println("Employee id : " + id);
		System.out.println("Employee name : " + name);
	}
}

class RegularEmployee extends Employee {

	private double basicPay;
	
	RegularEmployee(){ }
	
	RegularEmployee(int id, String name, double basicPay){
		super(id,name);
		this.basicPay = basicPay;
	}

	double getSalary(){
		return basicPay * 1.7;
	}
	
	void printDetails(){
		super.printDetails();
		System.out.println("Employee totalSalary : " + getSalary());
	}
}

abstract class ContractBasedEmployee extends Employee{
	
	private int noOfYears; // instance variable
	
	ContractBasedEmployee(){}
	
	ContractBasedEmployee(int id, String name, double basicPay, int noOfYears){
		super(id,name,basicPay);
		this.noOfYears = noOfYears;
	}
	
	abstract int getNoOfYears();
	
	void printDetails(){
		super.printDetails();
		System.out.println("Employee Contract Years : " + getNoOfYears());
	}
}

class CbCdacEmployee extends ContractBasedEmployee{
	
	private double consolidatedSalary;
	
	CbCdacEmployee(){ }
	
	CbCdacEmployee(int id, String name, double basicPay, int noOfYears, double consolidatedSalary){
		super(id, name, basicPay, noOfYears);
		this.consolidatedSalary = consolidatedSalary;
	}
	
	double getSalary(){
		return consolidatedSalary;
	}
	
	int getNoOfYears(){
		return 
	}
	
	void printDetails(){
		
	}
}

class ThirdPartyEmployee{
	
	private double salary;
	
	double getSalary(){
	
	}
	
	int getNoOfYears(){
	
	}
	
	void printDetails(){
		
	}
}

class Main{
	public static void main(String[] args){
		
		RegularEmployee regEmp = new RegularEmployee(1,"Rohit",15000.00);
		
		CbCdacEmployee cbCdacEmp = new CbCdacEmployee(2,"Mohit",3,50000);
		
		ThirdPartyEmployee thirdPartyEmp = new ThirdPartyEmployee("Rajesh", 2, 30000);
		
	}

}