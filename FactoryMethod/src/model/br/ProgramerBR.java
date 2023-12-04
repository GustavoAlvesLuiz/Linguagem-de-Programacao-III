package model.br;

import model.Employee;

public class ProgramerBR extends Employee {

	public ProgramerBR() {
		super("Programador Brasileiro");
	}
	
	@Override
	public double calculateSalary() {
		return 10000.20;
	}

}
