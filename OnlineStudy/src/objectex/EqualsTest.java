package objectex;

class Student {
	int studentNum;
	String studentName;
	
	public Student(int studentNum, String studentName) {
		this.studentName = studentName;
		this.studentNum = studentNum;
	}
}

class Student2 extends Student{

	public Student2(int studentNum, String studentName) {
		super(studentNum, studentName);
	}
	
	
	@Override	//같은 객체의 논리적인 동의성 구현 
	public boolean equals(Object obj) { //equals()에서 Object로 넘어오는거라서 업캐스팅이 된다.  --> 다시 다운캐스팅 해주자 ( if(obj instanceof Student)  )
		if( obj instanceof Student2) {
			Student2 std = (Student2)obj;
			//방법 1 -> return (this.studentNum == std.studentNum);
			//방법 2			//난 방법 1이 더 깔끔한 듯 
			if(this.studentNum == std.studentNum)
				return true;
			else return false;
		}
		return false;
	}

	@Override	//두개의 객체가 같다라고 했을때 두개의 객체가 반환하는 해쉬코드의 값도 동일하게끔 오버라이딩 해준다.
	public int hashCode() {	//두 studentNum이 같으면 같은거니까 studentNum 변수를 이용하면 된다.   //주로 equals에 썼는 멤버(studentNum)를 활용하면 된다.
		return studentNum;
	}
	
}

public class EqualsTest {

	public static void main(String[] args) {

		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2); //==는 equals()의 원형 //두개의 메모기가 같은지 비교 
		System.out.println(str1.equals(str2)); //str1.equals(str2)는 두개의 문자열이 같은가를 비교 
		
		System.out.println();
		System.out.println("================");
		System.out.println();
		
		Student Lee = new Student(100, "이순신");
		Student Lee2 = Lee;
		Student Shin = new Student(100, "이순신");
		
		System.out.println(Lee == Lee2);
		System.out.println(Lee == Shin);
		System.out.println(Lee.equals(Shin)); //논리적으로 같은데 false가 뜬다. 재정의를 해주자.
		
		
		//객체가 같다는 의미는 같은 hashCode() 값을 같는다는 뜻 
		//해쉬코드 값 : 인스턴스를 생성했을때 주어지는 주소 값 
		
		System.out.println(Lee.hashCode());
		System.out.println(Shin.hashCode()); //이거는 다르게 나옴 //동일한 객체는 같음 그렇다고 실제 메모리 값이 같다는 것은 아님 
															//일반적으로 equals를 오버라이딩하면 hashcode도 같이 오버라이딩 함 
		
		System.out.println();
		System.out.println("=====equals()와 hashCode()를 오버라이딩======");
		System.out.println();
		
		Student2 Kim = new Student2(200, "김지혜");
		Student2 Kim2 = Kim;
		Student2 Ji = new Student2(200, "김지혜");
		
		System.out.println(Kim == Kim2);
		System.out.println(Kim == Ji);
		System.out.println(Kim.equals(Ji));
		
		System.out.println(Kim.hashCode());
		System.out.println(Ji.hashCode());
		
		System.out.println();
		System.out.println("=====Ingefer ex======");
		System.out.println();
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1.equals(i2));
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		
		
		System.out.println("====실제 메모리 값====");
		System.out.println(System.identityHashCode(i1));
		System.out.println(System.identityHashCode(i2));
		
	}

}
