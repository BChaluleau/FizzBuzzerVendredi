package fizzbuzz;

public class FizzBuzzer {

	private int turn = 1;
	private static int MAGIC_KEY = 3;
	private static String MAGIC_VALUE = "Fizz";

	public String play() {
		if (turn == MAGIC_KEY) {
			return MAGIC_VALUE;
		}
		String reponse = "%d".formatted(turn);
		turn++;
		return reponse;
	}

}
