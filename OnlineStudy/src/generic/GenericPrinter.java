package generic;

public class GenericPrinter<T extends Material> {	

	private T material;		//이 프린터를 쓸때 재료를 정하자는 의미
							//나중에 클래스가 생성될때  T타입에 적용될 것이다 어떤 재료가 될것인지
	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	public String toString() {
		return material.toString();
	}
	
	public void printing() {
		material.doPrinting();
	}
	
	
}
