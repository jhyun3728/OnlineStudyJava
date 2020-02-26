package interfaceex3_inheritance;

public interface MyInterface extends X, Y{	//인터페이스간에도 상속 가능 
											//MyInterface는 X타입이기도하고 Y타입이기도 하다 (type inheritance)
	void myMethod();
}
