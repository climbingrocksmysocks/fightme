/*Isabel Anderson (ianders3)
 * Homework 10
 * Tuesday/Thursday 9:40-10:55 
 * I did not collaborate with anyone on this assignment.
 * This has the setup for drawing a bunch of diagonal lines.*/

import javax.swing.JFrame;

public class Fan{
	public static void main(String[] args) {
		JFrame frame = new JFrame("Fan");
		Canvas2 c = new Canvas2();
		frame.add(c);
		frame.setSize(c.getWidth(), c.getHeight());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
	}
}