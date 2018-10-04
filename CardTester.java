/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
	Card card1 = new Card("queen", "heart", 12);
	Card card2 = new Card("queen", "heart", 12);
	Card card3 = new Card("two", "diamond", 2);

System.out.println(card1.toString());
System.out.println(card2.toString());
System.out.println(card3.toString());

	if (card1.matches(card2)){
		System.out.println("Good Job, It Matches!");
	}
	else {
		System.out.println("Error, It Doesn't Match!");
	}
	if (card1.matches(card3)){
		System.out.println("Good Job, It Matches!");
	}
	else {
		System.out.println("Error, It Doesn't Match!");
	}


	}
}
