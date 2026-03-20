package fizzbuzz;

public class FizzBuzzer {

	private int turn = 1;
	private static int MAGIC_KEYS[] = { 3, 5 };
	private static String MAGIC_VALUES[] = { "Fizz", "Buzz" };

	public String play() {
		String reponse = reponsePourTour(turn);
		turn++;
		return reponse;
	}

	private String reponsePourTour(int turn) {
		for (int i = 0; i < MAGIC_KEYS.length; i++) {
			if (MAGIC_KEYS[i] == turn) {
				return MAGIC_VALUES[i]; // dictionnaire à pas cher
			}
		}
		return "%d".formatted(turn);
	}

}
