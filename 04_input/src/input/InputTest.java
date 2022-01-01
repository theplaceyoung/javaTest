package input;

// �ܼ� (����ȭ��)�� ���� ����ڿ��� �Է¹޴� ���
import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		// Scanner: Ŭ���� (�ر׸�, ���� == �ؾƲ)
		// sc: ��ü(Object, �繰, ��� ==  �ؾ) (���� ����ϴ�)
//	
//	System.out.println("년도를 입력하세요. : "); // ������Է������޽�(�Է¹ޱ����� ����Ѵ�.)
//	int year = sc.nextInt();
//	System.out.println(year);
	
	// Q1. 사용자에게 연도를 입력받아 해당 연도가 윤년 판단하는 프로그램
//  아래의 조건 중 하나만 만족하면 윤년
//  1) 4의 배수이어야하고 100의 배수가 아니어야 함
//  2) 400의 배수는 무조건 윤년이 됨
//		
//		System.out.println("태어난년도를 기입해주세요. : ");
//		Scanner sc1 = new Scanner(System.in);
//		int yr1 = sc1.nextInt();
//		System.out.println("당신은 올해" + (2021-yr1+1) + "세입니다!");
//		System.out.println("----문제----");	
//		System.out.println("윤년 여부를 확인하고 싶은 년도를 기입하세요 : ");
//		Scanner sc2 = new Scanner(System.in);
//		int yr2 = sc2.nextInt();
//		Boolean disc = ((yr2 % 4) == 0) && !((yr2 % 100) == 0) || ((yr2 % 400) == 0);
//		String strYr = disc ? ("윤년입니다.") : ("평년입니다.");
//		System.out.println(strYr);		
////		
//		boolean isLeapYear = ((yr2 % 4) == 0) && !((yr2 % 100) == 0) || ((yr2 % 400) == 0);
//		// true, false
//		System.out.println("즉, 윤년 여부: " + isLeapYear);
//		
		// Q2. 사용자에게 입력받은 두 개의 실수(double)을 
		// +, -, *, /(분모가 0인 경우 오류 출력) 프로그램
//		System.out.println("숫자 두개 입력해주세요.");	
//		Scanner sc3 = new Scanner(System.in);
//		Scanner sc4 = new Scanner(System.in);
//		double x = sc3.nextDouble();		
//		double y = sc4.nextDouble();
//		double add = x+y;
//		double sub = x-y;
//		double mul = x*y;
//		String div = ( y==0 ) ? "0으로 나눌 수 없습니다!" : x/y + "";
//		System.out.println(add);		
//		System.out.println(sub);		
//		System.out.println(mul);				
//		System.out.println(div);		
		
		/* Infinity, -Infinity: 무한대
		 * nan (not a number)
		 * 
		 */
//		
		// Q3. 사용자에게 "hello world" 문자열을 입력받아보자!
		
		// next() : 엔터/space 들어오기 전까지
		// nextLine(): 엔터 들어오기 전까지
		// "hello world"
		
		//** 코드 작성부분의 일부 메모리를 사용하고 있는거?!
//		System.out.println("hello world 입력해주세요!");			
//		Scanner sc5 = new Scanner(System.in);	
//		String p = sc5.next();
//		System.out.println(p);
//		String q = sc5.nextLine();
//		System.out.println(q);		
//		// 만약 버퍼에남겨있는내용물을 삭제하고 싶다면? 휘발되니까 복구는 불가함 
//		sc5.close(); // 내부적으로 flush()호출
		
		// Q1. char 하나만 저장하고 싶을때?		
//		char ch = sc5.next().charAt(0);
		//입력된 문자열 중 가장 첫번째를 가지고 옴
		// "abcd" -> 'a'
//		char ch2 = "hello".charAt(3);
//		System.out.print(ch2);
	
		/*
		 * "".split
		 * 
		 */
	
//		// Q. 도시 (시 -> 특별시) 조건 만족해야한다고 가정한다. 1) & 2)
//		// 1) 해당 도시가 중심지이고 인구가 100만 이상
//		// 2) 부자인 인구 50만 이상
//		System.out.println("당신의 도시가 중심지인가요? (예: 1 /아니오: 2)");
//		Scanner cen = new Scanner(System.in);
//		int city = cen.nextInt();
//		boolean ystr = (city == 1);
//		String ystr1 = (ystr == true) ? "인구수를 알려주세요." : "당신의 도시는 특별시가 될 수 없습니다!";
//		System.out.println(ystr1);		
//		Scanner pop = new Scanner(System.in);
//		int pop2 = pop.nextInt();
//		Boolean pop3 = (city == 1) && (pop2 >= 1000000);
//		String ystr2 = pop3 ? "부자인 인구 수를 알려주세요." : "당신의 도시는 특별시가 될 수 없습니다.";
//		System.out.println(ystr2);
//		Scanner rich = new Scanner(System.in);
//		int rich2 = rich.nextInt();
//		Boolean rich3 = rich2 >= 500000;
//		String strcity = rich3 == true ? "당신의 도시는 특별시입니다." : "당신의 도시는 특별시가 될 수 없습니다.";
//		System.out.println(strcity);
		
		// Q. 도시 (시 -> 특별시) 조건 만족해야한다고 가정한다. 1) 혹은 2)
		// 1) 해당 도시가 중심지이고 인구가 100만 이상
		// 2) 부자인 인구 50만 이상
