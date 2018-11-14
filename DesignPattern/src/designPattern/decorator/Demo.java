package designPattern.decorator;

public class Demo {
	public static void main(String[] args) {
		Shape s = new Circle();
		RedDecoratorShape red = new RedDecoratorShape(s);
		s.draw();
		red.draw();
		s = new Rectangle();
		red = new RedDecoratorShape(s);
		s.draw();
		red.draw();
	}
}
