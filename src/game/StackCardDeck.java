package game;

import java.util.Stack;

public class StackCardDeck {

	private Stack<Card> sortedDeck = new Stack<Card>();
	private CardDeck card = new CardDeck();
	private Sorted sor = new Sorted();

	public StackCardDeck(Stack<Card> sortedDeck, CardDeck card, Sorted sor) {
		super();
		this.sortedDeck = sortedDeck;
		this.card = card;
		this.sor = sor;
	}

	public Stack<Card> getSortedDeck() {
		return sortedDeck;
	}

	public void setSortedDeck(Stack<Card> sortedDeck) {
		this.sortedDeck = sortedDeck;
	}

	public CardDeck getCard() {
		return card;
	}

	public void setCard(CardDeck card) {
		this.card = card;
	}

	public Sorted getSor() {
		return sor;
	}

	public void setSor(Sorted sor) {
		this.sor = sor;
	}

	public StackCardDeck() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void sortDeck() {

		int[] sort = sor.sort();
		for (int i = 0; i < 36; i++) {
			int index = sort[i];

			CardDeck cd = new CardDeck();
			cd.addCards();
			Card c = new Card();

			c = cd.getDeck().get(index);

			if (c != null) {
				sortedDeck.push(c);
			}

		}
	}

	@Override
	public String toString() {
		return "StackCardDeck [sortedDeck=" + sortedDeck + ", card=" + card + ", sor=" + sor + "]";
	}

}
