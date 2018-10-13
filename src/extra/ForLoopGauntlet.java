package extra;

public class ForLoopGauntlet {
	public static void main(String[] args) {

		for (int a = 0; a < 101; a++) {
			System.out.println(a);
		}
		for (int b = 100; b < 1; b--) {
			System.out.println(b);
		}
		for (int c = 0; c < 100; c++) {
			if (c % 2 == 0) {
				System.out.println(c);
			}
		}
		for (int d = 0; d < 100; d++) {
			if (d % 2 == 0) {

			} else {
				System.out.println(d);
			}
		}
		for (int e = 1; e < 501; e++) {
			if (e % 2 == 0) {
				System.out.println(e + " is even.");
			} else {
				System.out.println(e + " is odd.");
			}
		}
		for (int f = 7; f < 111; f++) {
			System.out.println(f);
		}
		for (int g = 2006; g < 12; g++) {
			System.out.println("In " + g + " I was " + g + " years old.");
		}
		for (int h = 0; h < 9; h++) {
			for (int ha = 0; ha < 2; ha++) {
				System.out.print(h);
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int ia = 0; ia < 3; ia++) {
				System.out.println(ia);
			}
		}
		for (int j = 0; j < 10; j++) {
			for (int ja = 0; ja < 10; ja++) {
				System.out.println(ja);
			}
			
		}
		for (int k = 0; k < 6; k++) {
			System.out.println(k);
		}
	}

}