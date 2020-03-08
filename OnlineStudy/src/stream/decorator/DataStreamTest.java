package stream.decorator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {

	public static void main(String[] args) {
		
		//DataInputStream , DataOutputStream은 실제로 데이터를 읽어오는 보조 스트림이다. 
		//자바에서 보조 스트림 많이 쓰인다.	//다른 구조를 또 감싸고 또 감싸는 구조를 잘 익혀두자************

		try(FileOutputStream fos = new FileOutputStream("data.txt");
				DataOutputStream dos = new DataOutputStream(fos);
				FileInputStream fis = new FileInputStream("data.txt");
				DataInputStream dis = new DataInputStream(fis)){
			
			dos.writeByte(100);
			dos.write(100);
			dos.writeChar('A');
			dos.writeUTF("안녕하세요");
			
			//읽을 떄 주의할 점 --->>>> 쓴 '그대로' 읽어야한다.
			System.out.println(dis.readByte()); //read만 해서 byte를 읽으면 1byte씩 읽고 readByte하면 거기에 맞는? 바이트를 읽는다. 
			System.out.println(dis.read());								//자세한건 .read치면 나오는 창에서 API 설명 읽어보기
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
			
		} catch(IOException e) {
			
		}
	}

}
