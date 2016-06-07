package cn.demo;

/**
 * 懒汉式单例模式
 * @author Miao
 *
 */
public class SingletonDemo2 {
	
	//类加载时不创建对象
	private static SingletonDemo2 instance;
	
	//构造器私有化
	private SingletonDemo2 (){
	}
	
	//方法同步,执行效率不高,支持延时加载
	public static synchronized SingletonDemo2 getInstance(){
		if(instance == null) {
			instance = new SingletonDemo2();
		}
		return instance;
	}
}
