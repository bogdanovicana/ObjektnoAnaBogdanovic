package geometry;

public class Test {

	public static void main(String[] args) {
		int broj = 20;
		System.out.println(broj);
		Point p1 = new Point ();
		System.out.println(p1);
		System.out.println(p1.getx());
		System.out.println(p1.gety());
		System.out.println(p1.selected());
		
		p1.set(100);
		System.out.println(p1.getx());
		
		Point p2 = new Point();
		
		
		System.out.println(p2.getX());
		p2 = p1;
		System.out.println(p2.getX());
		p2.setY(20);
		System.out.println(p1.getY());
		System.out.println(p2.getY());

	}

}
