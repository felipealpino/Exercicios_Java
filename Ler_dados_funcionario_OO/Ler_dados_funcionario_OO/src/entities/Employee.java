package entities;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return this.grossSalary - this.tax;
	}
	
	public void increaseSalary(double porcentage) {
		double mult;
		mult = 1 + (porcentage / 100);
		this.grossSalary *= mult;
	}
}
