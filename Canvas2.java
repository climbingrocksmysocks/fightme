/*Isabel Anderson (ianders3)
 * Homework 10
 * Tuesday/Thursday 9:40-10:55 
 * I did not collaborate with anyone on this assignment.
 * This draws a bunch of intersecting diagonal lines. It goes with Fan.java.*/

import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Color;

public class Canvas2 extends JPanel{
	public Canvas2() {
		setSize(600, 600);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		for(int i = 0; i < 15; i++) {
			g.setColor(Color.BLACK);
			g.drawLine(0, 0, i * getWidth() / 15 , getHeight() - i * getHeight() / 15);
			g.drawLine(0, getHeight(), i * getWidth() / 15, i * getHeight() / 15);
			g.drawLine(getWidth(), getHeight(), i * getWidth() / 15, getHeight() - i * getHeight() / 15);
			g.drawLine(getWidth(), 0, i * getWidth() / 15, i * getHeight() / 15);
		}
	}
}