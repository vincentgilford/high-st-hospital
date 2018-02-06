package hospital;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;




public class NurseTest {
	
	@Test
	public void assertsDrawBlood() {
		Nurse underTest = new Nurse(null, null, 0); 
		Patient patient = new Patient(); 
		
		int bloodsBefore = patient.getBloods(); 
		underTest.drawBlood(patient);
		int bloodsAfter = patient.getBloods();
		
		assertThat(bloodsBefore-bloodsAfter, is(5));
	}
	
	@Test
	public void assertSalaryIs50000() {
		Nurse underTest = new Nurse("1111","Jackie", 0);
		
		underTest.getSalary();
		
		assertThat(50000, is(underTest.getSalary()));
	}
	
	
	@Test
	public void assertNurseImplementsHealth() {
		CareGiver underTest = new Nurse("1111","Jackie", 0);
		Patient patient = new Patient(); 
		
		int checkHealthBefore = patient.getHealth();
		underTest.adminsterCare(patient); 
		int checkHealthAfter = patient.getHealth();
		
		assertThat(checkHealthAfter-checkHealthBefore, is(5));
	}
	
	@Test
	public void assertNursePatientNumbers() {
		Nurse underTest = new Nurse("1111","Jackie",10);
		
		int check = underTest.getPatientNumber();
		
		
		assertThat(10, is(check));
	}
	

	
	
	
	
	
	
	
	
}
