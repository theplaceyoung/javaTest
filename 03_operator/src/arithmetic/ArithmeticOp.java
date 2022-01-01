package arithmetic;

// 자동정렬: ctrl + A (전체블럭잡기) + ctrl+shift+F (자동정렬)
public class ArithmeticOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		
		/* 대입/할당 연산자(assignment operator)
		 * : 변수 = 데이터
		 * : 컴퓨터에서 같다 (==)
		 * 
		 * 산술 연산자 (+, -, *, /, %)
		 * ** % : 나머지값 (x%y)
		 * ** when? 배수!
		 * **** x % 2 == 1 (odd)
		 * **** x % 2 == 0 (even)
		 */
		
		System.out.println(3%5);
		System.out.println(5%3);
		System.out.println(10%6);	
		System.out.println(2%4);	
		
		int x = 10;
		int y = 20;
		System.out.println(x+y);		
		System.out.println(x-y);		
		System.out.println(x*y);		
		System.out.println(x/y);	// 몫이 나옴(정수) & 정수만 나오니까 소수 버림
		System.out.println(x%y);		
	}
}
