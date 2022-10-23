
public class Animal {

	public void canRun() {
		System.out.println("Animal can run");
	}

	public static void main(String[] args) {
		Human human = new Human();
		human.canRun();
	}
}

class Human extends Animal {

}
