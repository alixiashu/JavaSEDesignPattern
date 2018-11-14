package designPattern.singleton;

public class TestSingleton {
	public static void main(String[] args) {
		SingletonLazy instance = SingletonLazy.getInstance();
		instance.sayHello();
		SingletonHungry in = SingletonHungry.getInstance();
		in.sayHello();
		SingletonHungry in2 = SingletonHungry.getInstance();
		in2.sayHello();
	}
}
