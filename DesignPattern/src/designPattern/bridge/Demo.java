package designPattern.bridge;

public class Demo {
	public static void main(String[] args) {
		DrawAPI d = new RedDrawAPI();
		Shape s = new Circle(d);
		s.draw();
		
		d = new BlueDrawAPI();
		s = new Rectangle(d);
		s.draw();
	}
}
