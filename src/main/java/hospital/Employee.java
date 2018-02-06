package hospital;

public abstract class Employee {
	
	protected String empNumber;
	protected String empName;

	public String salaryInfo() {
		
		return "This employee's salary is " + getSalary(); 
		
	}

	public abstract int getSalary();

	public String getEmpNumber() {
		return empNumber;
	}

	public String getEmpName() {
		return empName;
	} 

}
