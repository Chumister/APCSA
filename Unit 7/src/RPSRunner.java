//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response;
		
		//add in a do while loop after you get the basics up and running
		
			String player = "";
		
				 do{
			            System.out.print("Rock­Paper­Scissors ­ pick your weapon[R,P,S]:: ");
			           	player = keyboard.next();
			            RockPaperScissors test = new RockPaperScissors(player);
			            System.out.println(test); //uses toString method
			            System.out.println(test.determineWinner()+"\n");
			            System.out.print("Do you want to play again? ");
			            response = keyboard.next().charAt(0);
			        }while(response=='Y'||response=='y');
			//read in the player value
		
			RockPaperScissors game = new RockPaperScissors();		
	}
}



