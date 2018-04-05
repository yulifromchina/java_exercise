package com.test;
import java.util.*;
import java.text.*;

public class Test {

	public static void main(String[] args) {
		System.out.println("----------------Date 类的测试:----------------");
		String strDate, strTime = "";
		Date objDate = new Date();
		System.out.println("今天的日期是:"+objDate);
		long time = objDate.getTime();
		System.out.println("自1970年1月1日起以毫秒为单位的时间:"+time);
		strDate = objDate.toString();
		strTime = strDate.substring(11, (strDate.length() - 4));
		strTime = "时间:"+strTime.substring(0,8);
		System.out.println(strTime);
		
		System.out.println("----------------Calender 类的测试:----------------");
		System.out.println("显示完整日期：");
		DateFormat fdate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str = fdate.format(new Date());
		System.out.println(str);
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());//calendar获取当前时间
		
		System.out.println("年:"+calendar.get(Calendar.YEAR));
		System.out.println("月:"+calendar.get(Calendar.MONTH));
		System.out.println("分钟:"+calendar.get(Calendar.MINUTE));
		System.out.println("今年的第 "+calendar.get(Calendar.DAY_OF_YEAR)+" 天");
		System.out.println("本月的第 "+calendar.get(Calendar.DAY_OF_MONTH) + "天");
		calendar.add(Calendar.HOUR_OF_DAY,3);
		System.out.println("三小时以后的时间: "+calendar.getTime());
		str = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(calendar.getTime());
		System.out.println(str);
		
		calendar.setTime(new Date());//重置当前时间
		Calendar calendarNew = Calendar.getInstance();
		//时间设置在5小时前
		calendarNew.add(Calendar.HOUR, -5);
		System.out.println("时间比较:"+calendarNew.compareTo(calendar));//expect -1
		//时间设置在7小时后
		calendarNew.add(Calendar.HOUR, +7);
		System.out.println("时间比较:"+calendarNew.compareTo(calendar));//expect 1
		//返回2小时前
		calendarNew.add(Calendar.HOUR, -2);
		System.out.println("时间比较:"+calendarNew.compareTo(calendar));//expect 0
	}

}
