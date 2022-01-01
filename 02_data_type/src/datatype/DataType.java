package datatype;

public class DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 데이터타입 (자료형)
		/*
		 * 정수: byte(1byte), short(2byte), int(4byte), long(8byte)
		 * 실수: float(4byte), double(8byte)
		 * 문자: char(2byte)
		 * 문자열: String
		 * 불린: boolean(1byte)
		 * 
		 */
		
		byte b = 127; 
		// 128 이상 표현 x, 1byte == 8 bit (-2^7(-128) ~ 2^7-1(127))
		// overflow 가 났다!!
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
		System.out.printf("%f\n", ff); // 쓰레기값이 포함되어있고 불명확하므로 왠만하면 더블로 저장하기!!
		System.out.println(ddd);
		System.out.printf("%f\n", ddd);
		
		// 더블도 표현하지 못하는 수에 대해서는 어떻게 표현할까요? > "" (String)!
		
		/* 정수출력!
		 * 정수: 2진수(컴퓨터), 8진수, 16진수, 10진수(사람들이 사용)
		 * 8진수(2^3) / 16진수(2^4)
		 */
		
		int d1 = 10; // 10진
		int d2 = 012; // 8진(0붙으면) 
		int d3 = 0XA;  // 16(0X붙으면)
//		char e = 'e'
		// %d => decimal (10진법)
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
