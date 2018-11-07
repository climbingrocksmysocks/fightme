/*Isabel Anderson (ianders3)
 * Homework 10
 * Tuesday/Thursday 9:40-10:55 
 * I did not collaborate with anyone on this assignment.
 * This makes curved thingies in each corner of the canvas. It goes with Spirograph.java.*/

import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Color;

public class Canvas3 extends JPanel{
	public Canvas3() {
		setSize(600, 600);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		g.setColor(Color.MAGENTA);
		int numLines = 15;
		for(int i = 0; i < numLines; i++) {
			g.drawLine(0, i * getHeight() / numLines, i * getWidth() / numLines, getHeight());
			g.drawLine(i * getWidth() / numLines, 0, getWidth(), i * getHeight() / numLines);
			g.drawLine(getWidth(), i * getHeight() / numLines, getWidth() - i * getWidth() / numLines, getHeight());
			g.drawLine(0, getHeight() - i * getHeight() / numLines, i * getWidth() / numLines, 0);
		}
		
	}
}