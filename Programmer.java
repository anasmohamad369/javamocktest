package test;

public class Programmer extends Employee 
{	
	private static double salary;
	int addons =  500;
	@Override
	void calcullatesalary(Double salary) {
			Programmer.salary = salary+ addons;
			System.out.println(Programmer.salary);
	}

}
