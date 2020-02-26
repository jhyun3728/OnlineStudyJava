package interfaceex4_bookshelf;

import java.util.ArrayList;

public class Shelf {

	protected ArrayList<String> shelf;
	
	public Shelf() {	//ArrayList를 컨스트럭터에서 많이 만들기도 함 
		shelf = new ArrayList<String>();
	}
	
	public ArrayList<String> getShelf() {
		return shelf;
	}
	
	public int getCount() {
		return shelf.size();
	}
}
