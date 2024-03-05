package pac1;

public class Segment {

	private Point origin, end;

	public Segment(double x1, double y1, double x2, double y2) {
		origin = new Point(x1, y1);
		end = new Point(x2, y2);
	}
	
	// Rest of methods
	
	public double length() {
		return origin.distance(end);
	}
}
