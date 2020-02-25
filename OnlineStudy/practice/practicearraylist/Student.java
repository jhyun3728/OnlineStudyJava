package practicearraylist;

import java.util.ArrayList;

public class Student {

	String studentName;
	
	ArrayList<Book> bookList;
	
	public Student(String studentName) {
		this.studentName = studentName;
		
		bookList = new ArrayList<Book>();
	}
	
	public void addBookList(String name) {
		Book book = new Book(name);
		
		bookList.add(book);
	}
	
	public void showBookInfo() {
		System.out.print(studentName + " 학생이 읽은 책은 : ");
		
		for(Book s : bookList) {
			System.out.print(s.getName() + " ");
		}
		
		System.out.println("입니다.");
	}
}
