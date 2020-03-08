package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputTest1 {

	public static void main(String[] args) {

		
		try(FileOutputStream fos = new FileOutputStream("output.txt", true)){ //기본은 default인데 true로하면 계속 이어서 내용이 써진다. 
			
			fos.write(65); //숫자로 썼는데 output.txt에는 해당하는 문자('A')로 찍힌다. 
			fos.write(66);
			fos.write(67);
			
		} catch(IOException e) {
			System.out.println(e);
		}
	}

}
 