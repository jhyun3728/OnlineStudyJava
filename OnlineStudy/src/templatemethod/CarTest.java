package templatemethod;

public class CarTest {

	public static void main(String[] args) {
		
		Car aiCar = new AICar();
		aiCar.run();
		
		System.out.println("=======================");
		
		Car manualCar = new ManualCar();
		manualCar.run();  //시나리오/로직의 흐름대로 출력
	}

}
