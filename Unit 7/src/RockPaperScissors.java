//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	public String playChoice;
	private int compChoice;
	public String compString;
	public RockPaperScissors()
	{
		playChoice = "";
		compChoice = (int) (2*Math.random());
		if (compChoice == 0) {
			compString = "R";
		}else if (compChoice == 1) {
			compString = "P";
		}else {
			compString = "S";
		}
	}

	public RockPaperScissors(String player)
	{
		playChoice = player;
		compChoice = (int) (2*Math.random());
		if (compChoice == 0) {
			compString = "R";
		}else if (compChoice == 1) {
			compString = "P";
		}else {
			compString = "S";
		}
	}

	public void setPlayers(String player)
	{
		playChoice = player;
		compChoice = (int) (2*Math.random());
		if (compChoice == 0) {
			compString = "R";
		}else if (compChoice == 1) {
			compString = "P";
		}else {
			compString = "S";
		}
	}

	public String determineWinner()
	{
		String computer = compString;
		String Play = "";
		String winner="";
		Play = playChoice;
		out.println("Your choice was in " + Play);
		out.println("Your computer picked " + computer);

		return winner;
	}

	public String toString()
	{
		String output="";
		return output;
	}
}