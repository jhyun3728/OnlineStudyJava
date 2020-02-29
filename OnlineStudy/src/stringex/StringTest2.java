package stringex;

public class StringTest2 {

	public static void main(String[] args) {

		String java = new String("java");
		String android = new String("android");
		System.out.println(System.identityHashCode(java));
		
		java = java.concat(android);
		System.out.println(java);
		
		System.out.println(System.identityHashCode(java)); //새로운 메모리에 연결되었음 
	}

}
