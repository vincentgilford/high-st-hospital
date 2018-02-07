package hospital;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.hamcrest.Matchers.is;


import org.junit.Test;

public class SurgeonTest {	 
	
	@Test
	public void assertIsOperating() {
		Surgeon underTest = new Surgeon(null, null, null, true); 
		
		underTest.isSurgeonOperating(); 
		
		assertTrue(underTest.isSurgeonOperating());
	}
	
	@Test
	public void isSalary120() {
		Surgeon underTest = new Surgeon(null, null, null, true);
		
		underTest.getSalary();
		
		assertThat(120000, is(underTest.getSalary()));
	}
	

	
}
