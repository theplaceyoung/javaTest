package condition;

import java.util.Scanner; // Scanner 불러오기

public class ConditionTest {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      
      Scanner sc = new Scanner(System.in);
//      String str = "abcd";
//      		 str = null;
//      System.out.println(str);
//
//      System.out.println("두 정수를 입력바랍니다.");
//      int a = sc.nextInt();
//      int b = sc.nextInt();
//      
//      // a / b (b != 0)
//
//      if(b == 0) System.out.println("계산 불가!!"); // 조건식 (true/false로 판단 가능한 식)
//      if(b == 0) {
//         System.out.println("계산 불가!!");
//         System.out.println("언제 실행될까요?"); 
//      }
//      else { // b != 0
//         double div = (double)a / b;
//         System.out.println(div);
//      }
//       
//      //   1101 조건문 연습 퀴즈   
//      // Q1. 사용자한테 국어, 수학, 영어 성적 받아서 70점 넘으면? "합격"
//      // 70점 넘지 않으면? "불합격"
//      System.out.println("국어, 수학, 영어 성적 차례대로 입력해주세요."); // 입력받은 데이터의 유효성은 바로바로 검사하는게 좋다!
//      System.out.println("당신의 국어성적은? ");
//      int kor = sc.nextInt();
//      if (kor < 0 || kor > 100) {
//         System.out.println("[경고] 성적이 유효하지 않습니다. 0 이상 100 이하 국어점수를 입력해주세요.");
//         kor = sc.nextInt();
//         }
//      System.out.println("당신의 수학성적은? ");
//      int math = sc.nextInt();
//      if (math < 0 || math > 100) {
//         System.out.println("[경고] 성적이 유효하지 않습니다. 0 이상 100 이하 수학점수를 입력해주세요.");
//         math = sc.nextInt();
//         }
//      System.out.println("당신의 영어성적은? ");
//      int eng = sc.nextInt();
//      if (eng < 0 || eng > 100) {
//         System.out.println("[경고] 성적이 유효하지 않습니다. 0 이상 100 이하 영어점수를 입력해주세요.");
//         eng = sc.nextInt();
//         }
//      // 평균 계산
//      double avg = (kor + math + eng) / 3.0;
//      if (avg >= 70) {
//         System.out.println("합격입니다.");
//         System.out.printf("당신의 평균점수는 %f점입니다.\n", avg);      
//         }
//      else {
//         System.out.println("불합격입니다.");
//      }
//         
//      // Q2. 사용자에게 세 변 입력받아서
//      // 세변으로 삼각형 만들 수 있는지 확인하는 프로그램
//      
//      // 입력받기
//      System.out.println("삼각형이 만들어 질까요? 세가지 자연수를 입력해주세요!"); // 유효성검사 먼저
//      int s1 = sc.nextInt();
//      if (s1 < 0) {
//         System.out.println("[error]변의 길이는 음수가 될 수 없음");
//         return;
//      }
//      int s2 = sc.nextInt();
//      if (s2 < 0) {
//         System.out.println("[error]변의 길이는 음수가 될 수 없음");
//         return;
//      }
//      int s3 = sc.nextInt();
//      if (s3 < 0) {
//         System.out.println("[error]변의 길이는 음수가 될 수 없음");
//         return;
//      }
//      
//      // 긴변 찾아서 삼각형 성립조건 확인
//      int maxS = s1;
//      if (maxS < s2) maxS = s2;
//      if (maxS < s3) maxS = s3;      
//      boolean triTest = (s1 + s2 + s3 - maxS > maxS) ;
//      String strTriTest = (triTest == true) ? "삼각형이 만들어 집니다." : "삼각형을 만들 수 없습니다."; 
//      System.out.println(strTriTest);   
//      System.out.printf("입력한 세 변 중 가장 긴 변은 %f입니다.\n", maxS);
//      // 직각삼각형 여부?
//      boolean pytha = (2 * (maxS^2)) == (s1^2 + s2^2 + s3^2); 
//      String pythaChecker = pytha ? "빗변이" + maxS + "인 직각삼각형입니다." : "";
//      System.out.printf(pythaChecker);
//         
//      
//      
//      // ' ' 
//      // " 1234" : 첫번째는 0이에요 -> 배열 
//      
//      if ((s1 < 0) || (s2 < 0) || (s3 < 0)) {
//         System.out.println("자연수를 다시 입력해주세요.");
//         s1 = sc.nextInt();
//         s2 = sc.nextInt();
//         s3 = sc.nextInt();
//      }
//      else {
//         if ((s1 >= s2) && (s1 > s3)) { 
//            boolean triangleChecker = s1 < (s2 + s3) ;
//            String triangle = triangleChecker ? "" : "삼각형을 만들 수 없습니다.";
//               if (s2 == s3) {
//                  if ((s2^2 + s3^2) == (s1^2)) System.out.println("특별히 직각이등변삼각형 입니다.");
//                  else System.out.println("특별히 이등변 삼각형입니다.");
//               }
//               else {
//                  if ((s2^2 + s3^2) == (s1^2)) System.out.println("특별히 직각삼각형 입니다.");
//               }
//            System.out.println(triangle);
//         }
//         if ((s2 > s1) && (s2 > s3)) { // (s1 <= s2 || s1 <= s3)
//            boolean triangleChecker = s2 < (s1 + s3) ;
//            String triangle = triangleChecker ? "삼각형이 됩니다." : "삼각형을 만들 수 없습니다.";
//            System.out.println(triangle);
//         }
//         if ((s3 > s1) && (s3 > s2)) {
//            boolean triangleChecker = s3 < (s1 + s2) ;
//            String triangle = triangleChecker ? "삼각형이 됩니다." : "삼각형을 만들 수 없습니다.";
//            System.out.println(triangle);
//         }
//         if (s1 == s2 && s1 == s3) System.out.println("정삼각형입니다.");
//      }
//      
//     
//      
//      /* if() {
//       * }
//       * else {
//       *    if() {
//       * }
//       *    else(){
//       *    }
//       */
//      
//      // Q3. 사용자에게 입력받은 세 정수 중 가장 큰 수를 구하는 프로그램!
//      System.out.println("세 정수를 입력해주세요. 큰 수를 찾자!");
//      int xx = sc.nextInt();
//      int yy = sc.nextInt();
//      int zz = sc.nextInt();
//      int maximum = xx;
//      if (yy > maximum) maximum = yy; 
//      if (zz > maximum) maximum = zz;
//      
//      System.out.printf("최대값은 %d입니다.\n", maximum);
//      
//      System.out.printf("[ROUND2]세 정수를 입력해주세요. 큰 수를 찾자!\n", maximum);
//      
//      int aa = sc.nextInt();
//      int bb = sc.nextInt();
//      int cc = sc.nextInt();
//      int max = 0;
//      
//      if (aa > bb) {if (aa > cc) max = aa;}   
//      else if (bb > cc) max = bb;
//      else max = cc; // bb <= cc 
//      System.out.printf("[ROUND2] 최대값은 %d입니다.\n", max);
//   
//
//      /* Q4. 사용자에게 문자 하나 (char)를 입력받아 소문자로 변경
//       *       + 소문자 -> 소문자, 대문자 -> 소문자
//       *       + toLowerCase() 사용 불가
//       */
//      
//      // 입력받기 & 확인
//      System.out.println("알파벳 문자를 하나 입력하세요.");
//      char aChar = sc.next().charAt(0);
//      System.out.printf("입력한 알파벳의 아스키코드값은 %d입니다.\n", (int)aChar);      
//      System.out.println("입력한 알파벳의 아스키코드값은 " + (int)aChar + "입니다.\n");      
//      // 유효성 검사 
//      boolean lowerChar = ((int)aChar >= 'a') && ((int)aChar <= 'z'); // 소문자?
//      boolean upperChar = ((int)aChar >= 'A') && ((int)aChar <= 'Z'); // 대문자? 
//      boolean errorChar = !((lowerChar) || (upperChar));            // 영문자 아닌 전부
//      // 영문자 아닌 것 거르기
//      if (errorChar) {
//         System.out.println("알파벳만 입력해주세요.");
//         return;
//      }
//      // 소문자 -> 소문자
//      if (lowerChar) {
//         // 소문자
//         System.out.println("입력된 문자는 소문자입니다. :" + aChar);
//      }
//      // 대문자 -> 소문자
//      if (upperChar) {
//         // 대문자 -> 소문자
//         int swcChar = aChar + 'a' - 'A';
//         System.out.println("입력하신 문자를 소문자 \"" + (char)swcChar + "\"로 바꿨습니다.");
//      }
//      
//      // (2)
//      char ch = sc.next().charAt(0);
//      if(ch >= 'A' && ch <= 'Z') {
//         // ch = ch + ('a' - 'A');
//         ch += ('a' - 'A');
//      }
//      System.out.println(ch);
//      
//      
//      /*   int asciiValue = 97;
//         *   char convertedChar = (char)asciiValue;
//         *  System.out.println(convertedChar);
//        */
//      
//      
//      /* chatAt(0)
//       * 
//       */
//      
//      
      /* Q5. 학점 판단 프로그램
       * 사용자에게 점수를 하나 입력받아
       * 90점 이상이면: 'A'
       * 80 <= < 90: 'B'
       * 70 <= < 80: 'C'
       * 60 <= < 70: 'D'
       * 60점 미만: 'F'
       */
      /* version 1 */      
//      System.out.println("몇 점인가요? 당신의 학점을 예상해드립니다!");
//      int scr1 = sc.nextInt();
//      if (scr1 >= 0 || scr <=100) {
//    	  if (scr >= 90) System.out.println("A");
//    	  else if (scr >= 80) System.out.println("B");
//          else if (scr >= 70) System.out.println("C");
//          else if (scr >= 60) System.out.println("D");
//          else System.out.println("F");
//      }
//      else { 
//    	  System.out.println("유효한 점수가 아님.");
//    	  return;
//      }
//      
//      /* version 2 */
//      System.out.println("몇 점인가요? 당신의 학점을 예상해드립니다!");
//      int scr2 = sc.nextInt();
//      if (scr2 <= 0 || scr2 >=100) {
//    	  System.out.println("유효한 점수가 아님.");
//    	  return;
//    	  }
//      else {
//    	  if (scr2 >= 90) System.out.println("A");
//    	  else if (scr2 >= 80) System.out.println("B");
//          else if (scr2 >= 70) System.out.println("C");
//          else if (scr2 >= 60) System.out.println("D");
//          else System.out.println("F");
//    	  }
//            
//      /* Q6. 간단한 계산기 만들어봐요 :)
//       * ex) 3 + 4
//       * 지원되는 연산자: +, -, *, /(0으로 나눌 수 없음!)
//       * int i = Integer.valueOf(s); // String -> int 
//       */
//      System.out.println("간단한 계산기~!");
//      double x = sc.nextDouble();
//      char op = sc.next().charAt(0);
//      double y = sc.nextDouble();
//      String res = " ";
//      if (op == '+') res = x + y + " ";
//      else if (op == '-') res = (x - y) + "";
//      else if (op == '*') res = (x * y) + "";
//      else if (op == '/') {
//    	     // error
//    	  if (y == 0) {
//    		  res = "[error] 0으로 나눌 수 없습니다.";
//    		  return;
//    	  }
//    	  else res = x / y + ""; 
//    	  }
//      else res = "지원하지 않는 연산자입니다."; // 여기선 마지막에 유효성 판단하는게 유리
//      System.out.println(res);
      
//      // 연습
//      System.out.print("계산식을 입력 (ex) 3 + 5) : ");
      
//      // 3 + 5
//      int xx = sc.nextInt(); // 3
//      char op2 = sc.next().charAt(0); // +
//      // "hello world"
//      // next() (구분자: 스페이스, 엔터) "hello"
//      // vs nextLine() (구분자: 엔터)  "hello world"
//      int yy = sc.nextInt(); // 5
//      double res2 = 0;
      
