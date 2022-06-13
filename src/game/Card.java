package game;

public class Card {
	
	private String name;
	private int size;
	private  CardsSuit suit;
	public Card() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Card(String name, int size, CardsSuit suit) {
		super();
		this.name = name;
		this.size = size;
		this.suit = suit;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public CardsSuit getSuit() {
		return suit;
	}
	public void setSuit(CardsSuit suit) {
		this.suit = suit;
	}
	@Override
	public String toString() {
		return "Card [name=" + name + ", size=" + size + ", suit=" + suit + "]";
	}

}
