/* [구트아카데미] 자바과제_번_장소영 (010 4579 8635) */
/* NestedLoop.java */




package nested_loop;
import java.util.Scanner;
public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		/*
		 * while(){
		 * }
		 * 
		 * for() {
		 * 	for() {
		 *  }
		 * }
		 * 
		 * ***
		 * ***
		 * ***
		 * 
		 */
//		for(int i = 0; i < 3; i++) {
//			System.out.println("***");
//		}
//		
//		for(int i = 0; i < 10; i++) {
//			for(int j=0; j <= i ; j++) {
//				System.out.printf("*"); // ***
//			}
//			System.out.printf("\n"); // 엔터
//		}
//		
//		for(int i = 0; i < 9; i++) {
//			System.out.print("*");	
//			if (i % 3 ==2) System.out.println("");	
			// ***
			// ***
			// ***
			
//		for(int k = 1; k < 11; k++) {
//			System.out.printf("k = %2d  ", k);
//			for (int n = 0; n < k; n++) { 
//				System.out.printf("*");
//			}
//			System.out.println("");
	

//		for(int k = 1; k < 11; k++) {
//			System.out.printf("k = %2d  ", k);
//			for (int n = 0; n < k; n++) { 
//				System.out.printf("");
//			}
//			System.out.printf("*");
//			}
//		System.out.println("");
//		
//		for(int k = -10; k < 11; k++) {
//			System.out.printf("k = %3d  ", k);
//			int n = 0;
//			for (n = 0; n < Math.abs(k)/2; n++) { 
//				System.out.printf("-");
//			}
//			for (int m = Math.abs(k) - n; m < Math.abs(k); m++) {
//				System.out.printf("*");
//			}
//			System.out.println("");
		
		/* Q2. 총 5명의 5개의 과목 성적(국, 수, 사, 과, 영)
		 * 출력)
		 * 1번째 학생의 성적 입력: 
		 * 1번째 학생의 평균은 00점 입니다.
		 * 2번째 학생의 성적 입력: 
		 * 2번째 학생의 평균은 00점 입니다.
		 * 3번째 학생의 성적 입력: 
		 * 3번째 학생의 평균은 00점 입니다.
		 * 4번째 학생의 성적 입력: 
		 * 4번째 학생의 평균은 00점 입니다.
		 * 5번째 학생의 성적 입력: 
		 * 5번째 학생의 평균은 00점 입니다.
		 *  - DONE
		 */
//		
//		for (int a = 0; a < 5; a++) {
//			int sum = 0;
//			int scr = 0;
//			String scrList = ""; // string으로 입력값 저장
//			System.out.printf("%d번째 학생 점수 입력하세요.(국/수/사/과/영) \n", a + 1);
//			for (int s = 0; s < 5; s++) {
//				scr = scan.nextInt();
//				scrList += scr + " ";
//				sum += scr;
//			}
//		System.out.printf("%d번째 학생 성적 입력(국/수/사/과/영): %s\n", a + 1, scrList);
//		System.out.printf("%d번째 학생의 성적 합계: %d, 평균: %d\n", a+1, sum, sum/5);
//		
//		}
		
		/* Q3. 문자열의 팰린드롬(Palindrome, 회문)
		 * 어떤 문자열을 순차적으로 읽어도 역순으로 읽어도 동일한 문자열을 회문이라고 합니다.
		 * 예) mom (O) / ab a (X) / aba (O)
		 * (문자열의 길이는 s.length(), s.charAt(2))
		 */
//		while (true) {
//			System.out.println("팰린드롬 O/X? 문자열을 입력해보세요.");
//			String palin = scan.nextLine();
//			for (int i = 0; i < (palin.length() / 2); i++) {
//				boolean chk = palin.charAt(i) == palin.charAt(palin.length() - 1 - i);
//				if(chk) {
//				System.out.println("팰린드롬");
//				continue;
//				}
//				else {
//				System.out.println("팰린드롬아님" );
//				return;
//				}
////			System.out.println(i);
//			}
//		}
	
//		 Q3 -2. 사용자에게 문자열 두 개를 입력받아 두 문자열이 같은지 확인하자. equals()
//		 "abc" vs. "abcd"
//		 "abc" vs. "acc"
//		 == (int, boolean, char)
//		 equals() (String, 대소문자 구분 O)
//		 equalsIgnoreCase() (대소문자 구분 X)
		
		//  
		System.out.println("첫번째 문자열 입력해주세요.");
		String s1 = scan.next();
		System.out.println("번째 문자열 입력해주세요.");
		String s2 = scan.next();
		if (s1.length() != s2.length()) {
			System.out.println("문자열 길이가 다름");
			return;
		}
		boolean isEquals = true;
		// s1.length() == s2.length()
		for(int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				isEquals = false;
				break;
			}
		}
		System.out.println(isEquals? "두 문자열이 같습니다.": "두 문자열이 다릅니다.");
		
//		boolean checkPal = reverse.equals(forward);
//		// equals() ( String, 대소문자구분 O) - DONE
//		// equalsIgnoreCase() 대소문자 구분 X 
//		
//		if (checkPal) System.out.println("팰린드롬 O");
//		else System.out.println("팰린드롬 X");
//		break;
//	}
		
