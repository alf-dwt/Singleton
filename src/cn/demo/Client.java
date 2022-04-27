package cn.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 利用反射或序列化破解单例模式的方法
 * @author Miao
 * 说明SingletonDemo6与SingletonDemo1重复，已被删除。
 */
public class Client {

	public static void main(String[] args) throws Exception {
		SingletonDemo6 s1 = SingletonDemo6.getInstance();
		SingletonDemo6 s2 = SingletonDemo6.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		
		//利用反射破解单例
//		Class<SingletonDemo6> clazz = (Class<SingletonDemo6>) Class.forName("cn.demo.SingletonDemo6");
//		Constructor<SingletonDemo6> c = (Constructor<SingletonDemo6>) clazz.getDeclaredConstructor(null);
//		c.setAccessible(true);
//		SingletonDemo6 s3 = c.newInstance();
//		SingletonDemo6 s4 = c.newInstance();
		
		//利用反序列化破解单例
		File file = new File("e:\\temp\\a.txt");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
		oos.writeObject(s1);
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
		SingletonDemo6 s3 = (SingletonDemo6) ois.readObject();
		ois.close();
		
		System.out.println(s3);
	}

}
