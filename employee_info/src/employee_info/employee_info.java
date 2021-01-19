package employee_info;
//Main file
class Employee{
	String name, year, address;
	public Employee(String na, String yr, String ad)
	{
		name = na;
		year = yr;
		address = ad;
		// System.out.println("Name     Year of joining       Address");
		System.out.println(name+" \t "+year+" \t\t "+address);
	}
	
}

public class employee_info {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Name     Year of joining       Address");
		Employee emp_1 = new Employee("Robert", "1994", "64C- WallsStreet");
		Employee emp_2 = new Employee("Sam", "2000", "68D- WallsStreet");
		Employee emp_3 = new Employee("John", "1999", "26B- WallsStreet");
	}

}
