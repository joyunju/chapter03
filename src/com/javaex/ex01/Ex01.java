// Object Class : 모든 클래스의 최상위 클래스
// extends java.lang.Object 없이도 자동으로 상속 받게 된다

package com.javaex.ex01;

public class Ex01 {

	public static void main(String[] args) {

		Object obj = new Object();
		//Object obj2 = new Object();
		
		System.out.println(obj.getClass()); // 클래스 정보 --> class java.lang.Object
		System.out.println(obj.hashCode()); // 일단 주소라고 알고 있자. --> 640363654
		System.out.println(obj.toString()); // java.lang.Object@262b2c86
		System.out.println(obj.equals(obj)); // 같은가? --> true
		System.out.println("=======================");

		System.out.println("Obj.getClass()===============");
		System.out.println(obj.getClass());
		
		System.out.println("Obj.hashCode()===============");
		//메모리의 주소값에 대응되는 중복되지 않는 값
		
		Object obj01 = new Object();
		Object obj02 = new Object();
		Object obj03 = new Object();
		
		System.out.println(obj01.hashCode());
		System.out.println(obj02.hashCode());
		System.out.println(obj03.hashCode());
		
		System.out.println("Obj.toString()===============");
		//객체의 값 정보를 문자열로 리턴
		System.out.println(obj.toString());

		System.out.println("Obj.equals()===============");
		//
		System.out.println(obj.equals(obj));
		System.out.println(obj.equals(obj02));
	}
}
