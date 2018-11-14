package designPattern.bridge;

public abstract class Shape {
	public DrawAPI drawApi;
	public Shape(DrawAPI drawApi) {
		this.drawApi = drawApi;
	}
	public abstract void draw();
}
