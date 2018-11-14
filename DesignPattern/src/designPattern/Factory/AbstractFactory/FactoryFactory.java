package designPattern.Factory.AbstractFactory;

public class FactoryFactory {
	static AbstractFactory getFactory(String factoryName) {
		if(factoryName.equalsIgnoreCase("Shape"))
			return new ShapeFactory();
		if(factoryName.equalsIgnoreCase("Color"))
			return new ColorFactory();
		System.out.println("There is no such factory!");
		return null;
	}
}
