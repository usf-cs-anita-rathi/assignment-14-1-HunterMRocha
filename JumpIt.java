
public class JumpIt {

	static int[] values = new int[] { 0, 3, 12, 21, 6, 8, 2, 17, 9, 1};

	static int move1 = values[1];
	static int move2 = values[1];

	public static void cheapest() {
		for (int i = 1; i < values.length; i++) {

			if (move1 > values[i]) {
				move2 = move1;
				move1 = values[i];
			}
			if (move2 > values[i] && move1 != values[i]) {
				move2 = values[i];
			}
		}
	}

	public static void main(String[] args) {
		cheapest();
		System.out.println(move1);
		System.out.println(move2);

	}

}
