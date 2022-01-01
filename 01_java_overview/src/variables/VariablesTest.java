package variables;

public class VariablesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ��� (constant)
		// : ���� �� ���� �����͸� �����ϴ� ����
		// : final�� ����
		// : ��� �̸��� ��� �빮�ڷ� �ۼ�
		
		final double PI = 3.2f; // 3.14 ���ǰ� ������ (final)�̾�!
		// ���� �� ū ���� ���� ���������� ����ȯ (�ڵ� ����ȯ)
		
		final float PI2 = (float)3.2;
		// ū �� ���� ���� �� �� ���� ����!!
		// ����� ����ȯ ���ְ� ��!
		
		System.out.println((int)PI); // 3
		
		// Q1. '7' -> 7�� ������ �� �������?
		char num = '7';
		int numInt = (int)num - (int)'0'; //  55 - 48
		System.out.println(numInt); 
//		System.out.println((int)"7");
		
		
//		PI = 3.141592; // ����� ���� �Ұ���
		
		
		int k = 10;
		k = 20;
		
		/* ���� (variables)
		 * : ���� �� �ִ� �����͸� �����ϴ� ����
		 * : ������ Ÿ�� (������ Ÿ��, �ڷ���)
		 * 1) ���� (1, 2, 3, ...) (integer, int)
		 * 2) �Ǽ� (1.23, 3.14, 5.12) (float, double)
		 * 	  : ex) 1.234567892123 -> double
		 * 	  : ex) 1.2345 -> float
		 * 3) ���� ('a', 'b', 'c') (character, char)
		 *    : ���� ����ǥ (')�� ����
		 * 4) ���ڿ� ("abc", "hello") (string)
		 * 	  : ū ����ǥ (")�� ����
		 * 5) �Ҹ� (true, false) (boolean, bool)
		 * 	  : ex) 1�� 1�� ����?
		 * 
		 * : ������ �̸� (��� ��Ģ)
		 * 1) ����� �ۼ� (a�� A�� �ٸ�, ��ҹ��� ����)
		 * 2) �ǹ��ְ� �ۼ�
		 * 	  : ex) name, height, age, count
		 * 3) ù���ڰ� �����̸� �ȵ�
		 * 	  : ex) name1 (O), name2 (O)
		 * 	  : ex) 1name (X), 2name (X)
		 * 4) Ư����ȣ: _ (****), $ (���⵵ �ȵ�)
		 * 5) ������ �̸��� �ҹ��� ���� (countScore)
		 * 	  ���� ���վ��� ��� ���վ��� ù���ڴ� �빮��
		 * 6) Ű���� (keyword)�� �����̸����� ����� �� ����
		 * 	  : ex) class, public, main, package
		 * */
		
		// ���Կ����� (=)�� ���� �����͸� ����!
		// ��ǻ�Ϳ��� ���ٴ� ��� ǥ���ұ��? (==)
		// ���� = ������ (���ͷ�, literal)
		// 3.14 (double)
		// 3 (int)
		int x = 3;
		float y = 3.14f;
		float yy = (float)3.14; // double -> float
		double z = 3.141235123;
		char ch = 'a';
		String s = "abcd";    
		// String�� Ű���尡 �ƴ�, �빮�ڷ� ���� 
		// �ڹٿ��� ������ ���� �ڷ����� �ƴ� (Ŭ����)
		boolean checker = true;
		System.out.println(checker);
		
		// Q1. ������ �̸��� �����ϴ� ������ ����� �̸��� �����غ���!
		String name = "������";
		
		// Q2. ������ ���̸� �����ϴ� ������ ����� ���̸� �����غ���!
		int age = 20;
		
		// Q3. ���� ������ ���̸� �����ϴ� ������ ����� 
		// ���� ������ ���̸� �����غ���!
		int nextAge = age + 1;
		
		// Q4. ���� ���̿� ������ ���̰� �������� Ȯ��

//		checker = (age == nextAge); // ������ checker�� ������Ʈ
//		System.out.println(checker);
		
		
		boolean checker2 = (age == nextAge);
		// chekcer�� �״�� ������ ä�� checker2�� ����
		System.out.println(checker); // true
		System.out.println(checker2); // false
		
		// ������ ���� �̸��� ���� ������ �Ǿ��ֱ� ����
		// �ϳ��� ���α׷� �ȿ����� �ߺ��� ������ �Ҵ��� �� ����
		int a; 
		a = 3;
		System.out.println(a); // 3
		a = 5;
		System.out.println(a); // 5
		System.out.println("a"); // a
		// a vs "a" vs 'a'
		// a: ���� -- 1)
		// "a": ���ڿ� ������ -- 2)
		// 'a': ���� ������ -- 3)
		
		// 1 vs "1" vs '1'
		// 1: ���� ������ -- 4)
		// "1": ���ڿ� ������ -- 5)
		// '1': ���� ������ -- 6)
		
		// ���� = ������
		// Q1. ���� ���� �ڸ��� �� �� �ִ� ģ���� 1 ~ 6 �� ����?
		// -- 1�� ����
		// Q2. ������ �ڸ��� �� �� ���� ģ���� 1 ~ 6 �� ����?
		// -- �� �� �� ����
		int c = 10;
		int d = c;
		// ������ �����ʿ� ���� ��쿡�� 
		// ������ �����Ͱ� ������ ���ǵǾ� �־�� ��
		
		
//		int a; // �Ұ���
		
		
	}

}
