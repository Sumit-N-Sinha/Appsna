package corejavaassignm.assignment2.organization;

public class Organization {

	public static void main(String[] args) {

		Manager manager = new Manager(1, 20000, 1000);
		Labour labour = new Labour(2, 10000, 2000);

		System.out.println("Salary of manager "+manager.calculateSalary());

		System.out.println("Salary of labour "+labour.calculateSalary());

	}

}
