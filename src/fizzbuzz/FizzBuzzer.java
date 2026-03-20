package fizzbuzz;

public class FizzBuzzer {

	private int turn = 1;

	public String play() {
		String reponse = "%d".formatted(turn);
		turn++;
		return reponse;
	}

}
