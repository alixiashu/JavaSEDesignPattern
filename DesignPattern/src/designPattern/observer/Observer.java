package designPattern.observer;

public abstract class Observer {
	public Observer(Object object) {
		object.attach(this);
	}
	public abstract void react(int state);
}
