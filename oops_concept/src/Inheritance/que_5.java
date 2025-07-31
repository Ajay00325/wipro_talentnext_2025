package Inheritance;

public class que_5 {
   public static void main(String args[]) {
	   Employee e=new Employee("145");
	  System.out.println( e.getInsuranceNumber());
	   Employee e1=new Employee(1547855.12);
	   
	   System.out.println(e1.getSalary());
;   }
}
class Person{
	double salary;
}
class Employee extends Person{
	private String insuranceNumber;
	public Employee(String insuranceNumber ) {
		this.insuranceNumber=insuranceNumber;
	}
	public Employee(double salary) {
		this.salary=salary;
	}
	public void setEmployee(String insuranceNumber) {
		this.insuranceNumber=insuranceNumber;
		
	}
	public void setEmployee(double salary) {
	
	this.salary=salary;
	}
	public String getInsuranceNumber() {
		return insuranceNumber;
	}
	public double getSalary() {
		return salary;
	}
}
