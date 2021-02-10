package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet {

    public void settings() {
        size(500, 500);
        cx = width / 2;
        cy = height / 2;        
    }

    int mode = 0;

    float cx;
    float cy;

    public void keyPressed() {
        // the value of mode will be the number of the 
        // number key pressed
        if (keyCode >= '0' && keyCode <= '9')
            mode = keyCode - '0';
    }

    public void setup() {
        colorMode(HSB); //hue saturation and brightness
    }

    public void draw() {
        background(0);
        noStroke();
        switch (mode)
        {
            case 0:
                if(mouseX < cx){
                    fill(50,255,200);
                    rect(0, 0, cx, height);
                } //cx is wdith/2
                else{
                    fill(50,255,200);
                    rect(cx, 0, cx, height);
                }
                break;
            case 1:
                if(mouseX < cx && mouseY < cy){
                    fill(120, 175, 100);
                    rect(0,0,cx, cy);
                }
                else if(mouseX > cx && mouseY < cy) {
                    fill(120,175,100);
                    rect(cx, 0, cx, cy);
                }
                if(mouseY > cy && mouseX < cx){
                    fill(120,175,100);
                    rect(0, 250, cx, cy);
                }
                else if(mouseY > cy && mouseX > cx){
                    fill(120,175,100);
                    rect(250, 250, cx, cy);
                }
            case 2:
            int numSquares = 10;
                float w = width/(float)numSquares, h = height/(float)numSquares, colour=255/(float)numSquares;
                for(int i=0; i<numSquares;i++){
                    fill(i*colour,255,255);
                    rect(w*i,h*i,w,h);
                }
            
        }
    }
}
