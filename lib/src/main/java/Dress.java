
public class Dress {

	private String brand;
	private String color;
	private String size;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public static void main(String[] args) {
		Shirt shirt1 = new Shirt();
		shirt1.setBrand("Ezze");
		int price = shirt1.getPrice(1, 1200);
		System.out.println(shirt1.getBrand());
		System.out.println(price);

		Shirt shirt2 = new Shirt();
		shirt2.setBrand("Richman");
		int price2 = shirt2.getPrice(1, 1500);
		System.out.println(shirt2.getBrand());
		System.out.println(price2);
	}

}

class Shirt extends Dress {

	public int getPrice(int qty, int price) {
		return qty * price;
	}

}