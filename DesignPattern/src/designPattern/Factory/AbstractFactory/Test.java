package designPattern.Factory.AbstractFactory;

public class Test {
	public static void main(String[] args) {
		
		AbstractFactory factoryShape = FactoryFactory.getFactory("Shape");
		factoryShape.getShape("rectangle").draw();
		factoryShape.getShape("square").draw();
		factoryShape.getShape("circle").draw();
		AbstractFactory factoryColor = FactoryFactory.getFactory("color");
		factoryColor.getColor("black").print();
		factoryColor.getColor("blue").print();
		factoryColor.getColor("red").print();
		
	}
}
