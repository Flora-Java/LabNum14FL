import java.util.Scanner;

public class TheHuman extends Player {

	public TheHuman(String name) {
		super(name);
	}


	@Override
	public Roshambo generateRoshambo() {
		Scanner scan = new Scanner(System.in);
    	String gameOption = Validator.getStringMatchingRegex(scan, "Choose: rock, paper, scissors (R/P/S):", "^[RPS]{1}");
    	switch (gameOption) {
		case "R":
			return Roshambo.Rock;
		case "P":
			return Roshambo.Paper;
		case "S":
			return Roshambo.Scissors;
		}
    	return null;
	}

}
