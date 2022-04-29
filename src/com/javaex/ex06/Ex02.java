//메소드 
// concat()
// trim()
// replace()
// split()
// substring(int a)
// substring(int a, int b)
// charAt()

package com.javaex.ex06;

public class Ex02 {

	public static void main(String[] args) {

		String a = new String(" abc");
		String b = new String(",efg ");

		// concat() : 더하기 기능
		// System.out.println(a.concat(b));
		// System.out.println(a+b);

		// 의도적으로 a에 a+b의 값을 넣었음
		a = a.concat(b);
		System.out.println(a);

		// a.trim();
		a = a.trim();
		System.out.println(a.trim()); // 출력 값 : abc,efg (앞 뒤 공백 없어짐 )
		System.out.println("__" + a + "__");

		a = a.replace("ab", "12");
		System.out.println(a);

		System.out.println("===============");

		// a.split(""); --> 자르기 기능
		// String[] sArray = a.split("");
		// System.out.println(sArray[0]);
		// System.out.println(sArray[4]);

		String[] sArray = a.split(",");

		for (int i = 0; i < sArray.length; i++) {
			System.out.println(sArray[i]);
		}
		System.out.println(a);

		System.out.println("===============");

		// substring(인덱스번호) --> 입력된 인덱스 번호 부터 담아줘
		String str = "Hello java!";
		String result01 = str.substring(3); // 인덱스 번호 3번인 l부터 출력해서 출력값이 lo java!
		System.out.println(result01);

		String result02 = str.substring(1, 3);  // 인덱스 번호 1번부터 3번 전까지 --> 즉, 인덱스 번호 [1],[2] 출력해줘 
		//String result02 = str.substring(1, 7);    // 출력값 : ello j
		System.out.println(result02);      // 출력값 : el
		
		System.out.println("===============");
		char result03 = str.charAt(8);  //charAt(8) --> 해당 인덱스 번호만 출력 
		System.out.println(result03);
		
	}

}
