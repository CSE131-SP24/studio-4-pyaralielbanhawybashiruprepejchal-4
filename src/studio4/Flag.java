package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setScale(0.0, 100.0);
		Color pink = new Color(255, 116, 179);
		StdDraw.setPenColor(pink);
		StdDraw.filledRectangle(50, 50, 37.5, 22.5);
		StdDraw.filledCircle(18.75, 27.5, 6.25);
		StdDraw.filledCircle(81.25, 27.5, 6.25);
		double [] bigLX = {12.5, 31.25, 21.88};
		double [] bigLY = {72.5, 72.5, 85};
		StdDraw.filledPolygon(bigLX, bigLY);
		
		double [] bigRX = {87.5, 68.75, 78.13};
		double [] bigRY = {72.5, 72.5, 85};
		StdDraw.filledPolygon(bigRX, bigRY);
		
		//for small triangle 
		Color darkerPink = new Color(198, 60, 108);
		StdDraw.setPenColor(darkerPink);
		double [] smallLX = {15.63, 28.13, 21.88};
		double [] smallLY = {72.5, 72.5, 78.75};
		StdDraw.filledPolygon(smallLX, smallLY);
		double [] smallRX = {84.37, 71.88, 78.13};
		double [] smallRY = {72.5, 72.5, 78.75};
		StdDraw.filledPolygon(smallRX, smallLY);
		//now the face
		double [] noseX = {47.5, 50, 52.5};
		double [] noseY = {50, 47.5, 50};
		StdDraw.filledPolygon(noseX, noseY);
		//now the eyes
		StdDraw.setPenRadius(25);
		StdDraw.text(40, 60, ">");
		StdDraw.text(60, 60, "<");
		
	}
}