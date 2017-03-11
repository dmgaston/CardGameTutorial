package game;

public class Card {
	
	
	final String suit;
	
	final int value;
	
	public Card(String suit, int value){
		this.suit = suit;
		
		this.value = value;
	}
	
	public String getCardAsString(){
		
		/*in this method you need to append the suit to the value. the value will appear
		as a number for 2-10 and as A J Q K for the face cards and ace. We will use this method to display the card to 
		the console*/
		
		/*Note: A string can be concatonated with an int by doing "STRING"+1 (or the variable where the string is held like str + 3)
		This method is not ideal, and for bigger projects the StringBuilder class is recommended. For simplicity's sake we
		will stick with using the + operator*/
		
		/*The switch statement takes an input (value in this case) and depending on it's value, the statement will jump to the appropriate case
		Here we need to change the values 1, 11, 12, and 13 into A J Q K. The break keyword is there to exit the switch statement once
		we find and execute the case we want*/
		switch(value){
		case /*specific number goes here, eg 12*/ : 
			/*Statements go here*/
			break;
		case:
			break;
		case:
			break;
		case:
			break;
		}
		
		return ;/*A string with the value followed by the suit*/
	}
	
}	
