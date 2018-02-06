package hospital;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SurgeonTest {	 
	
	@Test
	public void assertIsOperating() {
		Surgeon underTest = new Surgeon(null, null, null, true); 
		
		underTest.isSurgeonOperating(); 
		
		assertTrue(underTest.isSurgeonOperating());
	}
	
	
	
	
}
