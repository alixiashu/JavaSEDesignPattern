package designPattern.bridge;

public class RedDrawAPI implements DrawAPI{

	@Override
	public void draw() {
		System.out.println("printing red...");
	}

}
