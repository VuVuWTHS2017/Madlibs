import java.util.Scanner;

public class Madlibs {
	public static void main (String args[]){
		Scanner scnr = new Scanner(System.in);
		String userLetter = "";
		String termProNoun = "";
		String termVerb = "";
		String termAdj = "";
		
		
		System.out.println("Enter your favorite Letter in the English alphabet.");
		userLetter = scnr.next();
		System.out.println("Enter a pronoun.");
		termProNoun = scnr.next();
		System.out.println("Enter a verb.");
		termVerb = scnr.next();
		System.out.println("Enter an adjective.");
		termAdj = scnr.next();
		
		System.out.println(termProNoun + " " + termVerb + " " + termAdj + ".");
		System.out.println();
		
		return;
	}
}
