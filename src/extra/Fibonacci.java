package extra;

public class Fibonacci {

	public static void main(String[] args) {

		int last = 1;
		int secLast = 0;

		for (int a = 0; a < 11; a++) {
			int current = secLast + last;

			secLast = last;
			last = current;

			// last = current
			// secLast = current - secLast;

			System.out.println(current);
		}
	}
}