package hospital;

public class Patient implements Bleedable {
	 
	private static final int DEFAULT_BLOODS = 42;
	private int bloods = DEFAULT_BLOODS; 
	private int health = 10; 
	
	
	public int getBloods() {
		// TODO Auto-generated method stub
		return bloods;
	}

	public void removeBlood(int amount) {
		// TODO Auto-generated method stub
		bloods -= amount; 
	}

	public int getHealth() {
		// TODO Auto-generated method stub
		return health;
	}

	public void receiveCare(int amount) {
		// TODO Auto-generated method stub
		health += amount;
	}

	


}
