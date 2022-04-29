package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) {

		Point p00 = new Point(3, 5);
		Point p01 = new Point(3, 5);
		Point p02 = new Point(13, 15);
		Point p03 = p02;

		System.out.println(p01.getX());
		
		//Point 클래의 부모로 Object클래스를 자동으로 상속한다.
		
		//클래스 정보 보기  --> 붕어빵 틀의 정보라 p01이나 p02나 정보가 같음
		System.out.println(p01.getClass());
		System.out.println(p02.getClass());
		
		System.out.println("==================");
		//public class Point 메소드 - 일반 : toString 있고 없고 차이 확인해보기 (toString 재정의 전후 비교)
		//인스턴스의 정보 보기 ---> 붕어빵의 정보기 떄문에 p01이랑 p02 정보가 다름 
		System.out.println(p01.toString());
		System.out.println(p02.toString());
		
		//메모리에 주소값에 대응되는 중복되지 않는 값
		System.out.println("==================");
		System.out.println(p01.hashCode());
		System.out.println(p02.hashCode());

		//
		System.out.println("==================");
		
		System.out.println(p01.equals(p02));
		System.out.println(p02.equals(p01));
		
		System.out.println(p01.equals(p01));
		System.out.println(p02.equals(p03));  //true
		
		System.out.println("==================");
		System.out.println(p00.equals(p01));   //false
		
		
		System.out.println("==================");
		System.out.println("== 와 equals() 차이점");
		// == --> 변수의 값이 같은지 비교
		// == 사용시 : 기본 자료형의 경우는 실제 값이 같은가?
		// == 사용시 : 기본 자료형 이외에 값은 (주소) 주소가 같은지 확인
		System.out.println(p00 ==  p01);   //false  --> 주소가 다르니까!
		//Point p00 = new Point(3, 5);
		// Point p01 = new Point(3, 5);  --> int x, int y의 값이 같아도 주소가 다르니까 false
		
		System.out.println(p00 ==  p01);   //false
		System.out.println(p00 ==  p02);   //false
		System.out.println(p00 ==  p03);   //false
		System.out.println(p02 == p03);    //true --> 주소가 같으니까 
		
		//
	}

}
