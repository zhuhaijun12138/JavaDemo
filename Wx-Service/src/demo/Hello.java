package demo;

public class Hello {
	public static void main(String args[]) {
		System.out.println("Hello world!!");
		int num=10;//�������ͱ���
		/*
		 * ���б������¸�ֵ
		 */
		num=30;
		System.out.println("num��"+num);
		System.out.println("num*num="+chengfa(num));
		
	}
	/**
	 * ���г˷�����
	 * @param num
	 * @return
	 */
	static int chengfa(int num) {
		System.out.println("��ֵ������="+num);
		return num*num;
		
	}
}
