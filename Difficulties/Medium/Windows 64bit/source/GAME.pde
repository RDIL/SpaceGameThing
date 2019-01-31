int hits = 0;
int miss = 0;
float x;
int wite = 255;
int r;
int g;

void setup() {
  size(800, 800);
}

void draw() {
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
    x += 20;
    if (x > width) {
      x = 0;
    }
  }
}

void keyPressed()
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

void resetBack() {
  background(r, g, 0);
}

void addPoint() {
  hits += 1;
}

void missvoid() {
  miss += 1;
}