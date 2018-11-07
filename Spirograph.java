/*Isabel Anderson (ianders3)
 * Homework 10
 * Tuesday/Thursday 9:40-10:55 
 * I did not collaborate with anyone on this assignment.
 * This has the setup for drawing a bunch of lines.*/

import javax.swing.JFrame;

public class Spirograph{
	public static void main(String[] args) {
		JFrame frame = new JFrame("Spirograph");
		Canvas3 c = new Canvas3();
		frame.add(c);
		frame.setSize(c.getWidth(), c.getHeight());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
	}
}