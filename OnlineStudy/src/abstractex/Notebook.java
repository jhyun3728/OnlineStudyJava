package abstractex;

public abstract class Notebook extends Computer{	//typing만 구현한다면 이 클래스는 abstract(추상) 클래스가 되어야 한다.

	@Override
	public void typing() {

		System.out.println("Notebook typing");
	}

}
