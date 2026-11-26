package geometry;

import java.awt.Graphics;

public class Rectangle extends Shape{
	
	private Point upperLeft;
	private int width;
	private int height;
	
	public Rectangle () {
		
	}
	
	public Rectangle(Point upperLeft, int width, int height) {
		this.upperLeft = upperLeft;
		this.width = width;
		this.height = height;
		
	}
	
	public Rectangle(Point upperLeft, int width, int height, boolean selected) {
		this(upperLeft, width, height);
		this.selected = selected;
		
	}
	
	@Override
	public void draw(Graphics g) {
		g.drawRect(upperLeft.getX(), upperLeft.getY(), width, height);
	}
	
	
	public int area() {
		return width*height;
	}
	
	public int circumference() {
		return 2*(width+height);
	}

	
	public Point getUpperLeft() {
		return upperLeft;
	}

	public int getWidth(){
		return width;	
	}
	
	public int getHeight() {
		return height;
	}
	
	
	public void setUpperLeft(Point upperLeft){
	    this.upperLeft = upperLeft;
	}
	
	public void getWidth(int width) {
    	this.width = width;
	}



		
	}
   
     	
   
    

