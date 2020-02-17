package cooperation;

public class TakeTransTest {

	public static void main(String[] args) {

		Student studentJ = new Student("James", 5000);
		Student studentT = new Student("Tomas", 10000);
		Student studentA = new Student("Alex", 50000);
		
		
		Bus bus100 = new Bus(100);
		Subway subwayGreen = new Subway(2);
		Taxi taxi3728 = new Taxi(3728);
		
		studentJ.takeBus(bus100);
		studentT.takeSubway(subwayGreen);
		studentA.takeTaxi(taxi3728);
		
		studentJ.showInfo();
		studentT.showInfo();
		studentA.showInfo();
		
		bus100.showBusInfo();
		subwayGreen.showSubwayInfo();
		taxi3728.showTaxiInfo();
	}

}
