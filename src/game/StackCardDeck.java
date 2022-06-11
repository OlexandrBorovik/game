package game;


import java.util.Stack;

public class StackCardDeck {
	
	private Stack<Card> sortedDeck = new Stack<Card>();
	private CardDeck card = new CardDeck();
	
	private Sorted sor = new Sorted ();




public void sortDeck () {
	
	int [] sort = sor.sort();
	for (int i = 0 ; i< 36;i++) {
		int index = sort [i];
		
		CardDeck cd = new CardDeck();
		cd.addCards();
		Card c = new Card ();
		
		c=cd.getDeck().get(index);
		System.out.print(c.getName()+" ");
		if(c!=null) {
		sortedDeck.push(c);
		}
		
		
		
	}
}

	

}
