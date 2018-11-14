package designPattern.Factory.baseFactory;

public class Test {
	public static void main(String[] args) {
		Shape s = ShapeFactory.getShape("circle");
		s.draw();
		Shape s1 = ShapeFactory.getShape("rectangle");
		s1.draw();
		Shape s2 = ShapeFactory.getShape("Square");
		s2.draw();
		
	}
}
