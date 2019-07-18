PImage backgroundImage;
import ddf.minim.*;
  Minim minim;
  AudioSample sound;
int ballX = 100;
int speedX = 15;
int ballY = 400; 
int speedY = 15;
void setup(){
  size (1000,1000);
  background(0,0,0);
  minim = new Minim (this);
  sound = minim.loadSample("pong.wav", 128);
 backgroundImage = loadImage("pong.png");
  backgroundImage.resize(width,height);
}

void draw(){
  image(backgroundImage, 0, 0);
  fill(10000000,10000000,10000000);
  stroke(100,100,100);
  ellipse(ballX,ballY, 50, 50);
  fill ( 0,100,0);
  rect(mouseX,900,100,25);
  ballX+=speedX;
 if (ballX >= width || ballX <= 0){
   speedX*=-1;
  }
  ballY+=speedY;
  if (ballY >= height || ballY <= 0){
   speedY*=-1;
  }
  if (ballY >= height ){
     sound.trigger();
  }
}
