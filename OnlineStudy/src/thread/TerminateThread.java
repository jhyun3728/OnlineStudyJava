package thread;

import java.io.IOException;

public class TerminateThread extends Thread{
	
	//Thread 종료 시키는 방법
	//stop은 거의 쓰지 않고 flag를 이용해서 종료한다.
	
	private boolean flag = false;  //대부분 flag 처리 함
	int i;
	
	public TerminateThread(String name) {
		super(name);	//쓰레드 컨스트럭터 중에 쓰레드 이름을 받을 수 있는것이 있다.
	}
	
	public void run() {
		while(!flag) {
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(getName() + " end"); 
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	public static void main(String[] args) throws IOException {

		TerminateThread threadA = new TerminateThread("A");
		TerminateThread threadB = new TerminateThread("B");
		
		threadA.start();
		threadB.start();
		
		int in;
		while(true) {
			in = System.in.read();
			if(in == 'A') {
				threadA.setFlag(true);
				
			}
			else if(in == 'B') {
				threadB.setFlag(true);
				
			}
			else if(in == 'M') {
				threadA.setFlag(true);
				threadB.setFlag(true);
				break;
			}
//			else {
//				System.out.println("try again"); // \n \r 이 여기에 걸리면서 두번 출력이 된다.
//			}
		}
		System.out.println("main end");
		
	}

}
