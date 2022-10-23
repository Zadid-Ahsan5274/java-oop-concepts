
public class Employee {

	int overtime;
	int overtimeRate;

	public Employee() {

	}

	public Employee(int overtime, int overtimeRate) {
		this.overtime = overtime;
		this.overtimeRate = overtimeRate;
	}

	public int getSalary(int hour, int rate) {
		return hour * rate;
	}

	public int getSalary(int hour, int rate, int overtime, int overtimeRate) {
		return (hour * rate) + (overtime * overtimeRate);
	}

	public static void main(String[] args) {
		Employee rahim = new Employee(2, 250);
		// int salary = rahim.getSalary(10, 200);
		int salary = rahim.getSalary(10, 200, rahim.overtime, rahim.overtimeRate);
		System.out.println(salary);
	}

}
