package mastermind;
import mastermind.Create; // import statements for scanner lib and other classes
import mastermind.Guesser;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int guesses = 0; // track amount of guesses taken
		Scanner scan = new Scanner(System.in);
		Create create = new Create(); // init classes
		Guesser guess = new Guesser();
		boolean sure = false;
		String code = create.newCode(4); // call create class to make a new random code
		while (sure == false) { // init loop to allow guessing until sure of answer
			guess.Guesser(code); // use the code from the create class as input for the guesser
			System.out.println("Your guess is " + guess.returnGuess() + ". Are you sure? [Y/N]"); // ask player if they are sure of guess, if so return result otherwise repeat guessing process
			String confirm = scan.nextLine();
			if (confirm.equals("Y")) {
				guesses +=1; // keep track of guesses
				if (guess.returnBlack() == 4) {
					System.out.println("You have won! The code was " + code + ".");
					break; // if player confirms all guesses and there are 4 black pins, then code must therefore be guessed
				}
				else {
					System.out.println("Black: " + guess.returnBlack()); // if player confirms and not 4 black pins, then return amount of black and white pins
					System.out.println("White: " + guess.returnWhite());
				}
			}
			}
		}
	}


