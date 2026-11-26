package geometry;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestDrawing extends JPanel {
	
	public static void main(String[] args) {
		TestDrawing panel = new TestDrawing();
		JFrame frame = new JFrame();
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		frame.setContentPane(panel);
		frame.setVisible(true);
	}

	public void paint(Graphics g) {
		g.setColor(Color.blue);
		
		
		Point p = new Point(300,300);
		p.draw(g);
		Point p2 = new Point(450,450);
		Line l1 = new Line(p, p2);
		g.setColor(Color.red);
		l1.draw(g);
		
		Rectangle r1 = new Rectangle(p, 50, 50);
		g.setColor(Color.green);
		r1.draw(g);
		
//	    Rectangle r2 = new Rectangle(p, -50, -50);
//		g.setColor(Color.orange);
//		r2.draw(g);
		
		Rectangle r2 = new Rectangle(new Point(100,100), 100, 100);
		Circle c1 = new Circle(new Point(150,150), 50);
		g.setColor(Color.orange);
		r2.draw(g);
		c1.draw(g);
		
	}
}
