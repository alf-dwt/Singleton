package cn.demo;

import java.io.Serializable;

/**
 * 饿汉式单例模式
 * @author Miao
 *
 */
public class SingletonDemo6 implements Serializable{
	//类加载时就创建对象
	private static final SingletonDemo6 INSTANCE = new SingletonDemo6();
	
	//构造器私有化
	private SingletonDemo6(){
	}
	
	//方法不同步,执行效率高,不支持延时加载
	public static SingletonDemo6 getInstance(){
		return INSTANCE;
	}
}
