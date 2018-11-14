package designPattern.observer;

public class Demo {
	public static void main(String[] args) {
		Object object = new Object();
		new BinObserver(object);
		new OctObserver(object);
		new HexObserver(object);
		object.setState(555);
	}
}
