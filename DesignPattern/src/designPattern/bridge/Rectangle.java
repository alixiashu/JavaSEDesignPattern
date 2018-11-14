package designPattern.bridge;

public class Rectangle  extends Shape{

	public Rectangle(DrawAPI drawApi) {
		super(drawApi);
	}


	@Override
	public void draw() {
		System.out.println("Rectangle draw...");
		drawApi.draw();
	}

	
}
