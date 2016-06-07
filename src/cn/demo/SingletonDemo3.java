package cn.demo;

/**
 * ��̬�ڲ���ʵ�ֵ���ģʽ
 * @author Miao
 *
 */
public class SingletonDemo3 {
	
	//��̬�ڲ���,�����ʱ��������������
	private static class SingletonInnerClass {
		private static final SingletonDemo3 INSTANCE = new SingletonDemo3();
	}
	
	//������˽�л�
	private SingletonDemo3(){
	}
	
	//������ͬ��,ִ��Ч�ʸ�,֧����ʱ����
	public static SingletonDemo3 getInstance(){
		return SingletonInnerClass.INSTANCE;
	}
}
