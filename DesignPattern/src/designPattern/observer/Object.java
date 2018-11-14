package designPattern.observer;

import java.util.LinkedList;
import java.util.List;

public class Object {
	
	private List<Observer> observers ;
	private int state;
	public Object() {
		this.observers = new LinkedList<>();
		state = 0;
	}
	
	public int getState(){
		return state;
	}
	
	public void setState(int state) {
		this.state = state;
		notifyAllObserver();
	}
	
	public void attach(Observer observer) {
		observers.add(observer);
	}

	private void notifyAllObserver() {
		for (Observer observer : observers) {
			observer.react(state);
		}
	}
	

}
