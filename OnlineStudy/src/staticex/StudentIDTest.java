package staticex;

public class StudentIDTest {

	public static void main(String[] args) {

		Student studentLee = new Student("Lee");
		System.out.println(Student.getSerialNum()); //studentLee.serialNum으로 하지 않는 이유 -> static 변수는 참조변소(studentLee)로 사용하지 않고 주로 class 이름으로 엑세스함 
												//인스턴스의 생성과는 상관없이 사용하는 변수 -> static 변수
		Student studentKim = new Student("Kim");
		
		System.out.println(Student.getSerialNum()); //serialNum을 밖에서 못바꾸게 private으로 생성했으므로 밖에서 가져올수있도록 getter setter를 생성해줌
		System.out.println(Student.getSerialNum()); //생성자가 호출될떄마다 1씩 늘어나므로 둘다 1002 //둘이 값이 같으므로 둘은 동일한 메모리를 공유하고있다
		
		
		System.out.println(studentLee.getStudentID());
		System.out.println(studentKim.getStudentID());
	}

}
