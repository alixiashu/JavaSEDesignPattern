package designPattern.Factory.AbstractFactory;

public class ShapeFactory extends AbstractFactory{
	@Override
	public Shape getShape(String shapeType) {
		if(shapeType.equalsIgnoreCase("circle"))
			return new Circle();
		if(shapeType.equalsIgnoreCase("rectangle"))
			return new Rectangle();
		if(shapeType.equalsIgnoreCase("square"))
			return new Square();
		System.out.println("There is no this type of shape!");
		return null;
	}

	@Override
	public Color getColor(String colorType) {
		return null;
	}

	
}