      // +
      // 연산자 유효성 판단
//      if(!(op == '+' || op == '-' || ..)) {}
      
//      if (op2 == '+') res2 = xx + yy;
//      else if (op2 == '-') res2 = xx - yy;
//      else if (op2 == '*') res2 = xx * yy;
//      else if (op2 == '/') {
//         if(yy == 0) {
//            System.out.println("[에러] 0으로 나눌 수 없음");
//            return;
//         	}
//         else res2 = (double)xx / yy;
//      }
//      else System.out.println("[에러] 지원하는 연산자가 아님"); // 연산자 유효성 검사
//      System.out.printf("%d %c %d = %d\n", xx, op2, yy, (double)res2);
//      //
      
      /* Q7. 사용자에게 문자(알파벳, 숫자) 하나를 입력받아
       * 해당 문자가 소문자인지, 대문자인지, 숫자인지 판단 프로그
       * 나머지 경우는 특수문자라고 출
       */
     /* ver.1 */ 
//     char cha = sc.next().charAt(0);
//	 boolean lowerCha = (cha >= 'a') && (cha <= 'z');
//	 boolean upperCha = (cha >= 'A') && (cha <= 'Z');
//	 boolean num = (cha >= '0') && (cha <= '9');
//     if (lowerCha) System.out.println("소문자!");
//     if (upperCha) System.out.println("대문자!");
//     if (num) System.out.println("숫자!");
//     if (!lowerCha && !upperCha && !num) System.out.println("특수문자!");
     
