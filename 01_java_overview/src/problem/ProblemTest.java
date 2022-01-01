package problem;

public class ProblemTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 占쏙옙占� 占쏙옙占쏙옙占쏙옙 (+, -, *, /)
		// Q1. 占쏙옙占쏙옙 占싼뤄옙, 占쏙옙占쏙옙 占쏙옙占쏙옙求占� 占쏙옙占싸그뤄옙
		// 占쏙옙占쏙옙 占싼뤄옙: 2 * PI * 占쏙옙占쏙옙占쏙옙
		// 占쏙옙占쏙옙 占쏙옙占쏙옙: PI * 占쏙옙占쏙옙占쏙옙 * 占쏙옙占쏙옙占쏙옙
		int r = 3;
		final double PI = 3.14;
		// 占쏙옙占쏙옙 占싼뤄옙: peri (double)
		// 占쏙옙占쏙옙 占쏙옙占쏙옙: area (double)
		double peri = 2 * PI * r;
		double area = PI * r * r;
		System.out.println("占쏙옙占쏙옙 占싼뤄옙: " + peri);
		System.out.println("占쏙옙占쏙옙 占쏙옙占쏙옙: " + area);
		// 1) 18.84 -> "18.84" (占쌘듸옙 占쏙옙占쏙옙환)
		// 2) "占쏙옙占쏙옙 占싼뤄옙: " + "18.84"
		// ---------------------------------------
		// print(), println(), printf() (print format)
		// printf() (enter占쏙옙 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙)
		// 占쏙옙占쏙옙 (10占쏙옙占쏙옙): %d (decimal)
		// 占쏙옙占쏙옙 (8占쏙옙占쏙옙): %o (octal)
		// 占쏙옙占쏙옙 (16占쏙옙占쏙옙): %x (hexa..)
		// 占실쇽옙 (float, double): %f
		// 占쏙옙占쏙옙 (char): %c
		// 占쏙옙占쌘울옙 (String): %s
		
		System.out.printf("占쏙옙占쏙옙 占싼뤄옙: %10.3f\n", peri);
		System.out.printf("占쏙옙占쏙옙 占쏙옙占쏙옙: %10.2f\n", area);
		// 占쏙옙占쏙옙 占쏙옙占쏙옙求占쏙옙占�?
		int month = 1; // 1 ~ 12
		int day = 1; // 1 ~ 31
		System.out.printf("month = %-2d, day = %2d\n", month, day);
		month = 12;
		day = 31;
		System.out.printf("month = %2d, day = %2d\n", month, day);
		
		// + 占쏙옙占쏙옙
		// 占쏙옙占쌘울옙 + 占쏙옙占쌘울옙: 占쏙옙占쌘울옙 占쏙옙占쏙옙
		System.out.println("占쏙옙占쏙옙 占싼뤄옙: " + "123"); 
		// 占쏙옙占쏙옙 + 占쏙옙占쏙옙: 占쏙옙占쏙옙 占쏙옙占쏙옙
		System.out.println(234 + 123);
		
		
		// Q2. boolean b = true占쏙옙 int占쏙옙 占쏙옙占쏙옙환占싹댐옙 占쌘듸옙 占쌜쇽옙
//		boolean b = true;
//		System.out.println((int)b); // 占쏙옙 占싫되댐옙占쏙옙 占쏙옙占쏙옙
//		// boolean -> int 占쏙옙 占쏙옙환占쏙옙 占싫듸옙 (java占쏙옙 특징)
		// false: 0
		// true: 1
		
//		
//		// Q3. 占싣뤄옙占쏙옙 占쌘드가 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占싹시울옙.
//		// 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙 占쏙옙荑∽옙占� 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占쌔븝옙占쏙옙占쏙옙!
		float f = 0.12F; 
		int i = (int)2.1; // 2.1 -> 2 (占쏙옙占쏙옙占� 占쏙옙占쏙옙환)
		char c = 'a';
//		boolean bl = (boolean)1; // 1 -> true占쏙옙 占쏙옙占쏙옙 占쌀곤옙!
		double d = 1; // 1 -> 1.0 (占쌘듸옙 占쏙옙占쏙옙환)
		double dd = 1.2f; // 1.2f -> 1.2 (占쌘듸옙 占쏙옙占쏙옙환)
		
		// Q4. x, y 占쏙옙占쏙옙占쏙옙 占싱울옙占싹울옙 x, y占쏙옙 占쏙옙占� 占쏙옙占쏙옙 占쏙옙치占쏙옙 占쌕꾸댐옙 占쌘듸옙 占쌜쇽옙 
		int x = 10;
		int y = 20;
		System.out.println(x); // 10
		System.out.println(y); // 20
		// 占쏙옙占썩에 占쌘듸옙 占쌜쇽옙
		System.out.println(x); // 占쏙옙占쏙옙 占쏙옙占쏙옙占�: 20
		System.out.println(y); // 占쏙옙占쏙옙 占쏙옙占쏙옙占�: 10
		
//		// Q5. 다음 문장의 실행 결과를 확인하고 이유를 생각해보세요!
	      int xx = 65;
	      System.out.printf("%.2f\n", (float)xx); //OK
		  System.out.printf("%c\n", xx); //65에 대한 ASCII 코드 출력
	      
	      char chh = 'a';
		  System.out.printf("%d\n", (int)chh); //문자 a에 대한 ASCII 코드 출
	      
	      char chch = 97;
		  System.out.printf("%d\n", (int)chch); //형변환 해주면 ERROR x
	      System.out.printf("%c", chch); //OK
	}


}

