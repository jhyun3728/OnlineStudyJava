package stream.others;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {

		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");  //rw는 read write 모드
		rf.writeInt(100);
		System.out.println(rf.getFilePointer());
		rf.writeDouble(3.4);
		rf.writeUTF("안녕하세요");
		
		rf.seek(0);	//밑에 int값을 넣기 위해 rf.readInt()를 대입하면 에러가 난다. LP판 처럼 rf가 Double, UTF로 옮겨졌기때문에 다시 처음으로 돌려줘야함 --->> .seek(0)
		//seek()를 통해서 특정 위치로 이동 가능하다. 
		
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
	}

}
