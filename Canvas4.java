/*Isabel Anderson (ianders3)
 * Homework 10
 * Tuesday/Thursday 9:40-10:55 
 * I did not collaborate with anyone on this assignment.
 * This draws multicolored concentric circles. It goes with Circles.java.*/

import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Color;
import java.util.Random;

public class Canvas4 extends JPanel{
	public Canvas4() {
		setSize(600, 600);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		Random rand = new Random();
		Color c;
		for(int r = 10; r < 130; r += 10) {
			c = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
			g.setColor(c);
			g.drawOval(getWidth() / 2 - r, getHeight() / 2 - r, 2 * r, 2 * r);
		}
	}
}