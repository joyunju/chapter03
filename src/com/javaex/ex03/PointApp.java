package com.javaex.ex03;

public class PointApp {

	public static void main(String[] args) {

		Point p01 = new Point(2, 3);
		Point p02 = new Point(2, 3);
		Point p03 = new Point(2, 2);
		Point p04 = p01;

		System.out.println("========");
		System.out.println(p01 == p02); // 주소값이 같은지 물어봤고 결과값 : false

		// equals() 정의한 값 비교
		// --> class Point : 메소드 일반에서 public boolean equals(){ } -> 재정의 해서 사용
		System.out.println(p01.equals(p02)); // 논리비교 : true
		System.out.println(p02.equals(p01)); // 논리비교 : true

		System.out.println(p01.equals(p03)); // false
		System.out.println(p02.equals(p03));

		System.out.println(p01 == p04);         // true
		System.out.println(p01.equals(p04));    // true

	}

}
