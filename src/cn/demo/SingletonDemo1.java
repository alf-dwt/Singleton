package cn.demo;

/**
 * ����ʽ����ģʽ
 * @author Miao
 *
 */
public class SingletonDemo1 {
	//�����ʱ�ʹ�������
	private static final SingletonDemo1 INSTANCE = new SingletonDemo1();
	
	//������˽�л�
	private SingletonDemo1(){
	}
	
	//������ͬ��,ִ��Ч�ʸ�,��֧����ʱ����
	public static SingletonDemo1 getInstance(){
		return INSTANCE;
	}
}
