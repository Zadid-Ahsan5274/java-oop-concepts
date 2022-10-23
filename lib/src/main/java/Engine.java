public interface Engine {

	void startEngine();

}

class Motorbike implements Engine {

	@Override
	public void startEngine() {
		System.out.println("Motorbike has been started");
	}

}

class Car implements Engine {

	@Override
	public void startEngine() {
		System.out.println("Car has been started");
	}

}

class MyEngine {
	public static void main(String[] args) {
		Motorbike motorbike = new Motorbike();
		motorbike.startEngine();
		Car toyota = new Car();
		toyota.startEngine();
	}
}