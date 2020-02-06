package basic;

public class explicitConversion {

	public static void main(String[] args) {
		int i = 1000;
		byte bNum = (byte)i;
		System.out.println(bNum);
		
		double dNum1 = 1.2;
		float fNum = 0.9f;
		
		int iNum1 = (int)dNum1 + (int)fNum;
		int iNum2 = (int)(dNum1 + fNum);
		//형변환 방법 차이로 iNum1과 iNum2은 다른 결과 
		
		System.out.println(iNum1);
		System.out.println(iNum2);
	}

}
