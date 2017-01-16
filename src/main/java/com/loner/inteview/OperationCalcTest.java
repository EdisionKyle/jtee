package com.loner.inteview;

/**
 * Java操作符
 * 
 * @author Administrator
 *
 */
public class OperationCalcTest {

	public static void main(String[] args) {

		System.out.println("----算数运算符----");
		int a = 5;
		int b = 1, c, d, f, g, h;
		b = +a; // 正值
		System.out.println("b=" + b + ",a=" + a);
		c = -a; // 负值
		System.out.println("c=" + c + ",a=" + a);
		int l = 2;
		d = ++l; // 先l=l+1;再d=l
		System.out.println("d=" + d + ",l=" + l);
		int m = 3;
		f = m++;// 先f=m;再m=m+1
		System.out.println("f=" + f + ",m=" + m);
		int n = 4;
		g = --n;// 先n=n-1;再g=n
		System.out.println("g=" + g + ",n=" + n);
		int o = 6;
		h = o--;// 先h=o;再o=o-1
		System.out.println("h=" + h + ",o=" + o);
		System.out.println("----特殊问题处理1----");
		int aa = 3, bb = 10;
		bb = +aa;
		aa += 8;
		System.out.println("相加赋值：aa +=\t" + aa);
		System.out.println("单纯赋值：bb =+\t" + bb);
		System.out.println("----特殊问题处理2----");

		short s1 = 1;
		// s1 = s1 + 1;//错误
		s1 = (short) (s1 + 1); // 正确
		System.out.println("强制类型转换错误==" + s1);

		short s2 = 1;
		s2 += 1;
		// += 除了实现 + 功能外，还会根据接收变量的类型自动进行类型的强制转换
		System.out.println("自动进行类型强制转换==" + s2);
		// 相同类型转换没有问题
		int s3 = 1;
		s3 = s3 + 2;
		System.out.println("相同类型转换==" + s3);

		new OperationCalcTest();
//		OperationCalcTest oct = new OperationCalcTest(); //不执行
//		oct.syso("万里独行");
		System.gc();
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.err.println("我是finalize()；我执行我骄傲");
	}

	public void syso(String name) {
		System.out.println(name);
	}

}
