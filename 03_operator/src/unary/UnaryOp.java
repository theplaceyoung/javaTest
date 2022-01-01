package unary;

public class UnaryOp {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 부호연산자
		int a = 3;
		int b = -a;
		System.out.println(b);
		int c = +a;
		System.out.println(c);

		// 2. 증감연산자 (증가하거나 감소하거나) // 대입연산자랑 만나면 까다로워짐
		int var = 10;
		int res1 = ++var; // -- 1)
		// a) ++var // 11
		// b) res = var // 11
		System.out.println(var); // 11
		System.out.println(res); // 11

		res2 = var++; // 2)
		// a) res = var // 11
		// b) var++
		System.out.println(var); // 12
		System.out.println(res); // 11

	}
}
