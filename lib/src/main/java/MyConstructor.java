public class MyConstructor {

	public MyConstructor() {
		System.out.println("Hello Constructor!");
	}

	public void hello() {
		System.out.println("Hello Java");
	}

	public static void main(String[] args) {

		// new MyConstructor();
		MyConstructor constructorObj = new MyConstructor();
		constructorObj.hello();
	}

}
