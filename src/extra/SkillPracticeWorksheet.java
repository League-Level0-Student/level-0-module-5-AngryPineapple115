package extra;

import java.util.Random;

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

		System.out.println("4");
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

		Random gena = new Random();
		int fir = gena.nextInt(11);
		System.out.println(fir);
		Random genb = new Random();
		int sec = genb.nextInt(21);
		System.out.println(sec);
		int dif = fir - sec;
		JOptionPane.showMessageDialog(null, "Difference: " + dif);

	}

	static void skill4() {

		String city = JOptionPane.showInputDialog("What city do you live in?");
		if (city.equals("San Diego")) {
			JOptionPane.showMessageDialog(null, "You live in America's Finest City!");
		} else {
			JOptionPane.showMessageDialog(null, "You should move to San Diego.");
		}

		int cars = 2;
		JOptionPane.showMessageDialog(null, cars);

	}

	static void skill5() {

		String school = JOptionPane.showInputDialog("What is the name of your school?");
		JOptionPane.showMessageDialog(null, school + " is a fantastic school!");

	}
}