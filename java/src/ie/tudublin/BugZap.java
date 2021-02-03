package ie.tudublin;

import processing.core.PApplet;

public class BugZap extends PApplet 
{

    public void settings()
	{
		size(900, 900);
	}

    public void setup() 
    {
		
		
    }

    public void keyPressed()
	{
		if (keyCode == LEFT)
		{
            playerX -= 10;
            playerY +=10;
		}
		if (keyCode == RIGHT)
		{
            playerX += 10;
            playerY -=10;
		}
		if (key == ' ')
		{
			System.out.println("SPACE key pressed");
		}
	}	

    float playerX = 60;
    float playerY = 60;
    float playerWidth = 80;
	float x1dir, x2dir, y1dir, y2dir;
    float c = 0;
    
    void drawPlayer(float x, float y, float w)
    {
        strokeWeight(2);
		stroke(c, 255, 255);
		c = (c + 1f) % 255;
        line(x, y-40, x-40, y);
        line(x,y-40, x+40, y);
        line(x-40, y, x+40, y);
        line(x-20, y-30, x-50, y-50);
        line(x+20, y-30, x+50, y-50);
        line(x, y, x, y+40);
        line(x-40, y, x, y+40);
        line(x+40, y, x, y+40);
        line(x, y, x, y+40);
        line(x-40, y, x-50, x-50);
        line(x-50, y-50, x+50, y-50);
        line(x+50, x-50, x+40, y);
    }
	
	public void draw()
	{	
        drawPlayer(playerX, playerY, playerWidth);
        
	}
}
    

