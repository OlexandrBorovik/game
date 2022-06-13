package game;

public class Player {

	private int cul = 0;
	private String name;
	private boolean decide;

	public Player() {
		super();

	}

	public Player(int cul, String name, boolean decide) {
		super();
		this.cul = cul;
		this.name = name;
		this.decide = decide;
	}

	public int getCul() {
		return cul;
	}

	public void setCul(int cul) {
		this.cul = cul;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isDecide() {
		return decide;
	}

	public void setDecide(boolean decide) {
		this.decide = decide;
	}

	@Override
	public String toString() {
		return "Player [cul=" + cul + ", name=" + name + ", decide=" + decide + "]";
	}

}