package view;

import model.Employee;
import model.EmployeeFactory;
import model.EmployeeType;

public class Main {

	public static void main(String[] args) {
		Employee e = EmployeeFactory.createEmployee(EmployeeType.TECLEADER, 
				"Emerson", 2000, 5, 8, 0);
		
		System.out.println(e);
	}

}
