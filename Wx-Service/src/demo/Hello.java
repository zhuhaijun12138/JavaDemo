package demo;

public class Hello {
	public static void main(String args[]) {
		System.out.println("Hello world!!");
		int num=10;//定义整型变量
		/*
		 * 进行变量重新赋值
		 */
		num=30;
		System.out.println("num是"+num);
		System.out.println("num*num="+chengfa(num));
		
	}
	/**
	 * 进行乘法运算
	 * @param num
	 * @return
	 */
	static int chengfa(int num) {
		System.out.println("传值进来了="+num);
		return num*num;
		
	}
}
