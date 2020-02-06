package loopexample;

import java.util.Scanner;

public class StarDiamond {

	public static void main(String[] args) {
		//내 코드 
//		int input, space, star;
//		
//		System.out.print("홀수를 입력하시오: ");
//		Scanner scanner = new Scanner(System.in);
//		input = scanner.nextInt();
//		space = input / 2;
//		star = 1;
//		
//		for(int i = 0; i < (input / 2); i++) {
//			for(int x = space; x > 0; x--) {
//				System.out.print(" ");
//			}
//			for(int y = 1; y <= star; y++) {
//				System.out.print("*");
//			}
//			space--;
//			star+=2;
//			System.out.println();
//		}
//		
//		for(int i = 0; i < (input / 2) + 1; i++) {
//			for(int x = 1; x <= space; x++) {
//				System.out.print(" ");
//			}
//			for(int y = star; y >= 1; y--) {
//				System.out.print("*");
//			}
//			space++;
//			star-=2;
//			System.out.println();	
//		}
		
		//쌤 코드 
		System.out.println("홀수 값을 입력하세요:");
		
		Scanner scanner = new Scanner(System.in);
		int lineCount = scanner.nextInt();  //다른 홀수 값을 넣어보세요
		int spaceCount = lineCount/2 +1;
		int starCount = 1;
		
		for(int i = 0; i<lineCount; i++) {
			for(int j = 0; j<spaceCount; j++) {
				System.out.print(' ');
			}
			for(int j=0; j<starCount; j++) {
				System.out.print('*');
			}
			
			if(i < lineCount/2) {
				spaceCount-=1;
				starCount+=2;
			}
			else {
				spaceCount+=1;
				starCount-=2;
			}
			System.out.println();
		}
	}
}