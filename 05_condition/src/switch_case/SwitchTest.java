package switch_case;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner sc = new Scanner(System.in);
	    
		/* switch(변수) {
		 * 	case 1: // a == 1
		 * 		문장;
		 * 		break; // switch 종료 (vs. for break)
		 *  case 2: // a == 2
		 *  	문장;
		 *  	break;
		 *  case 3: // a == 3
		 * 		문장;
		 * 		break;
		 * 	default:
		 * 		문장;
		 * 		break; // default에서 생략 가
		 * }
		 *
		 * switch 장?
		 * 1) 코드 간결함
		 * 2) == 생략되어있는 걸 알고 시작 -> "가독성" 좋다!
		 * 
		 */
		
		/* Q1. 사용자에게 수를 입력 받아 해당 수가 1, 2, 3인지 확인하는 프로그램?
		 *
		 */
//	    int input = sc.nextInt();
	    
	    
		/* Q2. 사용자에게 현재 월을 입력받아 해당 월을 문자로 출력하는 프로그램? */	    
		
//	    int month = sc.nextInt();
////		int month = 1;
//		switch(month) {
//			case 1:
//				System.out.println("January");
//				break;
//			case 2:
//				System.out.println("Febuary");
//				break;
//			case 3:
//				System.out.println("March");
//				break;
//			case 4:
//				System.out.println("April");
//				break;
//			default:
//				System.out.println("N/A");
//		}	
	    
	    // 의도적으로 break를 생략하는 경우? 다양한 케이스가 동일한 결과값을 낼 때!
	    // 사용자에게 월을 입력받아 해당 월의 마지막 일자를 구하는 프로그램?!
	    System.out.print("년 입력:");
	    int year = sc.nextInt();
	    System.out.print("월 입력:");
	    int month = sc.nextInt();
	    int totalDays = -1; 
	    
	    switch(month) {
	    case 1:
	    case 3:
	    case 5:
	    case 7:
	    case 8:
	    case 10:
	    case 12:
	    	totalDays = 31;
	    	break;
	    case 4:
	    case 6:
	    case 9:
	    case 11:
	    	totalDays = 30;
	    	break;
	    case 2:
	    	if ((((year % 4) == 0) && (year != 100)) || ((year % 400) == 0)) totalDays = 29;
	    	else totalDays = 28;
	    	break;
	    default:
	    	System.out.println("error / plz rewrite down a month");
	    	return;
	    }
	    // 
	    System.out.println(year + "년의 " + month + "월은 " + totalDays + "일입니다. \n");
	
	      // Q3. switch문을 이용해서 사용자에게 문자 하나를 입력받아
	      // 모음과 자음을 판별하는 프로그램을 작성
	      // (사용자의 입력이 대소문자 구분없이 들어와도 가능해야함)
	    // cf.  문자열은 equals()로 비교 
	    System.out.print("문자 하나를 입력해 보세요. 영어!!");  
	    char alphabet = sc.next().toLowerCase().charAt(0);
	    
	    String alchk = "a";
	    switch (alphabet) {
	    case 'a': 
	    case 'e':
	    case 'i':
	    case 'o':
	    case 'u':
	    	alchk = "vowel";
	    	break;
		default:
			if (alphabet >= 'a' && alphabet <= 'z') alchk = "consonant"; 
			else alchk = "error / 알파벳 아님 !!";
	 	   }
	    System.out.print(alchk); 
	    
	    }
	}

