import java.util.Random;

public class TheRockers extends Player {

	@Override
	public String getName() {
		return "Rocker";
	}
	
	@Override
	public Roshambo generateRoshambo() {
		Roshambo roshambo = null;
		
		return roshambo = Roshambo.Rock;	
	}
	//Will always get rock
	

}
