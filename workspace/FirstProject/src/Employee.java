
public class Employee {
	
	// Fields
	int id;
	String name;
	double salary;
	
	void incrementSalary(){
		salary = salary + (salary * 0.1);
	}
	
	public static void main(String[] args) {
//		Create an object
		Employee emp = new Employee();
		emp.salary = 10000;
		System.out.println(emp.salary);
		emp.incrementSalary();
		System.out.println(emp.salary);
	}

}
