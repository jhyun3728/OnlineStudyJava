package array;

public class BookArrayTest {

	public static void main(String[] args) {

		Book[] library= new Book[5]; //아직 책이 생긴건 아님 그냥 배열만 생긴거임 지금은 null값이 들어가 있음 //객체를 생성하면 객체의 주소가 들어감
		
		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");
		
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]); //객체의 주소 출력
			library[i].showBookInfo(); //객체의 내용 출력
		}
	}

}
