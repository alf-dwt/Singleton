package cn.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * ���÷�������л��ƽⵥ��ģʽ�ķ���
 * @author Miao
 *
 */
public class Client {

	public static void main(String[] args) throws Exception {
		SingletonDemo6 s1 = SingletonDemo6.getInstance();
		SingletonDemo6 s2 = SingletonDemo6.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		
		//���÷����ƽⵥ��
//		Class<SingletonDemo6> clazz = (Class<SingletonDemo6>) Class.forName("cn.demo.SingletonDemo6");
//		Constructor<SingletonDemo6> c = (Constructor<SingletonDemo6>) clazz.getDeclaredConstructor(null);
//		c.setAccessible(true);
//		SingletonDemo6 s3 = c.newInstance();
//		SingletonDemo6 s4 = c.newInstance();
		
		//���÷����л��ƽⵥ��
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
