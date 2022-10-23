public class MyFood {

	public static void main(String[] args) {
		Food biriyani = new Biriyani();
		Food tehari = new Tehari();
		biriyani.cookFood();
		tehari.cookFood();
		/*
		 * Food food = new Food() {
		 * 
		 * @Override public void cookFood() {
		 * System.out.println("Food is being cooked!"); } }; food.cookFood();
		 */
	}

}

abstract class Food {

	abstract public void cookFood();

}

class Biriyani extends Food {

	@Override
	public void cookFood() {
		System.out.println("Biriyani is being cooked!");
	}
}

class Tehari extends Food {

	@Override
	public void cookFood() {
		System.out.println("Tehari is being cooked!");
	}
}