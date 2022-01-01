/* [구트아카데미] 자바과제_2번_장소영 (010 4579 8635) */
/* ControlStatement.java */

/*
 * Q1. 사용자에게 문자 하나를 입력받아서 알파벳이 아니면 계속 입력하는 프로그램 * while(true) 이용
 * 
 * Q2. 사용자에게 구구단 단수 (2 ~ 9단)를 입력받아 구구단 출력 프로그램 ex) 구구단의 단수를 입력하시오: 2 2 * 1 = 2 2
 * * 2 = 4 2 * 3 = 6 ......... 2 * 9 = 18
 * 
 * 추가문제 1) 만약 사용자가 잘못된 단수를 입력하면 계속 입력받게 하시오.
 * 
 * 
 * Q3. 5명의 컴퓨터 성적 (정수) (0 ~ 100)을 입력받아 성적의 합계와 평균을 구하는 프로그램 추가문제 1) 만약 사용자가 잘못된
 * 성적을 입력하면 계속 입력받게 하시오.
 * 
 * 
 * Q4. 5개의 숫자 (정수)를 입력받아 최댓값, 최솟값을 구하는 프로그램
 * 
 * Q5. 1 ~ 10 중에서 3의 배수만 출력하는 프로그램 (사용자 입력 필요 없음)
 * 
 * Q6. 사용자에게 문자 하나 (알파벳, 숫자, 특수문자 모두 가능)를 입력받아 'q' 문자가 들어오기 전까지 입력받은 문자를 하나의
 * 문자열로 바꾸는 프로그램 (while(true) + break 문제) ex) 'a' 'b' 'c' '1' 'd' 'q' => "abc1d"
 * 추가문제 1) 문자열을 역순으로 저장하게 할 수 있을까요? 'a' 'b' 'c' '1' 'd' 'q' => "d1cba"
 * 
 * Q7. 사용자에게 n을 입력받아 n!을 구하는 프로그램 (n! = 1 x 2 x 3 x 4 ... n) ex) 5! = 1 x 2 x 3
 * x 4 x 5 = 120
 */

package second_test;

import java.util.Scanner;  // 스캐너 임포트!

