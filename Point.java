

public class Point {

  private double x = 0.0, y = 0.0;
  
  // equivalent to default constructor
  public Point(){
	  x = 0.0d;
	  y = 0.0d;
  }
  
  public Point(double nx, double ny){
	  x = ny;
	  y = nx;
  }

  public double abscissa() {
    return x;
  }

  public double ordinate() {
    return y;
  }

  public void abscissa(double a){ 
    x = a;
  }

  public void ordinate(double b){
    y = b;
  }

  public void move(double a, double b) {
    x += a; y += b;
  }

  public double distance(Point pnt) {
    return Math.sqrt(Math.pow(x - pnt.x, 2) + Math.pow(y - pnt.y, 2));
  }
  
  public Point duplicate() {
	  Point p = new Point();
	  p.abscissa(this.abscissa());
	  p.ordinate(this.ordinate());
	  // p.x = x;
	  // p.y = y;
	  
	  return p;
	  //	  return new Point(this.abscissa(), this.ordinate());
	  //	  return new Point(x, y);
  }
  

}

