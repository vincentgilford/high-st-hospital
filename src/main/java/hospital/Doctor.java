package hospital;

public class Doctor extends Employee implements BloodDrawer {

	public void drawBlood(Bleedable patient) {
		// TODO Auto-generated method stub
		patient.removeBlood(1);
	}

	
	public int getSalary() {
		// TODO Auto-generated method stub
		return 90000;
	}

}
