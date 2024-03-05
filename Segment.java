public class Segment {

  private Point origin, end;

//  public Segment(Point pnt1, Point pnt2) { 
//    origin = pnt1;
//    end = pnt2;
//  }

public Segment(Point pnt1, Point pnt2) { 
    origin = new Point(pnt1.abscissa(), 
    		           pnt1.ordinate());
    end = new Point(pnt2.abscissa(), 
    		        pnt2.ordinate());
  }

  // Other methods ...

  public double length() {
    return origin.distance(end);
  }
}
