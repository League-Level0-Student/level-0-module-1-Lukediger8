
void setup() {
  PImage face = loadImage("zombieFace.jpg");

  size(500, 500);
  face.resize(500, 500);
  image(face, 0, 0);
}
void draw() {
  fill(mouseX,mouseY,50);
  ellipse(146, 244, 140, 140);
  ellipse(328, 235, 140, 140);
  if (mousePressed) {
    println(mouseX, mouseY);
  }
  fill(#050502);
  ellipse(146, 244, 90, 90);
  ellipse(328,235,90,90);
}
