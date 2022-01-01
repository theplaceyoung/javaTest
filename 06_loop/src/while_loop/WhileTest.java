package while_loop;

import java.util.Scanner;

public class WhileTest {

	/* 반복문: 어떤 문장이 반복되는 구조
	 * 예) 30명 성적받고 싶을 때
	 * 예) 1 ~ 45 로또값 6개
	 * 
	 *  while, do while, for
	 *  
	 *  sysout("hello")
	 *  
	 *  while(조건식) {
	 * 			문장;
	 * }
	 * : 조건식이 참일 때 동안 문장이 실행된다.
	 * : 조건식이 한번이라도 거짓이 되면 반복문은 종료된다. 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// Q1. 사용자에게 문자 하나를 입력 받아서 알파벳이 아니면 계속 입력하는 프로그램
		String storage = "";
		String inputStr = sc.nextLine();	;
		while (true) {
			char first = inputStr.toLowerCase().charAt(0);
			if (first >= 'a' && first <= 'z') break;				
			else {
				inputStr = sc.nextLine();	
				storage += inputStr;
				System.out.printf(storage);				
			}
		}

		// Q2. 사용자에게 구구단 단수를 입력받아서 구구단 출력
//		System.out.println("알고싶은 구구단 단수를 입력해주세요: ");	    
//	    int n = sc.nextInt();
//	    while(true) {
//	    	if (n <= 1 || n >= 10) { 
//	    		System.out.printf("2부터 9 중 다시 입력하세요.\n");
//	    		n = sc.nextInt();
//	    	}
//	    	else break;
//	    } 
//	    int j = 1;
//    	while (j >=1 && j <= 9) {
//    	   	System.out.printf("%d * %d = %d \n", n, j, n*j);
//    	   	j++;
//    	}
//	    
//		// Q3. 5명의 컴퓨터 성적(정수)를 입력 받아 성적의 합계와 평균을 구하기
//	    int k = 0;
//	    int sum = 0;
//	    
//	    while (k >= 0 && k < 5){
//    		
//			System.out.printf("%d번째 성적? ", k + 1);	    
//		    int p = sc.nextInt();		    
//		    sum += p;
//		    k++;
//	    }
//		System.out.println("총합: " + sum);	   
//		System.out.println("평균: " + sum/5);
//
//	 
//		// Q4. 5개의 숫자 (정수)를 입력받아 최대/최소값 구함
//		int l = 1;
//		int max = Integer.MIN_VALUE; // 엄청 작은 값 
//		int min = Integer.MAX_VALUE; // 엄청 큰 
//		int temp = 0;
//		while (l <= 5) {
//			System.out.println("5개 정수를 하나씩 입력해주세요." + l + "번째 입력!");
//			int input = sc.nextInt(); 
//			temp = input;		
//			if (temp >= max) max = temp;
//			if (temp <= min) min = temp;
//			l++;
//		}
//		System.out.println(temp);
//		System.out.println("최대: " + max);
//		System.out.println("최소: " + min);
//		
//		
//		// Q5. 1 ~ 10 중에서 3의 배수만을 출력
//    	int m = 1;
//    	while (m >= 1 && m <= 10) {
//    		if (m % 3 == 0) System.out.println(m);
//    		m++;
//    		
//    	}
//    	
//    	
//		// Q6. 사용자에게 문자 하나 (알파벳, 숫자, 특수문자 모두 가능)을 
//		// 입력받아 'q' 문자 들어오기 전까지 입력받은 문자를 하나의
//		// 문자열로 바꾸는 프로그램 (while(true) + break 문제)
//		// ex)  'a' 'b' 'c' '1' 'd' 'q' =? "abc1d"
//		String str = "";
//    	while(true) {
//    		System.out.println("스트링만들기,q제외한 문자를 입력하시오.");
//    		char ty = sc.next().charAt(0);
//    		if (ty != 'q') str += ty; 
//    		else break;
//    	}
//    	System.out.println(str);
//	
//    	// Q7. 사용자에게 n을 입력받아 n!을 출력
//    	System.out.println("N! 구하기, N을 입력하세요!");    	
//		int fN = sc.nextInt();
//    	int p = 1;
//    	int tempF = fN;
//    	int factorials = fN;
//    	while (p < fN) {
//    		tempF = fN - p;
//    		factorials *= tempF; 
//    		p++;
//    	}
//    	System.out.printf("%d!는 %d\n", fN, factorials);    	
	}
	

}
