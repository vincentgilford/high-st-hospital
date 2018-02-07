package hospital;

public class Janitor extends Employee {

	private boolean isSweeping;

	public Janitor(String empNumber, String empName ,boolean isSweeping) {
		// TODO Auto-generated constructor stub
		this.isSweeping = isSweeping; 
		this.empNumber = empNumber;
		this.empName = empName; 
	
	}

	public boolean isSweeping() {
		// TODO Auto-generated method stub
		return isSweeping;
	}

	@Override
	public int getSalary() {
		// TODO Auto-generated method stub
		return 40000;
	}

}
