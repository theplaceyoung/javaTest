package variables;

public class VariablesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 상수 (constant)
		// : 변할 수 없는 데이터를 저장하는 공간
		// : final로 정의
		// : 상수 이름은 모두 대문자로 작성
		
		final double PI = 3.2f; // 3.14 정의가 마지막 (final)이야!
		// 작은 게 큰 곳에 들어가도 내부적으로 형변환 (자동 형변환)
		
		final float PI2 = (float)3.2;
		// 큰 게 작은 곳에 들어갈 수 조차 없음!!
		// 명시적 형변환 해주고 들어감!
		
		System.out.println((int)PI); // 3
		
		// Q1. '7' -> 7로 변경할 수 없을까요?
		char num = '7';
		int numInt = (int)num - (int)'0'; //  55 - 48
		System.out.println(numInt); 
//		System.out.println((int)"7");
		
		
//		PI = 3.141592; // 상수는 수정 불가능
		
		
		int k = 10;
		k = 20;
		
		/* 변수 (variables)
		 * : 변할 수 있는 데이터를 저장하는 공간
		 * : 변수의 타입 (데이터 타입, 자료형)
		 * 1) 정수 (1, 2, 3, ...) (integer, int)
		 * 2) 실수 (1.23, 3.14, 5.12) (float, double)
		 * 	  : ex) 1.234567892123 -> double
		 * 	  : ex) 1.2345 -> float
		 * 3) 문자 ('a', 'b', 'c') (character, char)
		 *    : 작은 따옴표 (')로 정의
		 * 4) 문자열 ("abc", "hello") (string)
		 * 	  : 큰 따옴표 (")로 정의
		 * 5) 불린 (true, false) (boolean, bool)
		 * 	  : ex) 1이 1과 같니?
		 * 
		 * : 변수의 이름 (명명 규칙)
		 * 1) 영어로 작성 (a와 A는 다름, 대소문자 구분)
		 * 2) 의미있게 작성
		 * 	  : ex) name, height, age, count
		 * 3) 첫문자가 숫자이면 안됨
		 * 	  : ex) name1 (O), name2 (O)
		 * 	  : ex) 1name (X), 2name (X)
		 * 4) 특수기호: _ (****), $ (띄어쓰기도 안됨)
		 * 5) 변수의 이름은 소문자 시작 (countScore)
		 * 	  만약 복합어인 경우 복합어의 첫문자는 대문자
		 * 6) 키워드 (keyword)를 변수이름으로 사용할 수 없음
		 * 	  : ex) class, public, main, package
		 * */
		
		// 대입연산자 (=)를 통해 데이터를 대입!
		// 컴퓨터에서 같다는 어떻게 표현할까요? (==)
		// 변수 = 데이터 (리터럴, literal)
		// 3.14 (double)
		// 3 (int)
		int x = 3;
		float y = 3.14f;
		float yy = (float)3.14; // double -> float
		double z = 3.141235123;
		char ch = 'a';
		String s = "abcd";    
		// String은 키워드가 아님, 대문자로 시작 
		// 자바에서 정의한 기초 자료형이 아님 (클래스)
		boolean checker = true;
		System.out.println(checker);
		
		// Q1. 본인의 이름을 저장하는 변수를 만들고 이름을 저장해보자!
		String name = "최은빈";
		
		// Q2. 본인의 나이를 저장하는 변수를 만들고 나이를 저장해보자!
		int age = 20;
		
		// Q3. 내년 본인의 나이를 저장하는 변수를 만들고 
		// 내년 본인의 나이를 저장해보자!
		int nextAge = age + 1;
		
		// Q4. 현재 나이와 내년의 나이가 같은지를 확인

//		checker = (age == nextAge); // 기존에 checker가 업데이트
//		System.out.println(checker);
		
		
		boolean checker2 = (age == nextAge);
		// chekcer는 그대로 유지된 채로 checker2가 생성
		System.out.println(checker); // true
		System.out.println(checker2); // false
		
		// 동일한 변수 이름이 위에 선언이 되어있기 때문
		// 하나의 프로그램 안에서는 중복된 변수를 할당할 수 없음
		int a; 
		a = 3;
		System.out.println(a); // 3
		a = 5;
		System.out.println(a); // 5
		System.out.println("a"); // a
		// a vs "a" vs 'a'
		// a: 변수 -- 1)
		// "a": 문자열 데이터 -- 2)
		// 'a': 문자 데이터 -- 3)
		
		// 1 vs "1" vs '1'
		// 1: 정수 데이터 -- 4)
		// "1": 문자열 데이터 -- 5)
		// '1': 문자 데이터 -- 6)
		
		// 변수 = 데이터
		// Q1. 왼쪽 변수 자리에 올 수 있는 친구는 1 ~ 6 중 누구?
		// -- 1번 가능
		// Q2. 오른쪽 자리에 올 수 없는 친구는 1 ~ 6 중 누구?
		// -- 다 올 수 있음
		int c = 10;
		int d = c;
		// 변수가 오른쪽에 오는 경우에는 
		// 변수에 데이터가 사전에 정의되어 있어야 함
		
		
//		int a; // 불가능
		
		
	}

}