//		
//		
//		while (true) {
//			System.out.println("팰린드롬 O/X? 문자열을 입력해보세요.");
//			String pal = scan.nextLine();
//			String forward = "";
//			String reverse = "";
//			int k = pal.length();
//			for (int i = 0; i < k; i++) {
//				forward += pal.charAt(i);
//				reverse += pal.charAt(k - 1 - i); 
//			}
//			System.out.println(k);
//			System.out.println(pal);
//			System.out.println(forward);
//			System.out.println(reverse);
//			
//			boolean checkPal = reverse.equals(forward);
//			// equals() ( String, 대소문자구분 O) - DONE
//			// equalsIgnoreCase() 대소문자 구분 X 
//			
//			if (checkPal) System.out.println("팰린드롬 O");
//			else System.out.println("팰린드롬 X");
//			break;
//		}
//		// equalsIgnoreCase() 짜보기!
//		
//		System.out.println("\n문자열 입력해봅시다.: ");
//		String strIgnoreCase = scan.nextLine().toLowerCase();
//		int q1 = 0;
//		int q2 = strIgnoreCase.length() - 1;
//		boolean isPalin2 = true;
//		for (int i = 0; i < strIgnoreCase.length(); i++) {
//			if(strIgnoreCase.charAt(q1) != strIgnoreCase.charAt(q2)) {
//				isPalin2 = false;
//				break;
//			}
//		System.out.println(strIgnoreCase.charAt(i));
//		
//		q1++;
//		q2--;
//		}
//		System.out.println((isPalin2)? "팰린드롬단어(대소문자구분X) O":"팰린드롬단어(대소문자구분X) X");
//		
//		// 3. + Case 1.
//		String strInitial = ""; // 문자열 초기화
//		System.out.println("\n문자열 입력해봅시다.: ");
//		strInitial = scan.nextLine();
//		int p1 = 0;
//		int p2 = strInitial.length() -1;
//		boolean isPalin = true;  // 해당문자열이 팰린드롬인지 아닌지 저장
//		
//		for (int i = 0; i < strInitial.length(); i++) {
//			// pointer1: s.charA(i)
//			// pointer2: s.charAt(s.length()-1-i)
//			// p1, p2 위치에 있는 모든 문자가 같아야 함
//			// 팰린드롬이라고 가정한 후에 
//			// p1, p2 위치에 있는 문자 중에 하나라도 다른 넘이 나오면?,,
//			if(strInitial.charAt(p1) != strInitial.charAt(p2)) {
//				isPalin = false;
//				break;
//
//			}
//			
//			System.out.println(strInitial.charAt(i));
//			
//			p1++;
//			p2--;
//		}
//		System.out.println((isPalin)? "팰린드롬 O":"x");
//		
//		// 3. + Case 2.
//		String strInitial = ""; // 문자열 초기화
//		System.out.println("\n문자열 입력해봅시다.: ");
//		strInitial = scan.nextLine();
//		int p1 = 0;
//		int p2 = strInitial.length() -1;
//		boolean isPalin = true;  // 해당문자열이 팰린드롬인지 아닌지 저장
//		
//		for (int i = 0; i < strInitial.length(); i++) {
//			// pointer1: s.charA(i)
//			// pointer2: s.charAt(s.length()-1-i)
//			// p1, p2 위치에 있는 모든 문자가 같아야 함
//			// 팰린드롬이라고 가정한 후에 
//			// p1, p2 위치에 있는 문자 중에 하나라도 다른 넘이 나오면?,,
//			if(strInitial.charAt(p1) != strInitial.charAt(p2)) {
//				isPalin = false;
//				break;
//
//			}
//			
//			System.out.println(strInitial.charAt(i));
//			
//			p1++;
//			p2--;
//		}
//		System.out.println((isPalin)? "팰린드롬 O":"x");
		
		// 
	
		/* Q4. 피타고라스 만족하는 삼각형 구하기
		 * 
		 * */
		
		// Q4. 피타고라스 만족하는 삼각형 구하기
	      // 1 <= a, b, c <= 100 (a, b, c는 변의 길이 (c가 가장 크다고 가정))
	      // 피타고라스 공식: a * a + b * b == c * c을 
	      // 만족하는 삼각형 변의 길이 쌍을 출력하시오.
	      // 총 몇 개의 삼각형이 피타고라스에 만족하는지도 확인해보세요!
	      
	      // 추가 1) 변의 길이 중복 허용 -> 3! * ?개
	      //     2)        중복 제거 -> ?개
	      // a, b, c
	      // 3, 4, 5
	      // 4, 3, 5
		
		int sa = 0;
		int sb = 0;
		int sc = 0;
		int count = 0;
		for (int p = 1; p <= 100; p++) {
			sa = p;
			for (int q = 1; q <= 100; q++) {
				sb = q;
				for (int r = 1; r <= 100; r++) {
					sc = r;
					boolean checkPy = ((sa * sa) + (sb * sb)) == (sc * sc);
					if (sa < sb) {
						if (checkPy) {
							count++;
							System.out.printf("(%3d, %3d, %3d)\n", sa, sb, sc);
						}	
					}
				}
			}
		}	
		System.out.println("** 피타고라스를 만족하는 삼각형 갯수 : " + count);	
		System.out.println("** 피타고라스를 만족하는 삼각형 순서쌍 갯수 : " + (count * 6));	

	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
