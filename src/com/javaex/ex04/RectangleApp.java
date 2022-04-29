package com.javaex.ex04;

public class RectangleApp {

	public static void main(String[] args) {

		Rectangle a = new Rectangle(6, 4);
		Rectangle b = new Rectangle(6, 4);
		Rectangle c = new Rectangle(12, 2);

		System.out.println("==equals()값 비교");
		
		//재정의 전 값 : false
		System.out.println(a.equals(b));    //재정의 후 true
		
		System.out.println(a.equals(c));   //재정의 후 false

	}

}
