package thread;

public class JoinTest extends Thread{

	int start;
	int end;
	int total;
	
	public JoinTest(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	public void run() {
		int i;
		for(i = start; i <= end; i++) {
			total += i;
		}
	}
	
	public static void main(String[] args) {

		JoinTest jt1 = new JoinTest(1, 50);
		JoinTest jt2 = new JoinTest(51, 100);
		
		jt1.start();
		jt2.start();
		
		int total = jt1.total + jt2.total;	//쓰레드가 돌아가는 중에 더한거여서 값이 제대로 안나올 확률이 크다. 이를 방지하기 위해 start()와 total합 문장 사이에 join()을 걸어준다.
		System.out.println("jt1.total = " + jt1.total);
		System.out.println("jt2.total = " + jt2.total);
		System.out.println(total);
		
		/***********join()*********************/
		
		System.out.println("\n" + "*****join()*****");
		
		JoinTest jtj1 = new JoinTest(1, 50);
		JoinTest jtj2 = new JoinTest(51, 100);
		
		jtj1.start();
		jtj2.start();
		
		try {
			jtj1.join();
			jtj2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int joinTotal = jtj1.total + jtj2.total;
		
		System.out.println("jtj1.total = " + jtj1.total);
		System.out.println("jtj2.total = " + jtj2.total);
		System.out.println(joinTotal);
		
		
	}

}
