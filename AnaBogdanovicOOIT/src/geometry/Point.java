package geometry;

import java.awt.Graphics;

public class Point extends Shape{


private int x;
private int y;


public Point() {
	
}

public Point(int x, int y) {
	this.x = x;
	this.y = y;
	
	
}

public Point(int x, int y, boolean selected) {
	this(x,y);
	this.selected=selected;
} 

public double distance (Point p) {
	double dx = x - p.getX();
	double dy = y - p.getY();
	return Math.sqrt(dx*dx + dy*dy);
	
}

public int getX() {
		return x;
}
public int getY() {
		return y;
		
}

		
public void setX(int x) {
		this.x = x;
			
}

public void setY(int y) {
		this.y = y;
		
}

@Override
public void draw(Graphics g){
	g.drawLine(x + 3, y, x - 3, y);
	g.drawLine(x, y + 3, x, y - 3);
	// TODO Auto-generated method stub
	
}


		
}
