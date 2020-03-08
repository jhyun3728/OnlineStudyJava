package stream.reader;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReaderTest {

	public static void main(String[] args) throws IOException {

		FileReader fis = new FileReader("reader.txt"); //문자열 읽을때는 FileReader로 읽으면 된다.
		
		int i;
		while((i = fis.read()) != -1) {
			System.out.print((char)i);
		}
		
		fis.close();
		
		System.out.println("\n");
		
		FileInputStream fis2 = new FileInputStream("reader.txt");	//byte단위로 읽음 
		InputStreamReader isr = new InputStreamReader(fis2); //바이트 단위로 읽었는데 Reader로 변환해야한다면 보조스트림인 InputStreamReader로 감싸면 된다. 
		
		int k;
		while((k = isr.read()) != -1) {
			System.out.print((char)k);
		}
		
		isr.close();	//close()는 보조스트림을 close하면 안에 있는 스트림까지 close()된다. 
		
		//Ex) 소켓   --> 소켓에서는 무조건 바이트 단위로 읽기 떄문에 그런 상황에서 쓰면 된다. 
		
	}

}
