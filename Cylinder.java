
public class Cylinder {
	private double height;
	Circle base;
	
	public double volume() {
		// volume = base area * height
		
		return base.area() * height;
	}
}
