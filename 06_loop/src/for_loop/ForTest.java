/* [구트아카데미] 자바과제_3번_장소영 (010 4579 8635) */
/* ForTest.java */
/* 
 * Q1. 업다운 게임
 * 1 <= answer <= 100 사이에 랜덤값 (Math.random())을 정답으로 지정
 * 사용자가 정답을 추측하는 게임
 * if(answer > guess) UP!
 * else if(answer < guess) DOWN!
 * else 정답! 
 * 시도 횟수도 같이 출력!
 * 		
 * Q2. 김밥천국 문제
 * 얼마 가지고 있니? 10000원
 * =====================
 * 1. 김밥 (2500)
 * 2. 라면 (3000)
 * 3. 떡볶이 (4000)
 * 4. 돈까스 (5000)
 * 5. 종료
 * =====================
 * 		
 * 메뉴 주문 번호: 1
 * 김밥 선택하셨습니다.
 * 잔돈은 7500원입니다.
 * 		
 * 메뉴 주문 번호: 2
 * 라면 선택하셨습니다.
 * 잔돈은 4500원입니다.
 * 		
 * 메뉴 주문 번호: 5
 * 종료!
 * 잔돈은 4500원입니다.
 * 		
 * 조건
 * 1) 만약 본인이 가진 돈보다 비싼 메뉴를 골랐을 경우
 *    돈이 부족합니다! 라는 메시지를 출력 -> 다시 메뉴 선택
 * 2) 잔돈이 0이면 종료
 *
 * 3) (추가) 만약 가진 돈이 메뉴 가격의 최솟값보다 작으면 시작할 수 없음 (**)
 * 4) 가진 돈이 유효하지 않은 데이터일 수도 있음 (그럴 경우 다시 입력받게)
 * 5) 1 ~ 5 사이 메뉴를 입력하지 않았을 경우 오류 출력
 */


package for_loop;
import java.util.Scanner;
public class ForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// While 3가지
		// 1) 초기화
		// 2) 조건식
		// 3) 증감식
		
		// for (초기화; 조건식; 증감식) {
		// 		문장;
		// }
		
		////////// 다음과 같은 continue
		// 
//		int a = 1;
//		for (int a = 1; a < 11; a++) {
//			if(a % 3 == 0) {
//				continue;	
//			}
////			System.out.println(a);
//			}
//		System.out.println(a);
		
		//////////
//		for (int b = 1; b < 11; b++) {
//			System.out.println(b);
//			if(b % 3 != 0) {
//				continue;	
//			}
//			System.out.println(a);
			
		///////////
		
		// Q1. i == 0 2 4 6 8 10 // 
