package cn.demo;

import java.io.Serializable;

/**
 * ����ʽ����ģʽ
 * @author Miao
 *
 */
public class SingletonDemo6 implements Serializable{
	//�����ʱ�ʹ�������
	private static final SingletonDemo6 INSTANCE = new SingletonDemo6();
	
	//������˽�л�
	private SingletonDemo6(){
	}
	
	//������ͬ��,ִ��Ч�ʸ�,��֧����ʱ����
	public static SingletonDemo6 getInstance(){
		return INSTANCE;
	}
}
