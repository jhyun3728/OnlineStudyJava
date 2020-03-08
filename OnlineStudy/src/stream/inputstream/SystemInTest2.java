 package stream.inputstream;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest2 {

	public static void main(String[] args) {

		System.out.println("입력 후 '끝'이라고 쓰세요");
		
		try {
			int i;													//byte 단위로 자료를 읽어들일떄 이를 문자로 바꿔주는 스트림 --> InputStreamReader
			InputStreamReader isr = new InputStreamReader(System.in); //InputStreamReader() 안에는 스트림이 들어와야한다. 
																		//이런 InputStreamReader 같은걸 보고 보조스트림이라고 한다.
			while((i = isr.read()) != '끝') { //한글은 2byte여서 1byte씩 읽는 read로는 인식 못함  --> String으로 바꿔주는 스트림을 사용해야함 (InputStreamReader) 
						//이때는 읽어들일때도 System.in으로 읽어들이지 않고 보조스트림 isr. 으로 읽어 들인다. 
				System.out.print((char)i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
 