package cn.demo;

/**
 * ����ʽ����ģʽ
 * @author Miao
 *
 */
public class SingletonDemo2 {
	
	//�����ʱ����������
	private static SingletonDemo2 instance;
	
	//������˽�л�
	private SingletonDemo2 (){
	}
	
	//����ͬ��,ִ��Ч�ʲ���,֧����ʱ����
	public static synchronized SingletonDemo2 getInstance(){
		if(instance == null) {
			instance = new SingletonDemo2();
		}
		return instance;
	}
}
