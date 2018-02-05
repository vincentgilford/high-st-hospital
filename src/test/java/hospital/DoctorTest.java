package hospital;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.Test;

import hospital.Doctor;

public class DoctorTest {
	@Test
	public void shouldDrawBlood() {
		Doctor underTest = new Doctor();
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
		Doctor underTest = new Doctor();
		Bleedable patient = new BleedableDouble(); 
		
		underTest.drawBlood(patient);
		
		assertThat(wasBled, is(true));
	}
	
	@Test
	public void shouldHaveSalary() {
		Employee underTest = new Doctor(); 
		
		int salary = underTest.getSalary(); 
		
		assertThat(salary, is(90000));
	}
	
	@Test
	public void patientDrawBloodAsAnInterface() {
		BloodDrawer underTest = new Doctor(); 
		Bleedable patient = new Patient();
		
		underTest.drawBlood(patient); 
		
		
		
		
	}
	
	
}
