
public class Bird {

	public void talk() {
		System.out.println("Birds can talk");
	}

	public void canFly() {
		System.out.println("Birds can fly");
	}

	public void fishing() {
		System.out.println("Birds can do fishing");
	}

	public static void main(String[] args) {
		Bird crow = new Bird();
		crow.talk();
		crow.canFly();

		Parrot parrot = new Parrot();
		parrot.talk();
		parrot.canSing();

		Bird penguin = new Penguin();
		penguin.fishing();
		penguin.canFly();
	}

}

class Crow extends Bird {

}

class Parrot extends Bird {

	@Override
	public void talk() {
		System.out.println("Parrot can talk");
	}

	public void canSing() {

	}
}

class Penguin extends Bird {
	@Override
	public void canFly() {
		System.out.println("Penguin can't fly");
	}
}
