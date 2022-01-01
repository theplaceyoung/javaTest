package do_while;

public class DoWhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 0;
		do {
			System.out.println();
			i++;
		} while(i <3);
		System.out.println(i);
		
		i = 0;
		do {
			System.out.println("");
			i++;
		} while(i >3); // 조건 거짓
		System.out.println(i); 
		
	}

}
