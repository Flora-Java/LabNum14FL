
public enum Roshambo {

	Rock, Paper, Scissors;
	public String toString() {
		switch (this)  {
		case Rock:
			return "Rock";
		case Paper:
			return "Paper";
		default:
			return "Scissors";
		}
	 }

}
