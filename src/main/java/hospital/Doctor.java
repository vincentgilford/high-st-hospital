package hospital;

public class Doctor extends Employee implements BloodDrawer, CareGiver {

	public Doctor(String empNumber, String empName, String speciality) {
		// TODO Auto-generated constructor stub
		this.empNumber = empNumber;
		this.empName = empName; 
	}

	public void drawBlood(Bleedable patient) {
		// TODO Auto-generated method stub
		patient.removeBlood(1);
	}

	@Override
	public int getSalary() {
		// TODO Auto-generated method stub
		return 90000;
	}


	@Override
	public void adminsterCare(Patient patient) {
		// TODO Auto-generated method stub
		patient.receiveCare(10);
	}

	

	
	
	
}
