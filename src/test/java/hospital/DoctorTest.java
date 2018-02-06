package hospital;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.Test;

import hospital.Doctor;

public class DoctorTest {
	@Test
	public void shouldDrawBlood() {
		Doctor underTest = new Doctor(null, null, null);
		Patient patient = new Patient(); 
		
		int bloodsBefore = patient.getBloods();
		
		underTest.drawBlood(patient);
		
		int bloodsAfter = patient.getBloods(); 
		assertThat(bloodsBefore-bloodsAfter, is(1));
		
	}
	boolean wasBled = false; 
	
	public class BleedableDouble implements Bleedable {
		
		public void removeBlood(int amount) {
			wasBled = true; 
		}
	}
	
	@Test
	public void shouldDrawBloodFromTestDouble() {
		Doctor underTest = new Doctor(null, null, null);
		Bleedable patient = new BleedableDouble(); 
		
		underTest.drawBlood(patient);
		
		assertThat(wasBled, is(true));
	}
	
	@Test
	public void shouldHaveSalary() {
		Employee underTest = new Doctor(null, null, null); 
		
		int salary = underTest.getSalary(); 
		
		assertThat(salary, is(90000));
	}
	
	@Test
	public void patientDrawBloodAsAnInterface() {
		BloodDrawer underTest = new Doctor(null, null, null); 
		Bleedable patient = new Patient();
		
		underTest.drawBlood(patient); 
	}
	
	@Test
	public void assertCareForPatient() {
		Doctor underTest = new Doctor("1111","Dad","Primary");
		Patient patient = new Patient(); 
		
		int checkBefore = patient.getHealth();
		underTest.adminsterCare(patient); 
		int checkAfter = patient.getHealth();
				
		assertThat(checkAfter-checkBefore, is(10));
	}
	
	
	
	
	
	
	
}
