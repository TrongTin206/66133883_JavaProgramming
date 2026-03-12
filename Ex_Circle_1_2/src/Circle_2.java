
public class Circle_2 {

	    private double radius;
	    public Circle_2() {
	        radius = 1.0;
	    }
	    public Circle_2(double r) {
	        radius = r;
	    }
	    public double getRadius() {
	        return radius;
	    }
	    public void setRadius(double r) {
	        radius = r;
	    }
	    public double getArea() {
	        return radius * radius * Math.PI;
	    }
	    public double getCircumference() {
	        return 2 * Math.PI * radius;
	    }
	    public String toString() {
	        return "Circle[radius=" + radius + "]";
	}
}
