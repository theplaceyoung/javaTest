package arithmetic;

// �ڵ�����: ctrl + A (��ü�����) + ctrl+shift+F (�ڵ�����)
public class ArithmeticOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		
		/* ����/�Ҵ� ������(assignment operator)
		 * : ���� = ������
		 * : ��ǻ�Ϳ��� ���� (==)
		 * 
		 * ��� ������ (+, -, *, /, %)
		 * ** % : �������� (x%y)
		 * ** when? ���!
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
		System.out.println(x/y);	// ���� ����(����) & ������ �����ϱ� �Ҽ� ����
		System.out.println(x%y);		
	}
}
