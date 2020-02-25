package practicearraylist;

public class StudentTest {

	public static void main(String[] args) {

		Student Lee = new Student("Lee");
		Lee.addBookList("태백산맥1");
		Lee.addBookList("태백산맥2");
		
		Student Kim = new Student("Kim");
		Kim.addBookList("토지1");
		Kim.addBookList("토지2");
		Kim.addBookList("토지3");
		
		Student Cho = new Student("Cho");
		Cho.addBookList("해리포터1");
		Cho.addBookList("해리포터2");
		Cho.addBookList("해리포터3");
		Cho.addBookList("해리포터4");
		Cho.addBookList("해리포터5");
		Cho.addBookList("해리포터6");
		
		Lee.showBookInfo();
		System.out.println();
		Kim.showBookInfo();
		System.out.println();
		Cho.showBookInfo();
		
	}

}
