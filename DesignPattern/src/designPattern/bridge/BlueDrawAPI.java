package designPattern.bridge;

public class BlueDrawAPI implements DrawAPI{

	@Override
	public void draw() {
		System.out.println("printing blue...");
	}

}
