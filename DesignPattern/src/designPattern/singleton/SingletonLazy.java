package designPattern.singleton;

public class SingletonLazy {
	//����ģʽ�����ڼ���ʱ����ʵ��
	private static SingletonLazy instance;
	private SingletonLazy() {};
	public static SingletonLazy getInstance() {//���Լ�synchronized��֤�̰߳�ȫ
		if(instance == null) //�ڵ��õ�ʱ�����ʵ����������Ƿ񴴽�ʵ��
			instance = new SingletonLazy();
		return instance;
	}
	public void sayHello() {
		System.out.println("Hello,lazy!");
	}
	
}
