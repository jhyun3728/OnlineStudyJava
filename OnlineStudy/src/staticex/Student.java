package staticex;

public class Student {

	private static int serialNum = 1000;
	private int studentID;
	public String studentName;
	public String address;
	
	public Student(String name) {
		studentName = name;
		serialNum++;
		studentID = serialNum;	//객체가 생성되면서 serialNum도 증가하므로 학번으로 사용 못하니까 학번 변수에 저장시켜줌
	}
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		address = "주소 없음";
		serialNum++;
		studentID = serialNum;	//객체가 생성되면서 serialNum도 증가하므로 학번으로 사용 못하니까 학번 변수에 저장시켜줌
	}
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public int getStudentID() {
		//serialNum++;  //오루 X static 변수는 프로그램이 로드되면서 생기는거여서 따로 생성 안해줘도 사용 가능함 //그래서 static 변수는 큰거 사용하면 안됨 첫 시작부터 메모리를 크게 먹음
		return studentID;
	}
										//static 메서드를 class 메서드라고도 함
	public static int getSerialNum() { //serialNum을 밖에서 못바꾸게 private으로 생성했으므로 밖에서 가져올수있도록 getter setter를 생성해줌
		int i = 0; //오류 X   //static 메서드가 호출되면서 생성되는 변수라서
	//	studentName = "Lee"; //오류 O -> static 변수는 인스턴스의 생성과 상관없이 사용 가능한데 인스턴스 변수는 인스턴스가 생성된 후에만 사용 가능
											//-> 인스턴스를 생성하지 않아서 인스턴스 변수가 생성되지 않았는데 static 메서드를 호출하면 에러가 남
		
		return serialNum;				//static 변수를 사용하기 위해 static 메서드를 사용함 (public static int )
	}

	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
}