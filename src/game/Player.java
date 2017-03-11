package game;

/*The player class is for managing the player's bank, ie how much the player can bet, and updating the bank depending on the outcome
*/public class Player {

	/*We use private so that the only way to see an modify bank is through the getter and setter methods*/
	private int bank = 100;
	
	public Player(){
		
	}
	public void setBank(int amount){
		bank = amount;
	}
	
	public int getBank(){
		return bank;
		
	}
}
