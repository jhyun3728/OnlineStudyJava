package ifexample;

import java.util.Scanner;

public class IfEx2 {

	public static void main(String[] args) {
		System.out.print("점수 입력 : ");
		Scanner scanner = new Scanner(System.in);
		
		int score = scanner.nextInt();
		
		char grade;
		
		if(score >= 90) {
			grade = 'A';
		}
		else if(score >= 80) {
			grade = 'B';
		}
		else if(score >= 70) {
			grade = 'C';
		}
		else if(score >= 60) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		System.out.println("점수 : " + score);
		System.out.println("학점 : " + grade);
	}

}
