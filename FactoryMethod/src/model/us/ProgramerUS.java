package model.us;

import model.Employee;

public class ProgramerUS extends Employee{

	public ProgramerUS() {
		super("Programador Americano");
	}
	
	@Override
	public double calculateSalary() {
		return 7500.20;
	}

}
