
public class MultipleInterface {
	public static void main(String[] args) {
		Child child = new Child();
		child.looksLike();
		child.behavior();
	}
}

interface Father {
	void looksLike();
}

interface Mother {
	void behavior();
}

class Child implements Father, Mother {

	@Override
	public void looksLike() {
		System.out.println("Looks like Father");
	}

	@Override
	public void behavior() {
		System.out.println("Behaves like Mother");
	}
}