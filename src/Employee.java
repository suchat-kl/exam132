
public class Employee {
	private String firstName, lastName, position;
	private int salary;

	public static void main(String[] args) {
		Employee emp1 = new Employee("FistName1", "LastName1", "CEO", 5000);
		Employee emp2 = new Employee("FistName2", "LastName2", "CEO2", 5000);
		emp1.checkPosition();
		emp2.getFullName();
	}

	public void getFullName() {
		System.out.println("I am " + this.getFirstName() + "  " + this.getLastName());
	}

	public void checkPosition() {
		System.out.println("My position is :" + this.position);
	}

	public Employee(String firstName, String lastName) {

		this(firstName, lastName, "unknow", 0);
	}

	public Employee(String firstName, String lastName, String position, int salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.position = position;
		this.salary = salary;
	}

	public void hello() {
		System.out.println("Hello.." + this.firstName);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getSalary() {
		return salary;
	}

//	public void setSalary(int salary) {
//		this.salary = salary;
//	}

}