     /* ver.2 */
     
//     char cha = sc.next().charAt(0);
//
//     if ((cha >= 'a') && (cha <= 'z')) System.out.println("소문자!");
//     if ((cha >= 'A') && (cha <= 'Z')) System.out.println("대문자!");
//     if ((cha >= '0') && (cha <= '9')) System.out.println("숫자!");
//     else if (((cha >= '!') && (cha <= '/')) 
//    		 || ((cha >= ':') && (cha <= '@')) 
//    		 || ((cha >= '[') && (cha <= '\''))
//    		 || ((cha >= '{') && (cha <= '~')))
//    				 System.out.println("특수문자!");
//     
//     /* Q8. 사용자에게 두 점(실수)을 입력받아
//      * 해당 점의 사분면판단 프로그램
//      * (원점, x축, y축 위에 점이 생길 수도 있음)
//      */
//     System.out.println("좌표평면에서의 위치를 구해봅시다.x값과 y값을 입력하세요.");   
//     double alpha = sc.nextDouble();
//     double beta = sc.nextDouble();
//     
//     if (alpha == 0) {
//    	 if (beta == 0) System.out.println("원점입니다.");  
//    	 else System.out.println("y축입니다.");
//     }
//     else if (alpha > 0) {
//    	 if (beta == 0) System.out.println("x축입니다."); 
//    	 else if (beta > 0) System.out.println("제1사분면 위의 점입니다.");  
//    	 else System.out.println("제4사분면 위의 점입니다.");  
//     }
//     else { // if (alpha < 0) 
//    	 if (beta == 0) System.out.println("x축입니다."); 
//    	 else if (beta > 0) System.out.println("제2사분면 위의 점입니다.");  
//    	 else System.out.println("제3사분면 위의 점입니다.");  
//     }
//     
//     
      // 문제?
//      int score = 55;
//      char gpa = 'x'; // default 값이 없으면 조건문에서 출력할 게 없어서 초기화하고 시작하는 것! 
//      
//      if (score >= 90) gpa = 'A';
//      else if (score >= 80) gpa = 'B';
//      else if (score >= 70) gpa = 'C';
//      else if (score >= 60) gpa = 'D';
//      else gpa = 'X';
//      System.out.println(gpa);
//      
      
   }   
}
//      
//      
//

//
//
//}