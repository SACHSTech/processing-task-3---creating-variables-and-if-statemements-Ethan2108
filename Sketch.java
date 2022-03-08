import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(500, 500);
  }

  public void setup() {
  // Blue background
    background(0, 255, 255);

  // current date and time
  fill(0, 0, 0);
  textSize(20);
  text(day() + "/" + month() + "/" + year() + "  " + (hour() + ":" + minute() + ":" + second()), 20, 30);

  // random sun dimensions
  float sunX = random(0, 500);
  float sunY = random(0, 500);

  // variables for the position of the sun
  boolean sunLeft = sunX >= 250;
  boolean sunRight = sunX <= 249;
  boolean sunUp = sunY <= 250; 
  boolean sunDown = sunY >=249;

  boolean sunTopLeft = sunUp && sunLeft;
  boolean sunTopRight = sunUp && sunRight;
  boolean sunBottomLeft = sunDown && sunLeft;
  boolean sunBottomRight = sunDown && sunRight;

  // if statements to set background colour 
  if (sunTopLeft) {
    background(0, 255, 255);
  }
  if (sunTopRight) {
    background(209, 101, 0);
  }
  if (sunBottomLeft) {
    background(0, 100, 150);
  }
  if (sunBottomRight) {
    background(100, 0, 200);}
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	// Sun
  fill(246, 255, 0);
  ellipse(460, 50, 150, 150);

  // House
  fill(0, 0, 0);
  rect(120, 240, 220, 220);
  
  // Window 1
  fill(222, 222, 222);
  rect(130, 290, 50, 50);

  // Window 2
  fill(222, 222, 222);
  rect(200, 290, 50, 50);

  // Window 3
  fill(222, 222, 222);
  rect(270, 290, 50, 50);

  // Grass
  fill(8, 242, 0);
  rect(0, 450, 500, 80);

  // Pathway
  fill(216, 227, 148);
  rect(200, 450, 70, 80);

  // Roof
  fill(44, 101, 156);
  triangle(80, 240, 250, 140, 380, 240);





  }
  
  // define other methods down here.
}