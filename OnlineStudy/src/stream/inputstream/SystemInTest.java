package stream.inputstream;

import java.io.IOException;

public class SystemInTest {

	public static void main(String[] args) {

		System.out.println("입력 : ");
		
		try {
			int i = System.in.read();	//read의 반환값은 int다 1byte씩 읽어들임.  ctrl 누르고 클릭해서 help들어가보면 나옴 
			System.out.println(i);
			System.out.println((char)i);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
