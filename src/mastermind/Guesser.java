package mastermind;

import java.util.Scanner;

public class Guesser {
	int white = 0; // default value for white pins as 0
	int black = 0; // default value for black pins as 0
	String guesscode = ""; // empty string that is concatenated onto with each player chosen letter
	public String Guesser(String code) { // create a new constructor that returns a string, using the code the player is guessing as a parameter
		guesscode = "";
		black = 0;
		white = 0; // reset the previously defined vars with each iteration of the guessing
		Scanner scan = new Scanner(System.in); // init scanner for input
		String answer = (code); // setting code to guess parameter to answer var
		int guesslength = code.length(); // set length of answer to length of guess
		int guessno = 1; // track number of guesses taken
		while (guesslength > 0) { // used to track amount of iterations of checking letter
			System.out.println("Enter your guess #" + (guessno) + ". Colors to choose from are R, B, G, and Y.");
			String guess = scan.nextLine(); // prompt user to enter a letter
			if (guess.charAt(0) == answer.charAt(guessno-1)) {
				black+=1; // first check if a char is at the same position in the strings, if so add a black
				answer.replaceFirst(guess, "X"); // set former pos to X to prevent complications when letter occurs twice
			}
			else if (answer.indexOf(guess) != -1) { // if char not at same pos, check if char in string
				white+=1; // if so give a white
				answer.replaceFirst(guess, "X"); // replace char with X to prevent complication if repeat letters
			}
			guesscode += guess; // concatenate each letter in the guess to the guesscode
			guesslength--; // iterate one down
			guessno++; // increase number of guesses 1
		}
		return guesscode; // return the guesscode
	}
	public int returnBlack() {
		return black; // return amount of black
	}
	public int returnWhite() {
		return white; // return amount of white
	}
	public String returnGuess() {
		return guesscode; // return guesscode without needing to go through the prompt
	}
}
