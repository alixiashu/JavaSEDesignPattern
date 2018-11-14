package designPattern.decorator;

public abstract class DecoratorShape implements Shape{
	public Shape shape;
	public DecoratorShape(Shape shape) {
		this.shape = shape;
	}
	public abstract void decorate(Shape shape);
}
