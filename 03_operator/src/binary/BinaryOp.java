package binary;

public class BinaryOp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// ���׿�����(binary operator)
		// x+y, x-y, ...
		// ��������ڵ� ���׿�������(+, -, /, *, %)
		
		int x = 10;
		int y = 20;
		x = x+y;
		System.out.println(x); // 30
	

		// ���մ��Կ�����
		x += y; // x = x + y -> 30 + 20 = 50 ! // x = 50, y = 20
		System.out.println(x); // 50		
		x -= y; // x = x - y -> 50 - 20 = 30 ! // x = 30, y = 20
		System.out.println(x); // 30
		x *= y; // x = x - y -> 30 * 20 = 600 ! // x = 600, y = 20
		System.out.println(x); // 600
		x /= y; // x = x - y -> 600 / 20 = 30 ! // x = 30, y = 20
		System.out.println(x); // 30
		x %= y; // x = x - y -> 30 % 20 = 10 ! // x = 10, y = 20
		System.out.println(x); // 10		
		
		
		/* ���� ������
		 * ==:
		 * !=:
		 * >:
		 * <:
		 * >=:
		 * <=:
		 * 
		 * ������ ��� boolean (true, false)
		 */
		
		System.out.println(3 == 3); // T
		System.out.println(3 != 3); // F
		System.out.println(5 != 3); // t
		System.out.println(3 > 3); // f
		System.out.println(3 >= 3); // t
		System.out.println(10 > 5); // t
		
		
		// �������� (�׸���, �Ǵ�, �ƴϴ�)
		/* 
		 * x && y
		 * x || y
		 * !x
		 * 
		 * x, y�� ������ Ÿ���� boolean (true, false�� �Ǵ� ���ɽ�)
		 * ex) x = ( 3 == 3)
		 */

		System.out.println((3 == 3) && (5 == 3)); // f
		System.out.println((3 == 3) || (5 == 3)); // t
		System.out.println((3 != 3) || (5 == 3)); // f
		System.out.println((3 != 3) || (5 == 3)); // f
		System.out.println(!(3 != 3)); // t		
	
	}
		
	
	}
}