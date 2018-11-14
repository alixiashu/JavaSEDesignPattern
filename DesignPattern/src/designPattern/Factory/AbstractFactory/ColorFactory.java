package designPattern.Factory.AbstractFactory;

public class ColorFactory extends AbstractFactory{
	@Override
	public Shape getShape(String shapeType) {
		return null;
	}

	@Override
	public Color getColor(String colorType) {
		if(colorType.equalsIgnoreCase("Black"))
			return new Black();
		if(colorType.equalsIgnoreCase("Blue"))
			return new Blue();
		if(colorType.equalsIgnoreCase("Red"))
			return new Red();
		System.out.println("There is no this type of color!");
		return null;
	}

	
}