//		int i = 0;
//		for(i = 0; i <= 10; i += 2) {
//			System.out.println(i);
//		}
//		// Q2. i == 1 3 5 7 9	 // i = 1; ; i += 2;
//		int j = 1;
//		for(j = 1; j < 10; j +=2) {
//			System.out.println(j);			
//		}
//		// Q3. i == 1 ~ 10까지 합계 ( 1 + 2 + 3 + ... + 10) // i = 1 ; sum += i ; i++ ;
//		int k = 1;
//		int sum = 0;
//		for(k = 1; k < 11; k++) {
//			sum += k;			
//		}
//		System.out.println("1 부터 10까지 합하면: " + sum + "\n\n");
//		
//		// Q4. (무한루프 문제) 사용자에게 -1 나오기 전까지 양의 정수를 입력받아 몇 개의 양수가 입력되었는지 카운팅하는 프로그램 ex. 1 3 5 7 -1 => 4
//		int in = 1;
//		int count = 0;
//		for (;;) {
//			System.out.println("양수를 입력해보아요. 멈추고 싶다면 -1을 입력주세요." + "count: " + count);
//			in = sc.nextInt();
//			if (in == -1) break;
//			else if (in > 0) System.out.println("입력한 양수:" + in);
//			else { 
//				System.out.println("양수로 입력해야 카운트가 올라가요!");
//				continue;
//				}
//			count++;
//		}
//		System.out.println("입력한 양수의 갯수는?: " + count + "\n\n");
//		
//		// Q5. 업다운 게임
//		// 1 ~ 100 사이에 랜덤값(Math.random())을 정답으로 지정
//		// if(answer > guess) UP!
//		// else if(answer < guess) DOWN!
//		// else 정답!
//		// 시도 횟수도 같이 출력!
//		int answer = (int)(100 * Math.random()) + 1;
//		System.out.println("1 부터 100 중 정답이 있습니다! 맞춰보세요?");
//		int m = 0;
//				for (m = 1; ;m++) {
//					int guess = sc.nextInt(); // 1 ~ 100
//					System.out.println("guess : " + guess);
//					if (answer > guess) System.out.println("UP!");
//					else if (answer < guess) System.out.println("DOWN!");
//					else { 
//						System.out.println("정답!");
//						break;
//					}
//				}
//		 System.out.printf("%d번만에 정답을 찾아냈군요, 정답은 %d!\n", m, answer);
//		
//		// Q5-2. 업다운 게임
//		// 1 ~ 100 사이에 랜덤값(Math.random())을 정답으로 지정
//		// if(answer > guess) UP!
//		// else if(answer < guess) DOWN!
//		// else 정답!
//		// 시도 횟수도 같이 출력!
////		int answer = 10;
////		int l = 0;
////				for (l = 1; ;l++) {
////					int guess = (int)(99 * Math.random()) + 1; // 0 ~ 100
////					System.out.println("guess : " + guess);
////					if (answer > guess) System.out.println("UP!");
////					else if (answer < guess) System.out.println("DOWN!");
////					else { 
////						System.out.println("정답!");
////						break;
////					}
////				}
////		 System.out.printf("%d번만에 정답을 찾아냈군요, 정답은 %d!\n", l, answer);
		
		// Q6. 김밥천국 문제
		// ===================================
		// 1. 김밥 (2500)
		// 2. 라면 (3000)
		// 3. 떡볶이 (4000)
		// 4. 돈까스 (5000)
		// 5. 종료
		// ===================================
		
		
		String list = 
				"(김밥천국)메뉴를 선택해주세요.\n"
				+ "1. 김밥(2500)\n"
				+ "2. 라면(3000)\n"
				+ "3. 떡볶이(4000)\n"
				+ "4. 돈까스(5000)\n"
				+ "5. 종료\n";
		
		// 메뉴선택
		String menu = "";
		String bucket = "";
		int order = 0;
		int price = 0;
		int start = 1;
		while(start == 1) {				
			for (int q=0;q < 50 ;q++) {		
				// 메뉴선택
				System.out.println(list); //
				int c = sc.nextInt();	
				if (c < 0 && c > 6) System.out.println("올바른 번호를 선택해주세요.");
				else {
					switch(c) {
					case 1:  
						menu = "1. 김밥";
						order = 2500;
					break;
					case 2:
						menu = "2. 라면";
						order = 3000;
					break;
					case 3:
						menu = "3. 떡볶이";
						order = 4000;
					break;
					case 4: 
						menu = "4. 돈까스";
						order = 5000;
					break;
					case 5:
						menu = "5. 종료";
						System.out.println("장바구니로 넘어갑니다.");
						System.out.printf("선택한 메뉴: %s\n", bucket);
						break;
					}
					if (c != 5) {
						bucket += " " + menu;
						price += order;
						continue;
						} 
					else break;
				}
			}
		// 정산 부분
			System.out.printf("주문 총액: %d\n", price);
			System.out.printf("지불 금액을 입력해주세요.\n");
			int payment = sc.nextInt();
			int change = payment - price;
			if (payment <= 0) {					// 내는 돈이 0 이상
					System.out.println("[에러]지불 가능 금액을 다시 입력해주세요.\n");	// 지불금액 재입력 안내
					payment = sc.nextInt();
					start = 0;
					continue;	
			}
			while (payment > 0) {				// 내는 돈이 0 초과
//				int change = payment - price;	
				if (change < 0) {
					System.out.println("금액이 모자랍니다. 1. (지불)금액 재입력 2. 메뉴선택로 돌아가기\n");
					int d = sc.nextInt();
					switch (d) {
					case 1: 		// 1. 지불금액 재입력
						if (change < 0) {
							System.out.printf("가격은 %d입니다. 지불금액 입력해주세요.\n", price);
							payment = sc.nextInt();
							change = payment - price;
							continue;
							}
						else break;
					case 2: {	 // 2. 메뉴판 돌아가기
						start = 1;
						break;
						}
					}
				}
				else if (change == 0){ 	// 잔돈 0원
					System.out.println("잔돈은" + change + "원입니다.\n"); 
//					return;
					}
				else { 					// 잔돈 있음
					System.out.println("잔돈은" + change + "원입니다. 거스름돈 챙겨가세요.\n");
//					return;
					}
				System.out.println("1. 다음주문 2. 종료 \n"); 
				int e = sc.nextInt();
				switch(e) {
				case 1: 
					System.out.println("메뉴선택으로 돌아갑니다.\n"); 
					start = 1;
					break;
				case 2: 
					System.out.println("종료합니다.\n"); 
					return;
				}
				break;
			}
			//
			continue;
		}
	}
}





