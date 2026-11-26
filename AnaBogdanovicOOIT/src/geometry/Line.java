package geometry;

import java.awt.Graphics;

public class Line extends Shape {

	private Point startPoint;
	private Point endPoint;
	
	public Line() {
		
	}
	public Line(Point startPoint, Point endPoint) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
		
	}
	
	public Line (Point startPoint, Point endPoint, boolean selected) {
		this(startPoint, endPoint);
		this.selected = selected;
		
	}
	
	
	public double length() {
		return startPoint.distance(endPoint);
	}
	
	public Point getStartPoint() {
		return startPoint;
	}
    public Point getEndPoint() {
    	return endPoint;
   
    }
    
    public void setStartPoint(Point startPoint) {
    	this.startPoint = startPoint;	
    }
    public void setEndPoint(Point endPoint) {
    	this.endPoint = endPoint;	
    }
	@Override
	public void draw(Graphics g) {
		g.drawLine(startPoint.getX(), startPoint.getY(), endPoint.getX(), endPoint.getY());
		
	}
   
    	
    }




