package geometry;

public class Test {

	public static void main(String[] args) {
		int broj = 20;
		System.out.println(broj);
		Point p1 = new Point ();
		System.out.println(p1);
//		System.out.println(p1.getx());
//		System.out.println(p1.gety());
//		System.out.println(p1.selected());
//		
//		p1.set(100);
		System.out.println(p1.getX());
		
		Point p2 = new Point();
		
		
//		System.out.println(p2.getX());
		p2 = p1;
//		System.out.println(p2.getX());
//		p2.setY(20);
//		System.out.println(p1.getY());
//		System.out.println(p2.getY());
		
//      VEZBE 4
		Line l1 = new Line ();
//      Linija ima startPoint, endPoint i selected
		l1.setStartPoint(p2);
		l1.setEndPoint(new Point());
		
		System.out.println(l1.getStartPoint());
		System.out.println(l1.getEndPoint());
		System.out.println(l1.isSelected());
		
		System.out.println(l1.getStartPoint().getX());
		
		System.out.println("Duzina linije l1 je: " + l1.length());
		

	}

}
