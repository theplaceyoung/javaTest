package third_test;

import java.util.Scanner;

public class LoopStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Scanner sc = new Scanner(System.in);
	
	/* Q1. 업다운 게임
	 * 1 ~ 100 사이에 랜덤값(Math.random())을 정답으로 지정
	 * if(answer > guess) UP!
	 * else if(answer < guess) DOWN!
	 * else 정답!
	 * 시도 횟수도 같이 출력!
	 */
	
	int answer = (int)(100 * Math.random()) + 1;
	System.out.println("1 부터 100 중 정답이 있습니다! 맞춰보세요?");
	int m = 0;
			for (m = 1; ;m++) {
				int guess = sc.nextInt(); // 1 ~ 100
				System.out.println("guess : " + guess);
				if (answer > guess) System.out.println("UP!");
				else if (answer < guess) System.out.println("DOWN!");
				else { 
					System.out.println("정답!");
					break;
				}
			}
	 System.out.printf("%d번만에 정답을 찾아냈군요, 정답은 %d!\n", m, answer);
	 
	 	/*
		 * Q2. 김밥천국 문제 얼마 가지고 있니? 10000원
		 * =====================
		 * 1. 김밥 (2500) 
		 * 2. 라면 (3000)
		 * 3. 떡볶이 (4000) 
		 * 4. 돈까스 (5000) 
		 * 5. 종료 
		 * =====================
		 * 
		 * 메뉴 주문 번호: 1 김밥 선택하셨습니다. 잔돈은 7500원입니다.
		 * 
		 * 메뉴 주문 번호: 2 라면 선택하셨습니다. 잔돈은 4500원입니다.
		 * 
		 * 메뉴 주문 번호: 5 종료! 잔돈은 4500원입니다.
		 * 
		 * 조건 1) 만약 본인이 가진 돈보다 비싼 메뉴를 골랐을 경우 돈이 부족합니다! 라는 메시지를 출력 -> 다시 메뉴 선택 
		 * 조건 2) 잔돈이 0이면 종
		 * 조건 3) (추가) 만약 가진 돈이 메뉴 가격의 최솟값보다 작으면 시작할 수 없음 (**) 
		 * 조건 4) 가진 돈이 유효하지 않은 데이터일 수도 있음 (그럴 경우 다시 입력받게) 
		 * 조건 5) 1 ~ 5 사이 메뉴를 입력하지 않았을 경우 오류 출력
		 */
	 
	 String list = 
					"(김밥천국)메뉴를 선택해주세요.\n"
			 	    + "====================="
					+ "1. 김밥(2500)\n"
					+ "2. 라면(3000)\n"
					+ "3. 떡볶이(4000)\n"
					+ "4. 돈까스(5000)\n"
					+ "5. 종료\n"
	    			+ "=====================";		
	    			
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
//					int change = payment - price;	
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
//						return;
						}
					else { 					// 잔돈 있음
						System.out.println("잔돈은" + change + "원입니다. 거스름돈 챙겨가세요.\n");
//						return;
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
			
	 // 선생님 FEEDBACK
			
			String list = "======= [김 밥 천 국] =======\n"
		            + "1. 김밥  (2500원)\n" 
		            + "2. 라면  (3000원)\n" 
		            + "3. 떡볶이 (4000원)\n" 
		            + "4. 돈까스 (5000원)\n"
		            + "5. 종료\n"
		            + "==========================";

		      // 메뉴선택
		      String menu = "";
		      String bucket = "";
		      int order = 0;
		      int price = 0;
		      int tries = 0;
		      while (true) {
		         
		         // 메뉴 선택 부분
		         while (true) {
		            System.out.println(list); //
		            int c = sc.nextInt();

		            switch (c) {
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
		            default:
		               menu = "";
		               System.out.println("잘못된 메뉴 선택입니다.");
		               break;
		            }
		            if (c == 5) break;
		            else {
		               bucket += " " + menu;
		               price += order;
		               tries++;
		               if (tries == 50) break; // 기회 50번으로 제한
		               continue;
		            }
		         }

		         // 정산 부분
		         while (true) {
		            System.out.printf("주문 총액: %d원\n", price);
		            System.out.printf("지불 금액을 입력해주세요.\n");
		            int payment = sc.nextInt();
		            if (payment < 0) { // 내는 돈이 0 이상 (처음에 선택을 안해서 0원일 수도 있음)
		               System.out.println("[에러] 지불 가능 금액을 다시 입력해주세요.\n"); // 지불금액 재입력 안내
		               continue;
		            }

		            int change = payment - price;
		            if (change < 0) {
		               System.out.println("금액이 모자랍니다. 1. (지불)금액 재입력 2. 메뉴");
		               int d = sc.nextInt();
		               if (d == 1)   continue;
		               else break;
		            } else if (change == 0) { // 잔돈 0원
		               System.out.println("잔돈은 " + change + "원입니다.\n");
		               return;
		            } else { // 잔돈 있음
		               System.out.println("잔돈은 " + change + "원입니다. 거스름돈 챙겨가세요.\n");
		               return;
		            }
		         }
		      }
	 // 여기까
	}
}
