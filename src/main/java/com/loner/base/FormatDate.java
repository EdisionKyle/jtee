package com.loner.base;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FormatDate {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(df.format(new Date()));
		System.out.println("-----------");

//		SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(df1.format(new Date()));
		System.out.println("-----------");

		SimpleDateFormat df2 = new SimpleDateFormat("yyyyMMddHHmmss");
		String dateString = "20071128175545";
		try {
			Date date = df2.parse(dateString);
			System.out.println("LocaleString：" + date.toLocaleString());
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println("-----------");
		System.out.println(getDate());
		System.out.println("-----------");
		System.out.println((new Date()).getTime());
		System.out.println(System.currentTimeMillis());
		System.out.println("-----------");
		Date date = new Date();
		System.out.println(date); // Fri Mar 02 21:43:55 CST 2012
		String strDate = null;
		strDate = DateFormat.getDateInstance().format(date);
		System.out.println(strDate); // Mar 2, 2012

		// Date
		strDate = DateFormat.getDateInstance(DateFormat.DEFAULT).format(date);
		System.out.println(strDate); // Mar 2, 2012

		strDate = DateFormat.getDateInstance(DateFormat.SHORT).format(date);
		System.out.println(strDate); // 3/2/12

		strDate = DateFormat.getDateInstance(DateFormat.MEDIUM).format(date);
		System.out.println(strDate); // Mar 2, 2012

		strDate = DateFormat.getDateInstance(DateFormat.LONG).format(date);
		System.out.println(strDate); // March 2, 2012

		strDate = DateFormat.getDateInstance(DateFormat.FULL).format(date);
		System.out.println(strDate); // Friday, March 2, 2012

		// DateTime
		strDate = DateFormat.getDateTimeInstance(DateFormat.DEFAULT,
				DateFormat.DEFAULT).format(date);
		System.out.println(strDate); // Mar 2, 2012 11:06:36 PM

		strDate = DateFormat.getDateTimeInstance(DateFormat.SHORT,
				DateFormat.SHORT).format(date);
		System.out.println(strDate); // 3/2/12 11:06 PM

		strDate = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,
				DateFormat.MEDIUM).format(date);
		System.out.println(strDate); // Mar 2, 2012 11:06:36 PM

		strDate = DateFormat.getDateTimeInstance(DateFormat.LONG,
				DateFormat.LONG).format(date);
		System.out.println(strDate); // March 2, 2012 11:06:36 PM CST

		strDate = DateFormat.getDateTimeInstance(DateFormat.FULL,
				DateFormat.FULL).format(date);
		System.out.println(strDate); // Friday, March 2, 2012 11:06:36 PM CST
		
		System.out.println(Calendar.getInstance().getActualMaximum(Calendar.DAY_OF_MONTH));
	}

	public static String getDate() {
		int theyear = 0;
		int themonth = 0;
		int theday = 0;
		String thedate = "";
		Calendar calendar = Calendar.getInstance();
		theyear = calendar.get(Calendar.YEAR);
		themonth = calendar.get(Calendar.MONTH) + 1;
		theday = calendar.get(Calendar.DAY_OF_MONTH);
		thedate = "" + theyear + "年" + themonth + "月" + theday + "日";
		return thedate;
	}
}
