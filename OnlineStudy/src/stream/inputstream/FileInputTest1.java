package stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest1 {

	public static void main(String[] args) {

		FileInputStream fis = null;
		try {
			fis = new FileInputStream("input.txt");
			
			/*
			int i = fis.read();
			System.out.println((char)i);
			i = fis.read();
			System.out.println((char)i);
			i = fis.read();
			System.out.println((char)i);
			*/
			//while로 한번에 묶자
			int i;
			while((i = fis.read()) != -1) {	//파일을 다 읽으면 -1을 반환한다. //.read()여서 파일에 한글(2byte)가 있으면 한글이 깨짐
				System.out.print((char)i);
			}
			
		} catch (IOException e) {	//.read()를 사용하기 위해서 IOException을 써야하는데 하위에 FileNotFoundException이 있어서 IOException으로 합침
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("end");
	}

}
