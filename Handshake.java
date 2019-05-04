import java.util.*;

public class Handshake {
	static Scanner input = new Scanner(System.in);
	static int totalPeople;
	static int person = 1;
	static int totalHandshakes = 0; 

	public static void Handshakes(int n) {
		if (n == 0) {
			System.out.println(totalHandshakes);
		} else {
			System.out.println("Handshakes for person " + person + " is: " + (person - 1));
			totalHandshakes += (person-1);
			person++;
			Handshakes(n - 1);

		}

	}

	public static void main(String[] args) {
		System.out.println("How many people are in the room? ");
		totalPeople = input.nextInt();
		Handshakes(totalPeople);

	}

}
