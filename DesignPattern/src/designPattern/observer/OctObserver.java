package designPattern.observer;

public class OctObserver extends Observer{

	public OctObserver(Object object) {
		super(object);
	}

	@Override
	public void react(int state) {
		System.out.println("state change to " + state);
	}

}
