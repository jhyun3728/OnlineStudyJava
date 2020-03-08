package stream.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class FileCopy {

	public static void main(String[] args) throws IOException {
		
		long milliseconds = 0;
		
		/*  1byte씩 읽어 들여서 Write하는 방법이라 오래 걸린다. (cpu도 열일해서 팬 풀로 돌려도 100도 찍네 ㅎㄷㄷ)
		try(FileInputStream fis = new FileInputStream("a.zip");
				FileOutputStream fos = new FileOutputStream("copy.zip")){
			
			milliseconds = System.currentTimeMillis();	//현재 시간 저장
			
			int i;
			while((i = fis.read()) != -1) { //End of File 까지 읽는다.  //1byte씩 읽어 들여서 write한다. (copy)
				fos.write(i);
			}
			*/
		try(FileInputStream fis = new FileInputStream("a.zip");
				FileOutputStream fos = new FileOutputStream("copy.zip");
				//Buffer 입출력스트림으로 감싸자 //훨씬 빨라진다 근데 내 맥북으로는 똑같네 ㅅㅂ 
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos)){
			
			milliseconds = System.currentTimeMillis();	//현재 시간 저장
			
			int i;
			while((i = fis.read()) != -1) { //End of File 까지 읽는다.  //1byte씩 읽어 들여서 write한다. (copy)
				fos.write(i);
			}
		
			milliseconds = System.currentTimeMillis() - milliseconds; //다시 현재 시간 - 이전 시간
			
		} catch(IOException e) {
			System.out.println(e);
		}
		
		
		//보조 스트림은 기반 스트림만 감싸는게 아니라 또다른 보조 스트림도 감싼다.

		Socket socket = new Socket();
		
	//	InputStreamReader isr = new InputStreamReader(socket.getInputStream())	//socket 안에있는 바이트 단위를 문자단위로 읽을 수 있다. 
		
		BufferedReader isr = new BufferedReader(new InputStreamReader(socket.getInputStream()));  //이렇게 감싸면 읽을때 위의 기능에 버퍼링 기능까지 쓸 수 있다.
		isr.readLine(); //BufferedReader에는 .readLine()이라는 기능이 있는데 한 문장씩 읽어들이는 좋은 메서드다.
		
		System.out.println("시간 : " + milliseconds);
	}

}