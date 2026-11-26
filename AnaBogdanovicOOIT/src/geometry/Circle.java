package geometry;

import java.awt.Graphics;

public class Circle extends Shape {


protected int radius;
protected Point center;


public Circle() {
	
}

public Circle(Point center, int radius) {
	this.center = center;
	this.radius = radius;
}

public Circle(Point center, int radius, boolean selected) {
	this(center,radius);
	this.selected = selected;
}

@Override
public void draw(Graphics g) {
	g.drawOval(center.getX()-radius, center.getY()-radius, radius*2, radius*2);
}

public double area() {
	return radius * radius * Math.PI;
}

public double circumference() {
	return 2 * radius * Math.PI;
}

public boolean contains(int x, int y) {
	Point click = new Point(x,y);
	return center.distance(click) <= radius;
}

public boolean contains(Point p) {
	return contains(p.getX(), p.getY());
}

@Override
public String toString() {
	return String.format("Center: (%s, %s), radius: %s", center.getX(), center.getY(), radius);
}

@Override
public boolean equals(Object o) {
	if(o instanceof Circle) {
		Circle temp = (Circle)o;
		if(radius == temp.getRadius()) {
			return true;
		}
	}
	return false;
}

public int getRadius() {
	return radius;
}

public void setRadius(int radius) {
	this.radius = radius;
}

public Point getCenter() {
	return center;
}

public void setCenter(Point center) {
	this.center = center;
}


	
}








