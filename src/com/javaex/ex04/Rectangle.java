//문제 : Rectangle 클래스를 만들고 equals() 사용해 봅시다.
// int 타입의 width, height의 필드를 가지는
// Rectangle 클래스를 작성하고 인스턴스를 생성합니다.
// ★★★각각의 width, height 값이 같으면 같은것으로 정의합니다.

package com.javaex.ex04;

public class Rectangle {

	// 필드
	int width;
	int height;

	// 생성자
	public Rectangle() {

	}

	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	// 메소드 - gs
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	

	// 메소드 - 일반
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
	//public boolean equals(Object obj) : Object obj 이렇게 써야함
	public boolean equals(Object obj) {
		Rectangle r = (Rectangle) obj;

		if ((this.width == r.width) && (this.height == r.height)) {
			return true;
		} else {
			return false;
		}
	}
}
