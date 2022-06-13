package game;

import java.util.HashMap;
import java.util.Map;

public class CardDeck {

	private Map<Integer, Card> deck = new HashMap<>();

	public Map<Integer, Card> getDeck() {
		return deck;
	}

	public void setDeck(Map<Integer, Card> deck) {
		this.deck = deck;
	}

	public CardDeck(Map<Integer, Card> deck) {
		super();
		this.deck = deck;
	}

	public CardDeck() {
		super();
		}

	public void addCards() {
		deck.put(1, new Card("six", 6, CardsSuit.clubs));
		deck.put(2, new Card("six", 6, CardsSuit.diamonds));
		deck.put(3, new Card("six", 6, CardsSuit.hearts));
		deck.put(4, new Card("six", 6, CardsSuit.spades));

		deck.put(5, new Card("seven", 7, CardsSuit.clubs));
		deck.put(6, new Card("seven", 7, CardsSuit.diamonds));
		deck.put(7, new Card("seven", 7, CardsSuit.hearts));
		deck.put(8, new Card("seven", 7, CardsSuit.spades));

		deck.put(9, new Card("eight", 8, CardsSuit.clubs));
		deck.put(10, new Card("eight", 8, CardsSuit.diamonds));
		deck.put(11, new Card("eight", 8, CardsSuit.hearts));
		deck.put(12, new Card("eight", 8, CardsSuit.spades));

		deck.put(13, new Card("nein", 9, CardsSuit.clubs));
		deck.put(14, new Card("nein", 9, CardsSuit.diamonds));
		deck.put(15, new Card("nein", 9, CardsSuit.hearts));
		deck.put(16, new Card("nein", 9, CardsSuit.spades));

		deck.put(17, new Card("ten", 10, CardsSuit.clubs));
		deck.put(18, new Card("ten", 10, CardsSuit.diamonds));
		deck.put(19, new Card("ten", 10, CardsSuit.hearts));
		deck.put(20, new Card("ten", 10, CardsSuit.spades));

		deck.put(21, new Card("jack", 2, CardsSuit.clubs));
		deck.put(22, new Card("jack", 2, CardsSuit.diamonds));
		deck.put(23, new Card("jack", 2, CardsSuit.hearts));
		deck.put(24, new Card("jack", 2, CardsSuit.spades));

		deck.put(25, new Card("lady", 3, CardsSuit.clubs));
		deck.put(26, new Card("lady", 3, CardsSuit.diamonds));
		deck.put(27, new Card("lady", 3, CardsSuit.hearts));
		deck.put(28, new Card("lady", 3, CardsSuit.spades));

		deck.put(29, new Card("king", 4, CardsSuit.clubs));
		deck.put(30, new Card("king", 4, CardsSuit.diamonds));
		deck.put(31, new Card("king", 4, CardsSuit.hearts));
		deck.put(32, new Card("king", 4, CardsSuit.spades));

		deck.put(33, new Card("ace", 11, CardsSuit.clubs));
		deck.put(34, new Card("ace", 11, CardsSuit.diamonds));
		deck.put(35, new Card("ace", 11, CardsSuit.hearts));
		deck.put(36, new Card("ace", 11, CardsSuit.spades));
	}

	@Override
	public String toString() {
		return "CardDeck [deck=" + deck + "]";
	}

}
