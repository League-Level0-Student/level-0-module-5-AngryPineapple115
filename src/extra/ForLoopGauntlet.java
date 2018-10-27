package extra;

public class ForLoopGauntlet {
	public static void main(String[] args) {

		for (int a = 0; a < 101; a++) {
			System.out.println(a);
		}
		// down
		for (int b = 100; b < 1; b--) {
			System.out.println(b);
		}
		for (int c = 0; c < 101; c++) {
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
		// down [all]
		for (int f = 7; f < 111; f++) {
			System.out.println(f);
		}
		for (int g = 2006; g < 12; g++) {
			System.out.println("In " + g + " I was " + g + " years old.");
		}
		for (int h = 0; h < 3; h++) {
			for (int ha = 0; ha < 3; ha++) {
				System.out.println(h + " " + ha);
			}
		}
		for (int i = 0; i < 9; i += 3) {
			for (int ia = 1; ia < 4; ia++) {
				System.out.print(i + ia + " ");
			}
			System.out.println();
		}
		for (int j = 0; j < 100; j += 10) {
			for (int ja = 1; ja < 11; ja++) {
				System.out.print(j + ja + " ");
			}
			System.out.println();
		}
		for (int k = 0; k < 21; k++) {
			String kb = "*" + "*"
			for (int ka = 0; ka < 1; ka += 5) {
				System.out.print(kb);
			}
			
		}
	}
}