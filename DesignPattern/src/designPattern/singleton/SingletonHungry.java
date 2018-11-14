package designPattern.singleton;

public class SingletonHungry {
	private static int count = 0;
	//懒汉模式，不在加载时创建实例
	private static SingletonHungry instance = new SingletonHungry();
	private SingletonHungry() {};
	public static SingletonHungry getInstance() {
		count++;
		return instance;
	} 
	public void sayHello() {
		System.out.println("Hello,"+count+"th hungry!");
	}
}
