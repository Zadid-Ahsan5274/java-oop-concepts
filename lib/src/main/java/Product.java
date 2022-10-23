public class Product {

	int vat;

	public Product(int vat) {
		this.vat = vat;
	}

	public int getPrice(int price) {
		price += (price * vat / 100);
		return price;
	}

	public static void main(String[] args) {
		Product shirt = new Product(15);
		int price = shirt.getPrice(100);
		System.out.println(price);
	}
}
