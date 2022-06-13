package game;

import java.util.Arrays;

public class Sorted {

	private int[] array = new int[36];

	public Sorted(int[] array) {
		super();
		this.array = array;
	}

	public Sorted() {
		super();
	}

	public int[] sort() {
		int[] cards = new int[36];

		for (int i = 0; i < 36; i++) {
			int r = (int) (Math.random() * 37);
			if (this.check(r)) {
				cards[i] = r;
				array[i] = r;

			} else {
				i -= 1;
			}

		}
		return cards;

	}

	private boolean check(int num) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num) {
				return false;
			}
		}
		return true;

	}

	@Override
	public String toString() {
		return "Sorted [array=" + Arrays.toString(array) + "]";
	}

}
