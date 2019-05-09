import java.util.Random;

public class TheRandom extends Player {
	@Override
	public String getName() {
		return "Crazy";
	}

	@Override
	public Roshambo generateRoshambo() {
		Roshambo roshambo = null;
		Random rand = new Random();
		int number = rand.nextInt(2);
		if (number == 0) {
		roshambo = Roshambo.Rock;	
		} else if (number == 1) {
			roshambo = Roshambo.Paper;
		} else {
			roshambo = Roshambo.Scissors;
		}
		return roshambo;
	 
	}
	

}
