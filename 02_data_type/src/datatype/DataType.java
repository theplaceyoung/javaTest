package datatype;

public class DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ������Ÿ�� (�ڷ���)
		/*
		 * ����: byte(1byte), short(2byte), int(4byte), long(8byte)
		 * �Ǽ�: float(4byte), double(8byte)
		 * ����: char(2byte)
		 * ���ڿ�: String
		 * �Ҹ�: boolean(1byte)
		 * 
		 */
		
		byte b = 127; 
		// 128 �̻� ǥ�� x, 1byte == 8 bit (-2^7(-128) ~ 2^7-1(127))
		// overflow �� ����!!
		float f = (float)3.34567890e6; // 3*10^6
		float f1 = (float)3e-6;
		double d = 3e6;
		double dd = 3e-6;
		System.out.println(b);
		System.out.println(f);
		System.out.println(f1);
		System.out.println(d);
		System.out.println(dd);
		
		float ff = 312.25789112f;
		double ddd = 312.25789112;
		System.out.println(ff);
		System.out.printf("%f\n", ff); // �����Ⱚ�� ���ԵǾ��ְ� �Ҹ�Ȯ�ϹǷ� �ظ��ϸ� ����� �����ϱ�!!
		System.out.println(ddd);
		System.out.printf("%f\n", ddd);
		
		// ���� ǥ������ ���ϴ� ���� ���ؼ��� ��� ǥ���ұ��? > "" (String)!
		
		/* �������!
		 * ����: 2����(��ǻ��), 8����, 16����, 10����(������� ���)
		 * 8����(2^3) / 16����(2^4)
		 */
		
		int d1 = 10; // 10��
		int d2 = 012; // 8��(0������) 
		int d3 = 0XA;  // 16(0X������)
//		char e = 'e'
		// %d => decimal (10����)
		System.out.printf("%d\n", d1);
		System.out.printf("%d\n", d2);
		System.out.printf("%d\n", d3);
		System.out.printf("%o\n", d1);
		System.out.printf("%o\n", d2);
		System.out.printf("%o\n", d3);
		System.out.printf("%x\n", d1);
		System.out.printf("%X\n", d2);
		System.out.printf("%x\n", d3);
		
//		System.out.printf("%h\n", e);		
		
	}

}
