package mastermind;
import java.util.Random;
public class Create {
	private int length = 4; // default length of 4 (debug purposes)
	private String code = ""; // empty string that the colors are concatenated with
	String[] colors = {"R","B","G","Y"}; // valid colors to concatenate with
	Random random = new Random(); // random class for generation of random string
	public String newCode(int len) { // newCode constructor with length of code as parameter
		length = len; // set length to parameter
		int i = 0; // create index
		while (i < length) {
			int index = random.nextInt(colors.length); // for each spot in the length, choose a randon number from the choice of the length of the string
			code = code + colors[index]; // concatenate to the empty string, using the letter at the randomized index
			i++;
		}
		return code;
		
	}
	public int getLength() {
		return length; // in case of necessity of length in other programs
	}
	public String getCode() {
		return code; // in case of necessity of the code in other programs
	}
}
