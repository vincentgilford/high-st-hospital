package hospital;

public class Receptionist extends Employee implements PhoneType {

	private boolean isOnThePhone;
	
	public Receptionist(String empNumber, String empName, boolean isOnThePhone) {
		this.empNumber = empNumber;
		this.empName = empName;
		this.isOnThePhone = isOnThePhone; 
	}
	

	/* (non-Javadoc)
	 * @see hospital.PhoneType#isOnThePhone()
	 */
	@Override
	public boolean isOnThePhone() {
		// TODO Auto-generated method stub
		return isOnThePhone;
	}

	@Override
	public int getSalary() {
		// TODO Auto-generated method stub
		return 45000;
	}

}
