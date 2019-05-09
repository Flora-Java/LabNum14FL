
public abstract class Player {

	private String name;
	
	public abstract Roshambo generateRoshambo();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Player() {
		
	}

	public Player(String name) {
		super();
		this.name = name;
	}

	public Roshambo generateRoshambo(char option) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
