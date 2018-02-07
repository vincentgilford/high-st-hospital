package hospital;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.hamcrest.Matchers.is;


import org.junit.Test;

public class JanitorTest {
	@Test
	public void isSweewping() {
		Janitor underTest = new Janitor(null, null, true); 
		
		underTest.isSweeping(); 
		assertTrue(underTest.isSweeping());
		
	}
	
	@Test
	public void assertIsSalary40000() {
		Janitor underTest = new Janitor(null, null, true);
		
		underTest.getSalary();
		
		assertThat(40000, is(underTest.getSalary()));
	}
	
	
	
	
}
