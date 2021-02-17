package MyCode;

import processing.core.PApplet;

//rect goes x, y, width, height
//eg 200 to 150, width of 50px and height of 35 px

//Stroke is the outline of an object
//Fill is the inside colouring of an object.
//fill(0,255,0) this is green because it goes red green blue

//background(0) makes a black background or you can use 
public class Process1 extends PApplet
{
    float circleX;
    float circleY;
    boolean going = false;

    public void settings() {
        size(1000, 600);
    }
    public void setup(){
    }

    public void draw() {
        background(0);

        if(mouseX >500){
            fill(255,0,0);
            rect(300,100,50,50);
        }
        else if(mouseX>400){
            fill(0,255,0);
            rect(300,300,50,50);
        }
        else if(mouseX>300){
            fill(0,200,180);
            rect(400,300,50,50);
        }
        else if(mouseX>200){
            fill(255,255,0);
            rect(400,100,50,50);
        }
        stroke(255);
        line(100,0,100,height);
        line(200,0,200,height);
        line(300,0,300,height);
        line(400,0,400,height);
        line(500,0,500,height);
    }
    
    public void mousePressed(){
        if(going == true){
            going=false;
        }
        else if(going == false){
            going=true;
        }
    }
}


/*deleted code
moving rect--------
background(0);
        fill(0,255,0);
        rectMode(CENTER);
        rect(mouseX, mouseY, 100, 50);


        drawing------
        stroke(0,255,0);
        line(pmouseX, pmouseY, mouseX, mouseY);

        move circle=------
        circleX = circleX + 1;

        Cirlce------------
        circleX = random(width);
        circleY = random(height);
        background(50);
        ellipse(circleX,circleY,24,24);
        circleX = circleX + random(-2,0);
        println(circleX);


        */