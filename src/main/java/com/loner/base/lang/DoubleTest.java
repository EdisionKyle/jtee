package com.loner.base.lang;

import java.math.BigDecimal;

/**
 * Double
 * 
 * @author pengcheng.tian
 *
 */
public class DoubleTest {

	public static void main(String[] args) {
		System.out.println(Double.POSITIVE_INFINITY);// 无穷大 [ɪnˈfɪnəti]
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
		System.out.println("Double.toHexString==" + Double.toHexString(dd));
		System.out.println(dd + " - " + f);

		double aa = 123.0000000000001999999;
		double bb = 1.0000000000009999999;
		System.out.println(aa + bb);

		BigDecimal ca = new BigDecimal("123.0000000000001999999");
		BigDecimal cb = new BigDecimal("1.0000000000009999999");
		System.out.println(ca.add(cb).toString());
		System.out.println(-1.0 / 0.0);
		System.out.println(0.0 / 0.0);
		System.out.println(Double.isInfinite(1.0 / 0.0));
		System.out.println(Double.isNaN(0.0 / 0.0));
		System.out.println(1 / 0);// 报错java.lang.ArithmeticException: / by zero
	}

}
