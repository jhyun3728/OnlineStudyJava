package array;

public class ObjectCopy {

	public static void main(String[] args) {

		Book[] library= new Book[5]; //아직 책이 생긴건 아님 그냥 배열만 생긴거임 지금은 null값이 들어가 있음 //객체를 생성하면 객체의 주소가 들어감
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");
		
		System.out.println("arraycopy를 이용한 얕은 복사 -> 주소를 복사하므로 하나의 배열에 내용을 바꾸면 다른 배열의 내용도 바뀜");
		System.arraycopy(library, 0, copyLibrary, 0, 5);
		
		for(Book book : copyLibrary) { //향상된 for문 ex) for(변수 : 배열) //어떤 객체(Book)의 변수(book)를 선언하여 어떤 엘리멘트(copyLibrary)를 꺼내올 것인가
			book.showBookInfo();
		}
	
		System.out.println("---Library---");
		
		library[0].setTitle("나목");
		library[0].setAuthor("박완서");
		
		for(Book book : library) {
			book.showBookInfo();
		}
		
		System.out.println("---copyLibrary---");
		
		for(Book book : copyLibrary) {
			book.showBookInfo();
		}
		
		//library[0]만 바꿨는데 copyLibrary[0]까지 바뀐 이유 : arraycopy는 주소를 복사하는 것이여서 같은 주소를 쓰게 됨 고래서 하나를 바꾸면 둘다 내용이 바뀜
		
		
		/*****************************************************************/
		System.out.println();
		System.out.println("****************arraycopy말고 내용을 복사하는 방법*********************");
		System.out.println();
		System.out.println("for를 이용한 깊은 복사 -> 주소를 복사하지 않고 배열의 내용을 하나하나 직접 넣어주므로 배열의 내용을 바꾸더라도 다른 배열에 영향 X");
		System.out.println();
		
		Book[] library2 = new Book[5]; 
		Book[] copyLibrary2 = new Book[5];
		
		library2[0] = new Book("태백산맥1", "조정래");
		library2[1] = new Book("태백산맥2", "조정래");
		library2[2] = new Book("태백산맥3", "조정래");
		library2[3] = new Book("태백산맥4", "조정래");
		library2[4] = new Book("태백산맥5", "조정래");
		
		copyLibrary2[0] = new Book();
		copyLibrary2[1] = new Book();
		copyLibrary2[2] = new Book();
		copyLibrary2[3] = new Book();
		copyLibrary2[4] = new Book();
		
		for(int i = 0; i < library2.length; i++) { //0부터 시작해야하므로 향상된 for문을 사용하지 않는다.
			copyLibrary2[i].setTitle(library2[i].getTitle());
			copyLibrary2[i].setAuthor(library2[i].getAuthor());
		}
		
		System.out.println("---Library2---");
		
		library2[0].setTitle("나목");
		library2[0].setAuthor("박완서");
		
		for(Book book : library2) {
			book.showBookInfo();
		}
		
		System.out.println("---copyLibrary2---");
		
		for(Book book : copyLibrary2) {
			book.showBookInfo();
		}
		
	}
}