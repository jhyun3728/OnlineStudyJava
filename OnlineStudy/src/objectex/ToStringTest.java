package objectex;

class Book{
	String title;
	String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
}

class Book2 extends Book implements Cloneable{	//Book2 클래스는 복제가능하다는 의미 

	public Book2(String title, String author) {
		super(title, author);
	}

	@Override
	public String toString() {
		return author + ", " + title;
	}

	//이 클래스에 implements 해야되는게 없어서 밑에 clone 오버라이딩은 현재 딱히 필요하지 않음
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone(); //인스턴스의 값을 그대로 복제  //딱히 더 안거드려도 됨
	}

	@Override
	protected void finalize() throws Throwable { //이 메서드는 직접 불리는 메서드가 아니고 인스턴스가 힙메모리에서 해제될 때 가비지 콜렉터에서 호출되는 메서드 
												//이게 정의되어 있으면 가비지 콜렉터에서 이 부분을 수행한다
												//주로 하는 일 : 리소스 해제, 혹시 안닫혔을 소켓을 닫는 일 등
		super.finalize();
	}
	
	
	
	
}

public class ToStringTest {

	public static void main(String[] args) throws CloneNotSupportedException {

		Book book = new Book("토지", "박경리");
		System.out.println(book);	//objectex.Book@35f983a6 이 나옴. but Book 클래스 안에 String 클래스의 toString()을 오버라이드하면 제목과 저자를 출력 가능 
		
		String str = new String("해리포터");
		System.out.println(str);	//인스턴스 변수의 주소가 나오지 않고 문자열이 나옴  //System.out.println(str.toString());과 같다 
									//String 클래스 안에 이미 toString()이라는 메서드가 정의되어 있어서 
		
		Book2 book2 = new Book2("신의탑", "SIU");
		System.out.println(book2);
		
		System.out.println();
		System.out.println("=====clone() ex=====");
		System.out.println();
		
		Book2 book3 = (Book2)book2.clone();
		System.out.println(book3); //에러 남 cloneable 하지 않는데 clone해서 에러 
									//이 클래스가 clone이라는 메서드를 사용하려면 Book2 클래스에 implements Cloneable이라고 명시해줘야함 
									//clone 메서드만 오버라이딩한다고 쓸 수 있지는 않음 Cloneable 인터페이스를 명시해줘야
	}						

}
