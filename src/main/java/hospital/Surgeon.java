package hospital;

public class Surgeon extends Doctor {

	private boolean isOperating;

	public Surgeon(String empNumber, String empName, String speciality, boolean isOperating) {
		super(empNumber, empName, speciality);
		// TODO Auto-generated constructor stub
		this.isOperating = isOperating;
	}

	public boolean isSurgeonOperating() {
		// TODO Auto-generated method stub
		return isOperating;
	}

		
	

}
