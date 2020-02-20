package array;

public class TwoDimension {

	public static void main(String[] args) {

		int[][] arr = { {1, 2, 3}, {4, 5, 6, 7, 8} };
		
		System.out.println("행의 개수 : " + arr.length);	//행의 개수
		System.out.println("열의 개수 : " + arr[0].length);	//열의 개수
		System.out.println("열의 개수 : " + arr[1].length);
		System.out.println();
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) { //열의 개수가 달라도 행별로 출력가능
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}