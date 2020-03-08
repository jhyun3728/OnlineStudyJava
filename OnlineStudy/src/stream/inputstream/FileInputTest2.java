package stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest2 {

	public static void main(String[] args) {
		
		//try()안에서 리소스 오픈하는 방법    훨씬 깔끔함
		///AutoCloseable이 있으므로 finally를 안써도 된다.
		
		try(FileInputStream fis = new FileInputStream("input.txt")) {
			int i;
			while((i = fis.read()) != -1) {	
				System.out.print((char)i);
			}
			
		} catch (IOException e) {	
			e.printStackTrace();
		} 
		System.out.println("end");
	}

}
