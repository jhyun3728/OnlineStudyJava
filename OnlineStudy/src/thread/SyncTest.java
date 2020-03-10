package thread;

class Bank{		//공유하는 리소스에 synchronized를 걸어줘야한다. Thread에 걸어줘도 소용없다.
	private int money = 10000;
	
	public synchronized void saveMoney(int save) {	//synchronized로 인해 이 메서드가 끝날때까지 lock이 걸려 다른 쓰레드에서 접근 할 수 없다.
		int m = this.getMoney();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		setMoney(m + save);
	}
	
	public synchronized void minusMoney(int minus) {
		int m = this.getMoney();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		setMoney(m - minus);
	}
	
	/*********synchronized 블록**************/   //sync 메서드보다는 sync 블록 방식이 섬세해서 선호될 수 있다.
	public void subMoney(int sub) {
		synchronized (this) {	//synchronized(어느 객체에 lock을 걸 것인지) {} 이므로 이 객체에 걸 것이여서 this를 쓴다.
			
		}
	}
	/***************************************/
	

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
}

class Park extends Thread{	
	
	public void run() {
		System.out.println("start save");
		SyncTest.myBank.saveMoney(3000);
		System.out.println("save money: " + SyncTest.myBank.getMoney());
	}
	
}

class ParkWife extends Thread{
	
	public void run() {
		System.out.println("start minus");
		SyncTest.myBank.minusMoney(1000);
		System.out.println("minus money: " + SyncTest.myBank.getMoney());
	}
	
	//공유되는 리소스가 Bank이므로 Bank의 메서드에 synchronized를 걸어준다. But!!! 쓰레드의 run()에 sync를 걸고 싶으면 블록 형식으로 한다.
	//Thread의 run()에도 sync를 걸어주면 SyncTest.myBank.minusMoney(1000);만 lock이 걸리는게 아니라 run() 내용 자체가 lock이 걸리므로
	//start save 다음에 start minus가 나오던게 원래 순서에 맞게 start save -> save money -> start minus -> nminus money 순으로 나오게 된다.
	
//	public void run() {
//		synchronized(SyncTest.myBank) {
//			System.out.println("start minus");
//			SyncTest.myBank.minusMoney(1000);
//			System.out.println("minus money: " + SyncTest.myBank.getMoney());
//		}
//	}
}

public class SyncTest {
	
	public static Bank myBank = new Bank(); //공유되는 리소스가 Bank이므로 Bank의 메서드에 synchronized를 걸어준다.

	public static void main(String[] args) throws InterruptedException {

		Park p = new Park();
		p.start();
		
		Thread.sleep(200);
		
		ParkWife pw = new ParkWife();
		pw.start();
		
		//save money가 13000이 나온다. -->> 동기화가 안됐기 때문에 중간에 마이너스한 데이터가 무시된 채로 계산이 됐다. 여튼 동기화때메 꼬였음
		// -->> saveMoney()와 minusMoney() 메서드에 synchronized를 붙여준다.
		
		
		//synchronized를 붙인 후에는 start minus가 먼저 찍히지만 SyncTest.myBank.minusMoney(1000);은 실행되지 않는다.
	}

}
