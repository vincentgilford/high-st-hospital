package hospital;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is; 
import org.junit.Test;

public class ReceptionistTest {
	
	@Test
	public void assertIsOnThePhone() {
		PhoneType underTest = new Receptionist(null, null, true);
		
		underTest.isOnThePhone();
		boolean check = true;
		
		
		assertThat(check, is(underTest.isOnThePhone()));
	}
	
	@Test
	public void assertSalary() {
		Receptionist underTest = new Receptionist(null, null, false);
		
		underTest.getSalary();
		
		
		assertThat(45000, is(underTest.getSalary()));
	}
	
}
