package cn.demo;

/**
 * 双重检测锁单例模式
 * @author Miao
 *
 */
public class SingletonDemo5 {
	private static SingletonDemo5 instance = null;
	
	public static SingletonDemo5 getInstance() {
		if(instance == null) {
			SingletonDemo5 sc;
			synchronized (SingletonDemo5.class) {
				sc = instance;
				if(sc == null) {
					synchronized (SingletonDemo5.class) {
						if(sc == null) {
							sc = new SingletonDemo5();
						}
					}
					instance = sc;
				}
			}
		}
		return instance;
	}
	
	private SingletonDemo5(){
	}
}
