package practicethread_library;

import java.util.ArrayList;

class FastLibrary{
	public ArrayList<String> books = new ArrayList<String>();
	
	public FastLibrary() {
		books.add("태백산맥 1");
		books.add("태백산맥 2");
		books.add("태백산맥 3");
		books.add("태백산맥 4");
		books.add("태백산맥 5");
		books.add("태백산맥 6");
	}
	
	public synchronized String lendBook() {
		
		Thread t = Thread.currentThread(); //어떤 쓰레드가 작동한건지 확인차 넣었음
		
		String title = books.remove(0);
		System.out.println(t.getName() + ":" + title + " lend");
		return title;
	}
	
	public synchronized void returnBook(String title) {
		Thread t = Thread.currentThread();
		
		books.add(title);
		System.out.println(t.getName() + ":" + title + " return");
	}
}

class Student extends Thread{
	
	public void run() {
		try {
			String title = LibraryMain.Library.lendBook();
			sleep(5000);
			LibraryMain.Library.returnBook(title);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class LibraryMain {

	public static FastLibrary Library = new FastLibrary();
	
	public static void main(String[] args) {

		Student std1 = new Student();
		Student std2 = new Student();
		Student std3 = new Student();
		
		std1.start();
		std2.start();
		std3.start();
	}

}
