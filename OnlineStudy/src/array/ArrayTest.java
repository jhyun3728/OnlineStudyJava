package array;

public class ArrayTest {

	public static void main(String[] args) {

		int[] arr = new int[10];
		int total = 0;
		
		for(int i = 0, num = 1; i < arr.length; i++) {
			arr[i] = num;
			num++;
		}
		
		for(int i = 0; i < arr.length; i++) {
			total += arr[i];
			System.out.println(arr[i]);
		}
		
		System.out.println("total : " + total);
		
		/****************************************/
		int count = 0;
		double mtotal = 1;
		double[] dArr = new double[5];
		
		dArr[0] = 1.1; count++;
		dArr[1] = 2.1; count++;
		dArr[2] = 3.1; count++;
		
		for(int i = 0; i < count; i++) {	// i < dArr.length를 사용하면 dArr[3], dArr[4]가 0이여서 곱하면 mtotal이 0으로 나옴
			mtotal *= dArr[i];
		}
		System.out.println(mtotal);
		
	}

}
