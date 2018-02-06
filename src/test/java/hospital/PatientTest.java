package hospital;

import static org.junit.Assert.assertThat;

import org.junit.Test;

import static org.hamcrest.Matchers.is;

public class PatientTest {
	@Test 
	public void shouldBeAbleToRemoveBlood() {
		Patient patient = new Patient(); 
		
		patient.removeBlood(1); 
		
		int currentBloods = patient.getBloods();
		
		assertThat(currentBloods, is(41));
		
	}
	
//	@Test
//	public void shouldBeAbletoAddHealth() {
//		Patient patient = new Patient(); 
//		
//		patient.get
//		
//		
//	}
	
	
	
	
}
