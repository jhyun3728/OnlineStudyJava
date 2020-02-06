package classpart;

public class Student {
	
	//private은 이 클래스에서만 사용 가능 //외부참조 불가
	public int studentID;
	public String studentName;
	public String address;
	
	public Student(String name) {
		studentName = name;
	}
	
	public Student(int id, String name) {	//생성자 #클래스와 이름 같아야함	
		studentID = id;			//StudentTest에 있는 new Student();인 디폴트 생성자를 못쓰게 됨 따로 여기서 디폴트 생성자를 만들어 주지않는한 오류
		studentName = name;
		address = "주소 없음"; //들어오는 값이 없을 경우를 위해 초기값 설정
	}
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
}