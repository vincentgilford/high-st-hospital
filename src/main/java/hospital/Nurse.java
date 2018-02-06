package hospital;

public class Nurse extends Employee implements BloodDrawer, CareGiver {
	
	private int numberOfPatients;

	public Nurse(String empNumber, String empName, int numberOfPatients) {
		// TODO Auto-generated constructor stub
		this.empNumber = empNumber; 
		this.empName = empName;
		this.numberOfPatients = numberOfPatients; 
		
	}

	@Override
	public void drawBlood(Bleedable patient) {
		// TODO Auto-generated method stub
		patient.removeBlood(5);
	}

	@Override
	public int getSalary() {
		// TODO Auto-generated method stub
		return 50000;
	}

	/* (non-Javadoc)
	 * @see hospital.CareGiver#adminsterCare(hospital.Patient)
	 */
	@Override
	public void adminsterCare(Patient patient) {
		// TODO Auto-generated method stub
		patient.receiveCare(5);
	}

	public int getPatientNumber() {
		// TODO Auto-generated method stub
		return numberOfPatients;
	
	}
}
