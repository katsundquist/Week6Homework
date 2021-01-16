package war;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	 
	 List<Card> cards = new ArrayList<Card>();
	 
	 String[] suits = {"Clubs", "Spades", "Diamonds", "Hearts"};
	 
	 public Deck() {
		 for(int i = 2; i < 15; i++) {
			 for (String suit : suits) {
				 cards.add(new Card(suit, i));
			 }
		 }
	 }
	 
	 public void shuffle() {
		 Collections.shuffle(this.cards);
	 }
	 
	 public Card draw() {
		 return cards.remove(0);
	 }
}
