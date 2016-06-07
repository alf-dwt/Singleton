package cn.demo;

/**
 * 饿汉式单例模式
 * @author Miao
 *
 */
public class SingletonDemo1 {
	//类加载时就创建对象
	private static final SingletonDemo1 INSTANCE = new SingletonDemo1();
	
	//构造器私有化
	private SingletonDemo1(){
	}
	
	//方法不同步,执行效率高,不支持延时加载
	public static SingletonDemo1 getInstance(){
		return INSTANCE;
	}
}
