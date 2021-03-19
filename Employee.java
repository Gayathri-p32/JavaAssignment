package DemoPackage;

public class Employee {
	
	void details(String name,int year,String Address) {
		System.out.println(name+"\t\t"+year+"\t\t"+Address);
	}
	
	public static void main(String[] args) {
		System.out.println("Name\tYear of joining\t\tAddress");
		Employee e1 = new Employee();
		e1.details("Robert", 1994, "64C- WallsStreet");
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		e2.details("Sam", 2000, "68d- WallsStreet");
		e3.details("John", 1999, "26B- WallsStreet");
	}

}
