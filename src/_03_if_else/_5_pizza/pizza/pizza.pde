PImage pepperoni;
PImage olive;
void setup() {
pepperoni=loadImage("pepperoni.png");
olive=loadImage("olive.png");
size(500,500);
fill(#B1B256);
ellipse(250,250,400,400);
fill(#F20000);
ellipse(250,250,300,300);
fill(#DED15E);
ellipse(250,250,250,250);
pepperoni.resize(30,30);
olive.resize(30,30);
}
void draw() {
    image(pepperoni,200,200);
    image(olive,150,150);
}
