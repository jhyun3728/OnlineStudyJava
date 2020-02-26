package interfaceex4_bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {

		Queue bookQueue = new BookShelf(); //타입은 Shelf 타입을 해도 되고   기능적인걸 우선한다면 인터페이스 타입으로 많이 선언함
		bookQueue.enQueue("태백산맥1");
		bookQueue.enQueue("태백산맥2");
		bookQueue.enQueue("태백산맥3");
		
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
	}

}
