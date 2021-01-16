package war;


public class Card {

	private  String suit;  // aka "name" 
	private int value;

	public Card(String suit, int value){
		this.suit = suit;
		this.value = value;
	}

	public String getName(){
		return suit;
	}
	public void setSuit(String suit){
		this.suit = suit;
	}
	public int getValue(){
		return value;
	}
	public void setValue(int value){
		
		this.value = value;
		
	}

	public void describe() {
		String stringValue = null;

		if( value < 11) {
			stringValue = String.valueOf(value);
		} else if (value == 11) {
			stringValue = "Jack";
		} else if (value == 12) {
			stringValue = "Queen";
		} else if (value == 13) {
			stringValue = "King";
		} else if (value == 14) {	
			stringValue = "Ace";
		}


		System.out.println("\n"+ stringValue + " of "+ suit);
	}

}
