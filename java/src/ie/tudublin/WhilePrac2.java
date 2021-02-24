package ie.tudublin;

import processing.core.PApplet;

public class WhilePrac2 extends PApplet{

    float x =0;
    float y =0;
    int posX= 0;
    int posY= 0;
    float xspeed=10;
    float yspeed= (float) 5.3;
    float circleX;
    float circleY;
    float max_distance;
    int spacing = 20;
    
    

    public void settings(){
        size(1000,1000);
        max_distance = dist(0, 0, width, height);
        circleX = width/2;
        circleY = height/2;
    }
    public void draw(){
        background(120,0,255);
        fill(127);
        stroke(255);
        strokeWeight(2);
        int endX = width;
        int endY = height;

        //circle logic where the other will dodge it and shrink.
        ellipse(circleX, circleY, 24, 24);
        circleX = circleX +xspeed;
        circleY = circleY + yspeed;
        if(circleX > width || circleX < 0){
            xspeed = xspeed *-1;
        }
        if(circleY > height || circleY < 0){
            yspeed = yspeed *-1;
        }
        
        

        for(x=0; x< endX; x=x+spacing){
            for(y=0; y< endY; y=y+spacing){
                        float size = dist(circleX, circleY, x,y);
                        size = size/max_distance*30;
                        fill(255,120,20);
                        ellipse(x, y, size, size);
/* the size is by default set to the distance of the circle from x and y of the elipse
the size is then divided by the max distance which is the size of the area and multiplied by 30
so the further or closer the circle moves the more the size of the other change, being able to grow bigger or smaller.
*/						
            }
        }

       
    }
}