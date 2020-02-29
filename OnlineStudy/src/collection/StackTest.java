package collection;

import java.util.ArrayList;

class MyStack {
	
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) {
		arrayStack.add(data);
	}
	
	public String pop() {
		int len = arrayStack.size();
		if(len == 0) {
			System.out.println("Stack이 비었습니다.");
			return null;
		}
		return arrayStack.remove(len-1);  //size()는 1부터 시작이고 Stack의 인덱스는 0부터 시작이므로 len-1을 반환해준다.
	}
}

public class StackTest {
	
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}