package stream.serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{ //Serializable은 추가 선언해줘야하는 메서드가 없다. --->> 마크 인터페이스 
	String name;
	transient String job; //transient는 '이 변수는 직렬화하지 마라'라는 뜻	--->> '소켓'같이 직렬화 할 수 없는 것들에 선언해주면 된다.
	
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString() {
		return name + "," + job;
	}
}

class Person222 implements Externalizable{	//Externalizable은 추가 선언해줘야하는 메서드가 있다.

	//직접 읽고 쓰는 것을 구현 할 수 있다. 
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
	}
	
}

public class SerializationTest {

	public static void main(String[] args) {

		Person personLee = new Person("이순신", "엔지니어");
		Person personKim = new Person("김유신", "선생님");
		
		try(FileOutputStream fos = new FileOutputStream("serial.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			
			oos.writeObject(personLee);
			oos.writeObject(personKim);
			
		} catch(IOException e) {	//java.io.NotSerializableException: stream.serialization.Person 이 떨어진다.
									//위에 Person class에 직렬화 가능하다고 써주지 않았기 떄문에 예외 발생함 --> 클래스에 implements Serializable 해준다. 
			System.out.println(e);
		}
		
		try(FileInputStream fis = new FileInputStream("serial.dat");
				ObjectInputStream ois = new ObjectInputStream(fis)){
			
			Person p1 = (Person)ois.readObject(); //.readObject()는 Object로 반환된다. Person으로 다운캐스팅 해준다. 
									//ois.readObject()에서 classNotFound 처리하라고하니까 밑에 catch를 하나 더 써서 classNotFoundException을 처리해준다.
			Person p2 = (Person)ois.readObject();
			
			System.out.println(p1); //file에 썼다가 그대로 읽어 들였다.
			System.out.println(p2); //변수에 transient를 쓰면 그 변수는 직렬화되지 않는다.********
			 
		}catch(IOException e) {
			System.out.println(e);
		}catch(ClassNotFoundException e) {
			System.out.println(e);
		}
	}

}