//		System.out.println("당신의 도시가 중심지인가요? (예: 1 /아니오: 2)");
//		Scanner input = new Scanner(System.in);
//		int center2 = input.nextInt();
//		boolean center3 = (center2 == 1);
//		String city = (center3 == true) ? "인구수와 부자인 인구를 알려주세요." : "당신의 도시는 특별시가 될 수 없습니다!";
//		System.out.println(city);		
//		int pop2 = input.nextInt();
//		Scanner rich = new Scanner(System.in);
//		int rich2 = input.nextInt();		
//		boolean checker = (center3 == true) && (pop2 >= 1000000) || (rich2 >=500000);
//		String special = checker == true ? "당신의 도시는 특별시입니다." : "당신의 도시는 특별시가 될 수 없습니다.";
//		System.out.println(special);
//		
//		// Q. 도시 (시 -> 특별시) 조건 만족해야한다고 가정한다.
//		// 1) 해당 도시가 중심지이고 인구가 100만 이상
//		// 2) 부자인 인구 50만 이상
//		System.out.println("당신의 도시가 중심지인가요? (yes/no)");
//		char isCenter = sc.next().charAt(0); // true/false
//		char ch = "y".charAt(0);
//		System.out.println("인구수는?(만 단위로 입력)");
//		int citizen = sc.nextInt();
//		System.out.println("부자수는?(만 단위로 입력)");
//		int riches = sc.nextInt();
//		boolean isCity = (isCenter == 'y') && (citizen >= 100) || (riches >= 50);
//		System.out.println("특별시 여부: " + isCity);
		
		Scanner sc = new Scanner(System.in);
		
		// Q1. 도시 (시 -> 특별시) 조건 만족해야한다고 가정한다.
//		// 1) 해당 도시가 중심지이고 인구가 100만 이상
//		// 2) 부자인 인구 50만 이상
		System.out.println("당신의 도시가 중심지인가요? (yes(YES)/no(NO))");
//		String isCenter = sc.next(); // true/false
		String isCenter = sc.next().toUpperCase(); // vs. .toLowerCase();
		
		System.out.println("인구수는?(만 단위로 입력)");
		int citizen = sc.nextInt();
		
		System.out.println("부자수는?(만 단위로 입력)");
		int riches = sc.nextInt();
	
		// 문자열끼리 비교는 equals()를 사용한다! 
		boolean isCity = (isCenter.equals("YES")) 	//.startsWith("y")
						&& ((citizen >= 100) 
						|| (riches >= 50)); 	
		System.out.println("특별시 여부: " + isCity);
		
		// Q2. 사용자에게 세 변을 입력 받는다.
		System.out.println("숫자를 한개 입력하세요.");
		int s1 = sc.nextInt();
		System.out.println("두번째 숫자를 입력하세요.");
		int s2 = sc.nextInt();
		System.out.println("더 큰 숫자를 입력하세요.");
		int s3 = sc.nextInt();
		String tChecker = S1 + S2 > S3 ? "삼각형이 됩니다." : "삼각형 만들수 없음" ; 
		System.out.println(tChecker + "\n");
		
		// Q3. 사용자에게 국어, 수학, 영어 성적(정수)를 입력 받아 세 과목의 평균이 70점이 넘는지 확인해보자.
		System.out.println("국어성적은?");
		int kor = sc.nextInt();
		System.out.println("수학성적은?");
		int math = sc.nextInt();
		System.out.println("영어성적은?");
		int eng = sc.nextInt();
		double scoreChecker = (kor + math + eng) / 3; 
		System.out.println((int)scoreChecker+ "\n");		
//		
		// Q4. 사용자에게 수를 하나 입력받아, 해당 수 홀/짝 판단하는 프로그램
		System.out.println("홀/짝을 판단해보세요. 수를 입력하세요.");
		int number = sc.nextInt();
		String nChecker = ((number % 2) != 0) ? "홀수!" : "짝수!";
		System.out.println(nChecker);
		
		
	}

}
