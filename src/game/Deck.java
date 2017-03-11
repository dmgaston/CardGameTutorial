package game;

import java.util.Collections;
import java.util.List;
import java.util.Random;

/*The deck class is used to create an array of 52 Card objects, which we can shuffle and deal from*/
public class Deck {
	
	Card[] deck = new Card[52]; /*an array of Cards with space for 52 Card objects.*/
	final String[] suits = {"H","D","C","S"}; /*letter representation of the suits*/
	int dealIndex = 0; /*the position in the deck array where we will draw a card*/
	
	public Deck(){
		
		/*Contruct the Deck using one loop for the suits and 
		another or the value; The suit loop uses an enhanced 
		for loop which lets you iterate over an array or list
		without needing to keep track of the index. The variable 's'
		is the current suit in the loop*/
		
		for(String s: suits){
			for(;;){ /*finish the for loop. the values should be 1-13*/
				/*In here you'll need to create a new card using the
				values from the loops and then add it to the deck array. Remember
				the card constructor is Card(String suit, int value*/
			}
		}
		
	}
	
	public void shuffle(){
		/*there is a Collections.shuffle(); method, but don't use it
		instead, loop through the list, and swap each element with
		a randomly generated index*/
		Random rand = new Random();
		/*loop starts here*/
		int swapIndex = rand.nextInt(51) + 1;
		
		/*end loop*/
		
		/*After that don't forget to reset the dealIndex to 0, so we can 
		deal cards from the beginning*/
	}
	public Card deal(){
		
		/*return the card at the current dealIndex, then increment
		dealIndex. Make sure to call the isEmpty method to make sure
		there are cards to deal*/
		
		return ; /*deck at index dealIndex*/
	}
	public boolean isEmpty(){
		/*if the dealindex is at 51, there are no cards left in the deck
		so return true. otherwise return false*/
		return false;
	}
	
	

}
