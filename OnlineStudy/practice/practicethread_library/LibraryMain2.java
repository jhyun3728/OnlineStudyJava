package practicethread_library;

import java.util.ArrayList;

/***********학생이 6명이고 책이 3권인 상황  -->> 리소스는 한정적이고 리소스를 쓰려는 쓰레드는 넘치는 상황*************/
//책이 오면 연락하게끔 기다리는게 wait()이 될꺼고
//책이 왔어요!라고 알려주는게 notify()가 될것이다.

class FastLibrary2{
	public ArrayList<String> books = new ArrayList<String>();
	
	public FastLibrary2() {
		books.add("태백산맥 1");
		books.add("태백산맥 2");
		books.add("태백산맥 3");
	}
	
	public synchronized String lendBook() throws InterruptedException {

		Thread t = Thread.currentThread(); //어떤 쓰레드가 작동한건지 확인차 넣었음
		
		//리소스가 가능하지 않으면 못빌리게 하는것이 필요함
//		if(books.size() == 0) {
//			//return null;  //리소스가 없으면 null을 반환해주므로 학생들은 책을 못빌리고 끝남 
//			System.out.println(t.getName() + "waiting start");
//			wait(); 
//			System.out.println(t.getName() + "waiting end");
//		}
		
		//returnBook의 norifyAll이 모든 스레드를 깨우므로 책을 빌리지 못한 스레드는 while을 이용하여 다시 웨이팅에 빠트린다.
		while(books.size() == 0) {
			//return null;  //리소스가 없으면 null을 반환해주므로 학생들은 책을 못빌리고 끝남 
			System.out.println(t.getName() + "waiting start");
			wait();			
			System.out.println(t.getName() + "waiting end");
		}
		
		
		String title = books.remove(0);
		System.out.println(t.getName() + ":" + title + " lend");
		return title;
	}
	
	public synchronized void returnBook(String title) {
		Thread t = Thread.currentThread();
		
		//notify();
		notifyAll(); //notifyAll()은 모든 스레드가 깨어나는데 여기 문제는 하나만 반환하는데 모든 스레드가 깨어나게 된다. 
					 //그러므로 lendBook()에 while을 걸어 못빌린 스레드는 다시 웨이팅 상태로 빠트린다.
		
		books.add(title);
		System.out.println(t.getName() + ":" + title + " return");
	}
}

class Student2 extends Thread{
	
	public void run() {
		try {
			String title = LibraryMain2.Library.lendBook();
			if(title == null)
				return;	//리소스가 없으면 null을 반환해주므로 학생들은 책을 못빌리고 끝남
			sleep(5000);
			LibraryMain2.Library.returnBook(title);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class LibraryMain2 {

	public static FastLibrary2 Library = new FastLibrary2();
	
	public static void main(String[] args) {

		Student2 std1 = new Student2();
		Student2 std2 = new Student2();
		Student2 std3 = new Student2();
		Student2 std4 = new Student2();
		Student2 std5 = new Student2();
		Student2 std6 = new Student2();
		
		std1.start();
		std2.start();
		std3.start();
		std4.start();
		std5.start();
		std6.start();
	}

}