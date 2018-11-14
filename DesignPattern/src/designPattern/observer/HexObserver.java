package designPattern.observer;

public class HexObserver extends Observer{

	public HexObserver(Object object) {
		super(object);
	}

	@Override
	public void react(int state) {
		String hexState = Integer.toHexString(state);
		System.out.println("state change to " + hexState);
	}

}
