package ie.tudublin;

import processing.core.PApplet;

public class HelloProcessing2 extends PApplet
{

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		
	}
	
	public void draw()
	{	
		int x=0;
		background(255,0,0); //black
		while(x<=250) 
		{
		ellipse(x, 50, 50, 50);
		x++;
		println(x);
		}

		noStroke();
		fill(255,204,0);
		circle(250, 290, 370);
		point(200,60);
		fill(0,230,255);
		triangle(250, 75, 452, 452, 75, 452);
		fill(192,192,192);
		ellipse(255, 250, 168, 100); // cx, cy, w, h
		fill(0);
		circle(255, 250, 68);

		fill(0);
	}
}
