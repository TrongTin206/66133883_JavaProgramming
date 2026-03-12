
public class TestCircle {
	public static void main(String[] args) {
		Circle c1 = new Circle();
	       System.out.println("Hinh tron đau tien co ban kinh la "  + c1.getRadius() + " va co dien tich la " + c1.getArea());
	    Circle c2 = new Circle(2.0);
	       System.out.println("Hinh tron thu hai co ban kinh la " + c2.getRadius() + " va co dien tich la " + c2.getArea());
	}
}
