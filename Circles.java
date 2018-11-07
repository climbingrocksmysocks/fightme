/*Isabel Anderson (ianders3)
 * Homework 10
 * Tuesday/Thursday 9:40-10:55 
 * I did not collaborate with anyone on this assignment.
 * This has the setup for drawing concentric circles.*/

import javax.swing.JFrame;

public class Circles{
	public static void main(String[] args) {
		JFrame frame = new JFrame("Circles");
		Canvas4 c = new Canvas4();
		frame.add(c);
		frame.setSize(c.getWidth(), c.getHeight());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
	}
}