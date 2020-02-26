package interfaceex4_bookshelf;

public class BookShelf extends Shelf implements Queue{  //Shelf를 상속받고 Queue 인터페이스를 사용하는 BookShelf 클래스 

	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}

	@Override
	public String deQueue() {
		return shelf.remove(0); //Queue는 첫번째로 들어온게 나가는 자료구조이므로 remove에는 인덱스 0이 들어간다.
	}

	@Override
	public int getSize() {
		return getCount();	//shelf는 arraylist니까 메서드 자체인 getCount()를 호출하면 된다. //super.getCount();해도 된다.
	}

	
}