public class ControlStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in); // 입력함수 (공통)
		
		/*
		 * Q1. 사용자에게 문자 하나를 입력받아서 알파벳이 아니면 계속 입력하는 프로그램 * while(true) 이용
		 */
		while(true) {
			System.out.println("Q1. 문자를 입력해보세요.");
			char ch = scan.next().toLowerCase().charAt(0);
			if (ch > 'a' && ch < 'z') continue;
			else {
				System.out.println("종료");
				break;
				}
			}
	
		/* 2. 사용자에게 구구단 단수 (2 ~ 9단)를 입력받아 구구단 출력 프로그램 ex) 구구단의 단수를 입력하시오: 2 2 * 1 = 2 2
		 * * 2 = 4 2 * 3 = 6 ......... 2 * 9 = 18
		 * 
		 * 추가문제 1) 만약 사용자가 잘못된 단수를 입력하면 계속 입력받게 하시오.
		 * - DONE / DONE
		 */
		
		System.out.println("Q2. 알고싶은 구구단 단수를 입력해주세요: ");	    
	    int times = scan.nextInt();
	    while(true) {
	    	if (times < 2 || times > 9) { 
	    		System.out.printf("2부터 9 중 다시 입력하세요.\n");
	    		times = scan.nextInt();
	    	}
	    	else break;
	    } 
	    int mul = 1;
    	while (mul >= 1 && mul <= 9) {
    	   	System.out.printf("%d * %d = %d \n", times, mul, times * mul);
    	   	mul++;
    	}
    	System.out.println();
	    
		/* Q3. 5명의 컴퓨터 성적 (정수) (0 ~ 100)을 입력받아 성적의 합계와 평균을 구하는 프로그램 추가문제 1) 만약 사용자가 잘못된
		 * 성적을 입력하면 계속 입력받게 하시오. - DONE
		 */
		System.out.printf("Q3. 입력받은 5명 성적 합계와 평균 구하는 프로그램\n");	  
    	int three = 0;	
	    int sum = 0;	// 합계
	    int param = 5; // 학생 수
	    double avg = 0;
	    while (three>=0 && three <5){
			System.out.printf("> %d번째 학생 성적 입력하세요.\n", three + 1);	    
		    int p = scan.nextInt();	
		    	while (p<0 || p>100) {
		    		System.out.println("유효한 값이 아닙니다. 다시입력해주세요.");	
		    		p = scan.nextInt();
		    	}
		    	sum += p;
		    	avg = sum / param;
				three++;
		    	}
		System.out.println("총합: " + sum);	   
		System.out.println("평균: " + avg);

	 
		/* Q4. 5개의 숫자 (정수)를 입력받아 최댓값, 최솟값을 구하는 프로그램
		 * - DONE
		 */ 
		System.out.println("Q4. 5개의 숫자 중 최댓/최솟값은?");
		System.out.println(" > 5개의 숫자를 입력해보세요.");	
		int max = Integer.MIN_VALUE;  
		int min = Integer.MAX_VALUE;  
		String tempM = "";
		for (int fur = 0; fur < 5; fur++ ) {
			int newIn = scan.nextInt();	
			tempM += newIn + " ";
				if (newIn >= max) max = newIn;
				if (newIn <= min) min = newIn;
			
		}
		System.out.printf(" > %s\n > 최댓값: %d\n > 최솟값: %d\n", tempM, max, min);	
		
		/* Q5. 1 ~ 10 중에서 3의 배수만 출력하는 프로그램 (사용자 입력 필요 없음)
		 * - DONE
		 */
		System.out.println("Q5. 1 ~ 10 중 3의배수는?");
		int fiv = 1;
    	while (fiv >= 1 && fiv <= 10) {
    		if (fiv % 3 == 0) System.out.println(fiv);
    		fiv++;
    		
    	}
    	
    	/* Q6. 사용자에게 문자 하나 (알파벳, 숫자, 특수문자 모두 가능)를 입력받아 'q' 문자가 들어오기 전까지 입력받은 문자를 하나의
		 * 문자열로 바꾸는 프로그램 (while(true) + break 문제) ex) 'a' 'b' 'c' '1' 'd' 'q' => "abc1d"
		 * 추가문제 1) 문자열을 역순으로 저장하게 할 수 있을까요? 'a' 'b' 'c' '1' 'd' 'q' => "d1cba"
		 * - DONE / DONE
		 */
		System.out.println("Q6. 문자를 모아서 문자열 붙이자! 단, 종료를 원한다면 \"q\" 입력!, 문자를 입력해주세요.(알파벳, 숫자, 특수문자 모두 가능)");	  
		String str = ""; // 문자열 저장공간 
		String reverse = "";
		while(true) {
			char ch = scan.next().charAt(0);
			if (ch != 'q'){
				str += ch;
				reverse = ch + reverse;
				}
			else {
				System.out.println("종료합니다.");
				System.out.println("문자열이 나옵니다.:" + str);
				System.out.println("역순 문자열이 나옵니다.:" + reverse);
				break;
			}
		}
		
    	
    	/* Q7. 사용자에게 n을 입력받아 n!을 구하는 프로그램 (n! = 1 x 2 x 3 x 4 ... n)
    	 * ex) 5! = 1 x 2 x 3 x 4 x 5 = 120
    	 * - DONE
		 */
		System.out.println("Q7. 펙토리얼(factorials)계산기(n!), 원하는 n값을 입력해주세요.");	   
		int nFactorials = scan.nextInt();
		int sev = 1;
		int tempF = 1;
		for (sev = 1; sev < nFactorials + 1; sev++) {
			tempF *= sev;
		}
		System.out.printf("%d! = %d \n",nFactorials, tempF);
		
		
	}

}
