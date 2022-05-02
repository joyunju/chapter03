package com.javaex.ex06;

public class Ex03 {
	public static void main(String[] args) {
		
		Integer i01 = new Integer(10);
		Integer i02 = new Integer(20);
		
		//(short) 형변환해서 사용 
		Short s = new Short((short)3);
		Byte b = new Byte((byte)3);
		
		Integer iResult = new Integer(3) + new Integer(5);
		System.out.println(iResult);
		
		//Integer no = new Integer(3);  아래 약식 표현 
		Integer no = 3;   // 박싱 
		// 아래 표현이랑다름 
		//int no = 3;
		int r01 = no.parseInt("1234");   //문자열 --> 정수로 바꿔줌   --> 어색
		System.out.println(r01+1);      // 숫자로 바껴서 계산이 가능해짐 (1234+1 = 1235)
		
		int r02 = Integer.parseInt("12345");  // 문자열 --> 정수로 바꿔줌 이렇게 사용 
		
		Integer no2 = 100;
		int no3 = no2;  // 언박싱 
		
		//정수 --> 문자열로  : valueOf()
		// 555 --> "555"
		String str = "안녕하세요";
		String str01 = str.valueOf(555);
		System.out.println(str01 + 1);   // 출력값 : 5551
		
		String str02 = String.valueOf(5555);  // 정수 --> 문자열 
		System.out.println(str02);
		
		//정수 --> 문자열
		String str03 = ""+555; // 문자열 + 정수 --> 문자열
		System.out.println(str03);
		
	}
	
}
