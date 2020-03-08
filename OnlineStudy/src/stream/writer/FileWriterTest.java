package stream.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) throws IOException {

		//문자단위의 입출력에 가장 상위 클래스는 writer, reader 이고 그 하위 클래스로 FileReader, FileWriter가 있다.
		
		//FileWriter(byte 단위)를 FileOutputWriter 스트림으로 감쌀 수 있다.
		
		FileWriter fw = new FileWriter("writer.txt");
		fw.write('A');
		char[] buf = {'B', 'C', 'D', 'E', 'F'};
		
		fw.write(buf);;
		fw.write("안녕하세요");
		fw.write(buf, 2, 2);   //buf의 인덱스 2부터 2개 write 한다. 
		fw.close();
		
		System.out.println("end");
	
	}

}
