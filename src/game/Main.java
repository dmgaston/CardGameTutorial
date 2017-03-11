package game;

public class Main {
	
	public static void main(String[] args) {
	
	/*This is where the main loop for the game goes
	It will go like this: while there are cards in the deck and the player has money,
	deal the cards to the screen, as for the player's bet, then evaluate the result*/
		
		Player player = new Player(); /*the player using the program*/
		Deck deck = new Deck(); /* the deck used in the game*/
		
		/*We use a Scanner to read input from the console*/
		Scanner scanner = new Scanner(System.in);
		
		while(/*deck is not empty and player's bank != 0*/){
			
			/*Deal 3 cards, (store them in local variables), then print out cards 1 and 3 (don't forget to turn the card into a string) and showing a * in place
			of the middle card*/
			Card first = ;
			Card second = ;
			Card third = ;
			
			/*Ask the player for their bet*/
			System.out.println("");
					
			/*Then read in their bet with the scanner using the nextInt method*/
			int bet = ;
			
			
			
			if(/*Second card is between the first and third*/){
				/*Player wins the bet money*/
			}else{
				/*player loses the bet money*/
			}
			
			/*Once you get the basic functionality, try adding some error handling to check that the user has typed and int
			if the user has typed a string, the program should prompt the user for input again. Another thing to add could be to
			offer the user the option of typing q to quit, then quitting if a q is inputted*/
			
		}
		

	}

}
