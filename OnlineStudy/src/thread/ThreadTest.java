package thread;

class MyThread extends Thread{
	public void run() {		//extends Thread할 경우 run()을 구현해주어야한다.
		int i;
		
		for(i = 0; i <= 200; i++) {
			System.out.print(i + "\t");
			
			try {
				sleep(10);	//sleep() 메서드는 InterruptedException이 발생해서 깨어날수도 있으므로 try/catch 해준다.
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

	class MyThread2 implements Runnable{  //implements Runnable하면 메서드를 생성하라고 주의표시가 뜨고 누르면 run()메서드가 오버라이드된다.
	@Override
	public void run() {
		int i;
		
		for(i = 0; i <= 200; i++) {
			System.out.print(i + "\t");
			
			try {
				Thread.sleep(10);	//Runnable에서는 Thread.sleep()이다.
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	}
	
}

public class ThreadTest {

	public static void main(String[] args) {

		System.out.println("Start");
		
		MyThread th1 = new MyThread();
		MyThread th2 = new MyThread();
		
		th1.start();
		th2.start();
		
		System.out.println("End");
		
		System.out.println();
		
		System.out.println("Start Thread2");
		
		MyThread2 runner1 = new MyThread2();
		Thread thr1 = new Thread(runner1);
		thr1.start();
		
		MyThread2 runner2 = new MyThread2();
		Thread thr2 = new Thread(runner2);
		thr2.start();
		
		System.out.println("End Thread2");
		
		/************************************************/
		
		Thread t = Thread.currentThread();
		System.out.println(t);  // [main, 5, main]  첫번째가 쓰레드 이름이고 두번째가 우선순위(priority)이고 세번쨰가  이 쓰레드가 어느 그룹인지 알려준다.
												//특별히 지정하지 않으면 priority는 5가 된다. 
	}

}
