package designPattern.observer;

public class BinObserver extends Observer{

	public BinObserver(Object object) {
		super(object);
	}

	@Override
	public void react(int state) {
		String binState = Integer.toBinaryString(state);
		System.out.println("state change to "+binState);
		
	}

}
