//
package com.javaex.ex03;

public class Point {

	// 필드
	private int x;
	private int y;

	// 생성자
	public Point() {

	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	// 메소드 - gs
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	// 메소드 - 일반
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	// 부모인 odject의 equals()가 맘에 안들어서 재정의
	public boolean equals(Object obj) {
		Point p = (Point) obj;

		if (this.x == p.x && this.y == p.y) {
			return true;
		} else {
			return false;
		}
	}

}
