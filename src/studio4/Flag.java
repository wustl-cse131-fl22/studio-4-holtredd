package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		Color teal = new Color(0, 171, 150);
		StdDraw.setPenColor(teal);
		StdDraw.filledCircle(0.5, 0.5, 0.37);
		
		Color purple = new Color(136, 123, 237);
		StdDraw.setPenColor(purple);
		StdDraw.filledCircle(0.5, 0.5, 0.27);
		
		Color bluey = new Color(16, 181, 255);
		StdDraw.setPenColor(bluey);
		StdDraw.filledCircle(0.5, 0.5, 0.17);
		
		Color reddish = new Color(255, 44, 64);
		StdDraw.setPenColor(reddish);
		StdDraw.filledCircle(0.5, 0.5, 0.07);
		
		StdDraw.filledCircle(0.5, 0.94, 0.05);
		StdDraw.filledCircle(0.1, 0.1, 0.05);
		StdDraw.filledCircle(0.9, 0.1, 0.05);
		
		Color black = new Color(0, 0, 0);
		StdDraw.setPenColor(black);
		StdDraw.line(0.1, 0.1, 0.5, 0.94);
		StdDraw.line(0.5, 0.94, 0.9, 0.1);
		StdDraw.line(0.1, 0.1, 0.9, 0.1);
		
		double radius = .02;
		StdDraw.setPenRadius(radius);
		StdDraw.rectangle(.5, .5, 0.49, 0.49);
	}

	private static void setPenRadius(double d) {
		// TODO Auto-generated method stub
		
	}
}