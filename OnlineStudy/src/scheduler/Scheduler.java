package scheduler;

public interface Scheduler {

	public void getNextCall();
	public void sendCallToAgent();
	//인터페이스의 역할 : 모듈이 해야할 일을 정의해 둔 것이다.
}
