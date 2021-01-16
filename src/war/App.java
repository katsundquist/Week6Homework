package war;

public class App {

	public static void main(String[] args) {
		
		Deck deck = new Deck();
		
		Player playerOne = new Player("One");
		Player playerTwo = new Player("Two");
		
		deck.shuffle();
		
		for(int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				playerOne.draw(deck);
			} else {
				playerTwo.draw(deck);
			}
		}
		
		
		for(int i = 0; i < 26; i ++) {
			Card card1 = playerOne.flip();
			Card card2 = playerTwo.flip();
			//System.out.println(card1.getValue());
			//System.out.println(card2.getValue());
		
			if (card1.getValue() > card2.getValue()) {
				playerOne.incrementScore();
			} else if (card2.getValue() > card1.getValue()) {
				playerTwo.incrementScore();
			}
			
			//if the value of the cards are the same,
			//neither person gets the point.
		}
		
		if (playerOne.getScore() > playerTwo.getScore()){
			System.out.println("Player One wins!");
		} else if (playerTwo.getScore() > playerOne.getScore()) {
			System.out.println("Player Two wins!");
		} else {
			System.out.println("It's a draw!");
		}
	}
}
