package loopexample;

import java.util.Scanner;

public class DoWhileEx {

	public static void main(String[] args) {
		
		int num = 1;
		int sum = 0;
		
		do {
			sum += num;
			num++;
		}while(num <= 10);
		
		System.out.println(sum);
		System.out.println(num);
		
		System.out.println("------");
		
		System.out.println("0 입력하면 종료");
		
		Scanner scanner = new Scanner(System.in);
		int input;
		int sum1 = 0;
		
		do {
			input = scanner.nextInt();
			sum1 += input;
		}while(input != 0);	// 0 입력시 종료
		
		System.out.println(sum1);
	}

}
