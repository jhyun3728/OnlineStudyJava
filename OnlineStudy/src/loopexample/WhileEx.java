package loopexample;

import java.util.Scanner;

public class WhileEx {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		while(num <= 10) {
			sum += num;
			num++;
		}
		
		System.out.println(sum);
		System.out.println(num);
		
		System.out.println("------");
		
		System.out.println("0 입력하면 종료");
		
		
		int input;
		int sum1 = 0;
		Scanner scanner = new Scanner(System.in);
		input = scanner.nextInt();
		
		while(input != 0) {
			sum1 += input;
			input = scanner.nextInt();
		}	// 0 입력시 종료
		
		System.out.println(sum1);
	}

}
