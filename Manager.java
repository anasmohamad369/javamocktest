package test;

public class Manager extends Employee {
	private static Double salary;
	int addons = 50000;
	int pf = 2000;

	@Override
	void calcullatesalary(Double salary) 
	{
	     	Manager.salary = salary + pf + addons; // Assigning to the class's static variable
	     	System.out.println(Manager.salary); // Using the static salary variable
	}
}
