package generic;

public class GenericPrinterTest {

	public static void main(String[] args) {

		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();	//파우더 프린터를 만들고 싶으면 제네릭 부분<T>에 Powder를 넣으면 된다. 
												//new GenericPrinter<>();  --> 이렇게 제네릭 타입을 비워도 된다. (유추해서 실행됨)
		Powder powder = new Powder();
		powderPrinter.setMaterial(powder);	//재료를 넣어주자. powder가 프린터의 재료가 된다.
											//GenericPrinter 클래스 코드를 보면 new를 안해주므로 타입만 선언했다고 생기는것이 아님. 
											//여기서 new하고 set을 해줘야 재료가 들어감 
		System.out.println(powderPrinter);
		
		
		//Plastic 프린터를 만들때는 제네릭 타입만 Plastic으로 바꿔주면 된다.
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		Plastic plastic = new Plastic();
		plasticPrinter.setMaterial(plastic);
		System.out.println(plasticPrinter);
		
		//두개의 타입에 대한 인스턴스를 생성할때 자료형을 대입해서 다른 인스턴스를 생성할 수 있다. --> 제네릭 프로그래밍 
		
		/*
		GenericPrinter<Water> waterPrinter = new GenericPrinter<Water>(); //물로도 프린터를 만들 수 있게 되어버리므로 상위 클래스를 만들어준다.
											//상위 클래스 Material을 만들어 GenericPrinter 클래스의 제네릭 부분에 상속 시키게 함
											// --> 상속되지 않은 제네릭은 사용 못하게 됨    Ex) public class GenericPrinter<T extends Meterial> {}
											// 그 다음 쓸 재료의 클래스에 상위클래스를 상속시킨다. --> 그러면 상속받지 못한 클래스(Water)는 사용 불가 
											
		*/
		
		powderPrinter.printing();
		plasticPrinter.printing();
		
		
		GenericPrinter printer = new GenericPrinter(); //이렇게 안쓸 수 도 있는데 안쓰면 경고가 나옴  //안쓰면 Object로 취급
										//여러가지 타입을 쓰면 안쓸 수 도 있지만 왠만하면 다 씀 
	}

}
