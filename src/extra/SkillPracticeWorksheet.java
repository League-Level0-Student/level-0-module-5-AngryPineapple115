package extra;

import javax.swing.JOptionPane;

public class SkillPracticeWorksheet {

	public static void main(String[] args) {

		skill1();
		skill2();
		skill3();
		skill4();
		skill5();

	}

	static void skill1() {

		String dimes = JOptionPane.showInputDialog("How many Dimes do you have?");
		int dimesmul = Integer.parseInt(dimes);
		int dimescen = dimesmul * 10;
		JOptionPane.showMessageDialog(null, "You have " + dimescen + " cents.");

		String height = JOptionPane.showInputDialog("How many inches tall are you?");
		int heightin = Integer.parseInt(height);
		if (heightin <= 36) {
			JOptionPane.showMessageDialog(null, "Eat your Wheaties!");
		} else {
			JOptionPane.showMessageDialog(null, "Good for you.");
		}
	}

	static void skill2() {

		for (int a = 0; a < 33; a += 3) {
			System.out.println(a);
		}

	}

	static void skill3() {

		// random

	}

	static void skill4() {

		String city = JOptionPane.showInputDialog("What city do you live in?");
		if (city.equals("San Diego")) {
			JOptionPane.showMessageDialog(null, "You live in America's Finest City!");
		} else {
			JOptionPane.showMessageDialog(null, "You should move to San Diego.");
		}

		int cars = 2;

	}

	static void skill5() {

	}
}
