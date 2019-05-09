import java.util.Scanner;
//  Flora Lopez  Java Bootcamp May'19

public class RoshamboApp {

	public static void main(String[] args) {

		
	//	System.out.println(Roshambo.Rock.ordinal());
		Scanner scan = new Scanner(System.in);
		String name;
		System.out.println("Welcome to Roshambo game!");
		System.out.println("");
		System.out.println("Enter your name:");
		
		name = scan.next();
		Player human = new TheHuman(name);
		//human.setName(scan.next());
		Player computerPlayer;
		scan.nextLine();
		char option;
		String flag = "y";
		String gameOption;
		Roshambo humanHand;
		do {
			System.out.println("");
		    System.out.println("\nWould you like to play against The Rockers or The Crazy (r/c)?:");
		    option = scan.next().charAt(0);
		    if(!(option == 'r' || option == 'c')) {
		    	System.out.println("Wrong option! Please try again");
		    	continue;
		    } else {
		    	humanHand = human.generateRoshambo();		    	
		    }	
		    if (option == 'r') {
		    	computerPlayer = new TheRockers();
		    } else {
		    	computerPlayer = new TheRandom();
		    }
		    
		    Roshambo nonHumanHand = computerPlayer.generateRoshambo();
		 
		    if (humanHand == Roshambo.Paper) {
		    	if (nonHumanHand == Roshambo.Paper) {
		    		System.out.println(human.getName() + " : " + humanHand);
		    		System.out.println(computerPlayer.getName() + " : " + nonHumanHand);
		    		System.out.println("It is a tie!");
		    	} else if (nonHumanHand == Roshambo.Rock) {
		    		System.out.println(human.getName() + " : " + humanHand);
		    		System.out.println(computerPlayer.getName() + " : " + nonHumanHand);
		    		System.out.println(human.getName()+ " wins!");
		    	} else {
		    		System.out.println(human.getName() + " : " + humanHand);
		    		System.out.println(computerPlayer.getName() + " : " + nonHumanHand);
		    		System.out.println(computerPlayer.getName()+ " wins!");
		    	}
		    } else if (humanHand == Roshambo.Rock) {
		    	   if (nonHumanHand == Roshambo.Rock) {
		    	  	 System.out.println(human.getName() + " : " + humanHand);
		    		 System.out.println(computerPlayer.getName() + " : " + nonHumanHand);
		    		 System.out.println("It is a tie!");
		    	  }	else if (nonHumanHand == Roshambo.Paper) {
		    		  System.out.println(human.getName() + " : " + humanHand);
			    	  System.out.println(computerPlayer.getName() + " : " + nonHumanHand);
			          System.out.println(computerPlayer.getName()+ " wins!"); 
		    	  } else {
		    		  System.out.println(human.getName() + " : " + humanHand);
			    	  System.out.println(computerPlayer.getName() + " : " + nonHumanHand);
			    	  System.out.println(human.getName()+ " wins!");
		    	  }
		    } else if (humanHand == Roshambo.Scissors) {
		    		  if (nonHumanHand == Roshambo.Scissors) {
		    			 System.out.println(human.getName() + " : " + humanHand);
				    	 System.out.println(computerPlayer.getName() + " : " + nonHumanHand);
				    	 System.out.println("It is a tie!"); 
		    		  } else if (nonHumanHand == Roshambo.Rock) {
		    			  System.out.println(human.getName() + " : " + humanHand);
				    	  System.out.println(computerPlayer.getName() + " : " + nonHumanHand);
				          System.out.println(computerPlayer.getName()+ " wins!");
		    		  } else {
		    			  System.out.println(human.getName() + " : " + humanHand);
				    	  System.out.println(computerPlayer.getName() + " : " + nonHumanHand);
				    	  System.out.println(human.getName()+ " wins!");  	  
		    		  }
		    			  
		    }
	    	flag = Validator.getStringMatchingRegex(scan, "\nPlay again ? (y/n): \n", "^[ns]{1}");

		} while (flag.contentEquals("y"));
		System.out.println("Adios!!");
	}

}
