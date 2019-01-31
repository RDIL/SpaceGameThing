import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class GAME extends PApplet {

int hits = 0;
int miss = 0;
float x;
int wite = 255;
int r;
int g;

public void setup() {
  
}

public void draw() {
  resetBack();
  if (r > 0) {
    r -= 5;
  }
  
  if (g > 0) {
    g -= 5;
  }
  stroke(255);
  strokeWeight(8);
  line(width / 2, 0, width / 2, height);

  noStroke();
  fill(wite, wite, 0);
  ellipse(x, height / 2, 20, 20);

  if (g == 0 && r == 0) {
    x += 35;
    if (x > width) {
      x = 0;
    }
  }
}

public void keyPressed()
{
  println("Key Code: " + keyCode + ", Key: " + key);
  if (key == ' ') {
    if (x == width / 2) {
      g = 255;
      addPoint();
    } else {
      missvoid();
      r = 255;
    }
  }
}

public void resetBack() {
  background(r, g, 0);
}

public void addPoint() {
  hits += 1;
}

public void missvoid() {
  miss += 1;
}
  public void settings() {  size(800, 800); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "--present", "--window-color=#050000", "--stop-color=#cccccc", "GAME" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
