package game;

import java.util.Scanner;
import java.util.Stack;

public class Start {
	private Stack<Card> deck;
	private Card card;
	private Scanner sc = new Scanner(System.in);
	private int index = 0;
	private Player ii = new Player();
	private Player you = new Player();
	private StackCardDeck s = new StackCardDeck();

	public Start(Stack<Card> deck, Card card, Scanner sc, int index, Player ii, Player you, StackCardDeck s) {
		super();
		this.deck = deck;
		this.card = card;
		this.sc = sc;
		this.index = index;
		this.ii = ii;
		this.you = you;
		this.s = s;
	}

	public Start() {
		super();

	}

	public Stack<Card> getDeck() {
		return deck;
	}

	public void setDeck(Stack<Card> deck) {
		this.deck = deck;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public Player getIi() {
		return ii;
	}

	public void setIi(Player ii) {
		this.ii = ii;
	}

	public Player getYou() {
		return you;
	}

	public void setYou(Player you) {
		this.you = you;
	}

	public StackCardDeck getS() {
		return s;
	}

	public void setS(StackCardDeck s) {
		this.s = s;
	}

	public void start(String nameCom, String nameYou) {

		ii.setName(nameCom);
		you.setName(nameYou);
		s.sortDeck();
		System.out.println("Deck sorted!");
		deck = s.getSortedDeck();

		for (int i = 0; i < 2; i++) {
			card = deck.pop();
			ii.setCul(ii.getCul() + card.getSize());
			card = deck.pop();
			System.out.println("You took " + card.getName() + " " + card.getSuit());
			you.setCul(you.getCul() + card.getSize());

		}

		System.out.println(you.getCul());
		this.chekHand(ii);
		this.chekHand(you);
		this.decide(ii);

		while (index == 0) {

			if (ii.isDecide()) {

				card = deck.pop();
				ii.setCul(ii.getCul() + card.getSize());
				System.out.println(ii.getName() + " took a cart.");
				this.chekHand(ii);

			}
			if (you.isDecide() && index != 1) {
				System.out.println("take card?");
				String answer = sc.nextLine();

				if (answer.equals("yes")) {
					card = deck.pop();
					you.setCul(you.getCul() + card.getSize());
					System.out.println(you.getCul());
					System.out.println("You took " + card.getName() + " " + card.getSuit());
					this.chekHand(you);
				} else {
					you.setDecide(false);
				}

			}
			this.decide(ii);
			if (ii.isDecide() == false && you.isDecide() == false) {
				index = 1;
			}

		}

		end();

	}
// проверка перебора карт
	public void chekHand(Player player) {

		if (player.getCul() > 21) {

			endOver(player);

		}
		if (player.getCul() == 21) {
			index = 1;
		} else {
			player.setDecide(true);
		}

	}
//принятие решения компьютера о продолжении набора карт, чем меньше карт остается до 21, тем меньше вероятность, что он примет положительное решение.
	public void decide(Player player) {
		if (player.isDecide() == true) {
			int a = 21 - player.getCul();

			if ((int) (Math.random() * 10) <= a) {
				player.setDecide(true);

			} else {
				player.setDecide(false);
			}
		}
	}
// окончание игры при согласии игроков
	public void end() {
		int firstPlayer = ii.getCul();
		int secondPlayer = you.getCul();
		System.out.println(ii.getName() + " have " + ii.getCul() + " you have" + you.getCul());
		if (firstPlayer > secondPlayer && firstPlayer < 22) {
			System.out.println(ii.getName() + "WIN");
		}
		if (secondPlayer > firstPlayer && secondPlayer < 22) {
			System.out.println(you.getName() + "WIN");
		}
		if (secondPlayer == firstPlayer && secondPlayer < 22) {
			System.out.println("Friendship win");
		}

	}
//окончание игры при переборе одним из игроков
	public void endOver(Player player) {
		System.out.println(player.getName() + "Loose");
		index = 1;
	}
//окончание игры при сборе 21 одним из играков
	public void endTwentyOne(Player player) {
		System.out.println(player.getName() + "Win");
		this.index = 1;
	}

	@Override
	public String toString() {
		return "Start [deck=" + deck + ", card=" + card + ", sc=" + sc + ", index=" + index + ", ii=" + ii + ", you="
				+ you + ", s=" + s + "]";
	}
	
}
