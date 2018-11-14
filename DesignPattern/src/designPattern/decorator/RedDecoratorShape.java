package designPattern.decorator;

public class RedDecoratorShape extends DecoratorShape{

	public RedDecoratorShape(Shape shape) {
		super(shape);
	}

	@Override
	public void draw() {
		shape.draw();
		decorate(shape);
	}

	@Override
	public void decorate(Shape shape) {
		System.out.println("printing red");
	}

}
