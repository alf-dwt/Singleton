package cn.demo;

/**
 * 双检锁单例模式
 * @author Miao
 *
 */
public class SingletonDemo5 {
	private static volatile SingletonDemo5 instance;
	
	public static SingletonDemo5 getInstance() {
		if(instance == null) {
			synchronized (SingletonDemo5.class) {
				if(instance == null) {
					instance = new SingletonDemo5();
				}
			}
		}
		return instance;
	}
	
	private SingletonDemo5(){
	}
}
