package priacticeinterface_inheritance;

public interface Sort {

	void ascending(int[] arr);
	void descending(int[] arr);
	
	//void description();  ===> 오답 
	default void description() {
		System.out.println("숫자를 정렬하는 알고리즘 입니다.");
	}
}
