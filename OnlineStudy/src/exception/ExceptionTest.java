package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {

	public static void main(String[] args) {

		FileInputStream fis = null;	//steam을 열면 무조건 닫아줘야한다. 
				
				try {
					fis = new FileInputStream("a.txt");
//					fis.close();	//정상적으로 작동했을 시 try에 구현 		//두가지에다가 다 써줘야하니까 어차피 실행되어야하면 finally에 한번만 쓰자
				} catch (FileNotFoundException e) {
					System.out.println(e);
//					fis.close();	//비정상적으로 죽었을 시 catch에 구현 		//두가지에다가 다 써줘야하니까 어차피 실행되어야하면 finally에 한번만 쓰자
					//return;
				} finally {
					try {
						fis.close(); //위에다가 하면 정상적일때랑 비정상적일때 두가지에다가 다 써줘야하니까 어차피 실행되어야하면 finally에 한번만 쓰자
						System.out.println("finally");
					} catch (IOException e) {
						System.out.println(e);
					}
				}
				System.out.println("end");
				
				System.out.println("===try-catch-recource===");
				
				try(FileInputStream fis2 = new FileInputStream("a.txt");) { //이렇게 try() 안에다 써줘야함 
				} catch (FileNotFoundException e) {		//AutoCloseable 덕분에 autoclose가 된다. 
					System.out.println(e);
				} catch (IOException e) {
					System.out.println(e);
				}

	}

}
