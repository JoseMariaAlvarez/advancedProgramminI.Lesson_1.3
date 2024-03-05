
public class SegmentTest {

	public static void main(String[] args) {
		Point p1 = new Point (1.0d, 2.0d);
		Point p2 = new Point (3.0d, 4.0d);
		
		Segment s = new Segment(p1, p2);
		
		System.out.println(s.length());

	}

}
