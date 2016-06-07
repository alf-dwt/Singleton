package cn.demo;

/**
 * 静态内部类实现单例模式
 * @author Miao
 *
 */
public class SingletonDemo3 {
	
	//静态内部类,类加载时不创建单例对象
	private static class SingletonInnerClass {
		private static final SingletonDemo3 INSTANCE = new SingletonDemo3();
	}
	
	//构造器私有化
	private SingletonDemo3(){
	}
	
	//方法不同步,执行效率高,支持延时加载
	public static SingletonDemo3 getInstance(){
		return SingletonInnerClass.INSTANCE;
	}
}
