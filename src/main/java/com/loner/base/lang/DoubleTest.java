package com.loner.base.lang;

/**
 * Double
 * 
 * @author pengcheng.tian
 *
 */
public class DoubleTest {

	public static void main(String[] args) {
		System.out.println(Double.POSITIVE_INFINITY);// 无穷大
		System.out.println(Double.NEGATIVE_INFINITY);
		System.out.println(Double.NaN);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);

		Double d = 123.984;
		System.out.println(Double.toHexString(d));
		System.out.println(Double.doubleToLongBits(d));
		System.out.println(Double.doubleToRawLongBits(d));
		System.out.println(Double.longBitsToDouble(0));

		double dd = 123.983;
		float f = 175.495f;
		System.out.println(dd + " - " + f);
	}

}
