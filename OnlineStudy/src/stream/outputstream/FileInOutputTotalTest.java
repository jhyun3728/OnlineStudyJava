package stream.outputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInOutputTotalTest{

	public static void main(String[] args) {

		byte[] bs = new byte[26];
		byte data = 65;
		for(int i = 0; i < bs.length; i++) {
			bs[i] = data;
			data++;
		}
		
		try(FileOutputStream fos = new FileOutputStream("alpha.txt", true); //기본은 default인데 true로하면 계속 이어서 내용이 써진다. 
			FileInputStream fis = new FileInputStream("alpha.txt")){ 
			
			fos.write(bs);
			
			int ch;
			while((ch = fis.read()) != -1) {
				System.out.print((char)ch);
			}
			
		} catch(IOException e) {
			System.out.println(e);
		}
	}

}
 