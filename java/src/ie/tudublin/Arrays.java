package ie.tudublin;

import processing.core.PApplet;

public class Arrays extends PApplet {

    public float map1(float from, float start, float stop, float start2, float stop2)
    {
        float range1 = stop - start;
        float range2 = stop2 - start2;
        float howfar = from - start;

        return start2 + (howfar / range1) * range2;
    }

    public void drawGrid()
    {
        stroke(0, 255, 0);
        float border = width * .05f;
        textAlign(CENTER, CENTER);
        for(int i = -5; i<=5; i++)
        {
            float x = map1(i, -5, 5, border, width - border); //This maps a grid every 10%
            line(x, border, x, height - border);//vertical lines
            line(border, x, width - border, x);
            fill(255);
            text(i, x, border *0,5f);
            text(i, border * 0.5f, x);
        }

    }

    public void settings() {
        size(500, 500);      
        
        float f = map1(2, 0, 10, 0, width); //20% of the ay from 0 and 10
        println(f);//should print 100

        f = map1(9, 0, 1, 0, 10);
        println(f); //90


        f = map1(250, 200, 300, 400, 500); //50% between 200 and 300
        println(f); //450

        f= map1(5, 0, 10, 1000, 2000);
        println(f); //1500
    }

    int mode = 0;

    public void keyPressed() {
        // the value of mode will be the number of the 
        // number key pressed
        if (keyCode >= '0' && keyCode <= '9')
            mode = keyCode - '0';
    }

    public void setup() {
        colorMode(RGB);
    }

    float offset = 0;

    public void draw() {
        background(0);
        drawGrid();
    }
}
