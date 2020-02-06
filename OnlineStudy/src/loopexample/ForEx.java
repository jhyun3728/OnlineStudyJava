package loopexample;

public class ForEx {

	public static void main(String[] args) {
		
		int count;
		int sum = 0;
		
		for(count = 1; count <= 10; count++) {
			sum += count;
		}
		/*
		 * 
		 * for(count = 1, i = 0; count <= 10; i++, count++) {	콤마로 여러개 넣을 수 있음 
			sum += count;
		}
		
		
		for(;;){   무한루프 
		}
		 * *?
		 */
		System.out.println(sum);
		
		int num = 1;
		int total = 0;
		
		while(num <= 10) {
			total += num;
			num++;
		}
		System.out.println(total);
	}

}