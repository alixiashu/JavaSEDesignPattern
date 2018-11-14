package designPattern.singleton;

public class SingletonHungry {
	private static int count = 0;
	//����ģʽ�����ڼ���ʱ����ʵ��
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
