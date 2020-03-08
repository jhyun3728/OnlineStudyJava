package stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest3 {

	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("input2.txt")) {
			int i;
			byte[] bs = new byte[10];
			while((i = fis.read(bs)) != -1) {	
				/*for(byte b : bs) {
					System.out.print((char)b);
				}
				*/ //이렇게하면 모든 배열에 값이 있는데 7개만 덮어쓰면 남은 3개는 전에 썼던 데이터가 버퍼에 남아있게된다. --> 가비지 --> 그래서 읽은 개수만큼 출력하게끔 해주자
																											//읽은 개수는 i에 저장이 된다.
				
				for(int k = 0; k < i; k++) {
					System.out.print((char)bs[k]);
				}
				System.out.println();
			}
			
		} catch (IOException e) {	
			e.printStackTrace();
		} 
	}

}
