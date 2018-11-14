package designPattern.bridge;

public class Circle extends Shape{

	public Circle(DrawAPI drawApi) {
		super(drawApi);
	}

	@Override
	public void draw() {
		System.out.println("Circle draw...");
		drawApi.draw();
	}

	
}
