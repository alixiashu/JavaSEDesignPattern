package designPattern.singleton;

public class SingletonLazy {
	//懒汉模式，不在加载时创建实例
	private static SingletonLazy instance;
	private SingletonLazy() {};
	public static SingletonLazy getInstance() {//可以加synchronized保证线程安全
		if(instance == null) //在调用的时候根据实际情况决定是否创建实例
			instance = new SingletonLazy();
		return instance;
	}
	public void sayHello() {
		System.out.println("Hello,lazy!");
	}
	
}
