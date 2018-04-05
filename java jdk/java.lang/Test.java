package com.practice;

public class Test {

	public static void main(String[] args) {
		// Integer类的测试
		System.out.println("--------------------------");
		Integer a = new Integer("10");
		Integer b = new Integer(11);
		//判断两个数的大小
		System.out.println(a.compareTo(b));
		//判断两个实例是否相等
		System.out.println(a.equals(b));
		//将a转换成float型数
		float c = a.floatValue();
		System.out.println(c);
		
		//将字符串转换成数字
		String d = "10101110";
		int e = Integer.parseInt(d, 2);
		System.out.println(e);
		
		//Character类的测试
		System.out.println("--------------------------");
		int count;
		char[] values = {'*', '_', '%', '8', 'L', 'l'};
		for(count = 0; count < values.length; ++count) {
			if(Character.isDigit(values[count])) {
				System.out.println(values[count]+"是一个数字");
			}
			if(Character.isLetter(values[count])) {
				System.out.println(values[count]+"是一个字母");
			}
			if(Character.isUpperCase(values[count])) {
				System.out.println(values[count] +"是大写形式");
			}
			if(Character.isLowerCase(values[count])) {
				System.out.println(values[count]+"是小写形式");
			}
			if(Character.isUnicodeIdentifierStart(values[count])) {
				System.out.println(values[count]+"是Unicode标识符的第一个有效字符");
			}
		}
		char c1 = ' ';
		System.out.println("字符c是空白字符吗？"+Character.isWhitespace(c1));
		
		System.out.println("--------------------------");
		//Boolean类的测试
		Boolean a2 = new Boolean(true);
		System.out.println("a为"+a2);
		Boolean b2 = new Boolean("true");
		Boolean c2 = new Boolean("OK");
		System.out.println("b为"+b2);
		System.out.println("c为"+c2);
		System.out.println("a的booleanValue()为"+a2.booleanValue());
		System.out.println("a和b相等吗？"+a.equals(b));
		
		System.out.println("--------------------------");
		//String类的测试
		String s0 = "Abc";
		String s1 = new String("abc");
		System.out.println("用equals()比较,Abc和abc结果为"+s0.equals(s1));
		System.out.println("用equalsIgnoreCase()比较,Abc和abc结果为"+s0.equalsIgnoreCase(s1));
		
		String s2 = new String("Hello ");
		String s3 = "World" + "!";
		String s4 = s2.concat(s3);
		System.out.println(s4);
		System.out.println(s4.charAt(1));
		
		String s = "abcdefabc";
		System.out.println("字符a第一次出现的位置为"+s.indexOf('a'));
		System.out.println("字符串bc第一次出现的位置为"+s.indexOf("bc"));
		System.out.println("字符a最后一次出现的位置为"+s.lastIndexOf('a'));
		System.out.println("从位置3开始到结束的字符串"+s.substring(3));
		System.out.println("从位置3开始到位置6之间的字符串"+s.substring(3,6));
		
		System.out.println("--------------------------");
		//StringBuffer类的测试
		StringBuffer sb1 = new StringBuffer("I");
		sb1.append(" java");
		sb1.insert(1," love");
		String t = sb1.toString();
		System.out.println(t);
		
		System.out.println("--------------------------");
		//Math类的测试
		System.out.println(Math.abs(-12.7));
		System.out.println(Math.ceil(12.7));
		System.out.println(Math.rint(12.4));
		System.out.println(Math.random());

	}
	
	

}
