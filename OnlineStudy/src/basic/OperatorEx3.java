package basic;

public class OperatorEx3 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int max = (num1 > num2)?num1:num2;
		System.out.println(max);
		System.out.println("-----");
		
		
		int num3 = 0B00001010; //10
		int num4 = 0B00000101; //5
		
		System.out.println(num3 & num4);
		System.out.println(num3 | num4);
		System.out.println(num3 ^ num4);
		
		System.out.println(num3 << 2);
		System.out.println(num3 >> 1);
	}

}
