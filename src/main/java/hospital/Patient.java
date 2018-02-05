package hospital;

public class Patient implements Bleedable {
	
	private static final int DEFAULT_BLOODS = 42;
	private int bloods = DEFAULT_BLOODS; 
	
	public int getBloods() {
		// TODO Auto-generated method stub
		return bloods;
	}

	public void removeBlood(int amount) {
		// TODO Auto-generated method stub
		bloods -= amount; 
	}



}
