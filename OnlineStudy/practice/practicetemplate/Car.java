package practicetemplate;

public abstract class Car {
	
	public abstract void turnOn();
	public abstract void start();
	public abstract void stop();
	public abstract void turnOff();
	
	final public void run() {
		turnOn();
		start();
		stop();
		turnOff();
	}
}
