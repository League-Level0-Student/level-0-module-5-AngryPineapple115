//COLORCHOICE = (1 = 0), (2 = 1), (3 = 2)

package extra;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {

	public static void main(String[] args) {

		// 1. Create a new Robot
		Robot apple = new Robot(); 
		// 2. Set the speed to 100
		apple.setSpeed(100);
		int colorChoice = JOptionPane.showOptionDialog(null, "hello", "title", JOptionPane.INFORMATION_MESSAGE,
				JOptionPane.DEFAULT_OPTION, null, new String[] { "Red", "Green", "Blue" }, 0);
		System.out.println(colorChoice);
		// 3. Use if statements to check the the value of colorChoice and set the pen
		// color accordingly
		if (colorChoice == 0) {
			apple.setPenColor(Color.RED);
		} else if (colorChoice == 1) {
			apple.setPenColor(Color.GREEN);
		} else if (colorChoice == 2) {
			apple.setPenColor(Color.RED);
		}

		// 4. Ask the use how many polygons they want to be drawn.
		String poly = JOptionPane.showInputDialog("How many polygons do you want the robot to draw??");
		// 5. Use the robot to draw the number of polygons the user requested.
		int gon = Integer.parseInt(poly);

		apple.penDown();
		
		for (int a = 0; a < gon; a++) {
			for (int b = 0; b < 3; b++) {
				apple.move(15);
				apple.turn(60);
			}
		}
		// 6. Make it so your shapes do not overlap

		// 7. Challenge: add more colors to the Option Dialog.
	}
}