package obracunplata;

public class Employee {
	
	protected String name;
	protected double baseSalary;
	
	public int calculateSalary() {
		return baseSalary-(baseSalary*0.1)-(baseSalary*0.2);
	}
	
	public Employee() {
		
	}
	
	public Employee(String name, int baseSalary) {
	this.name = name;
	this.baseSalary = baseSalary;
	}
	
	public String getName() {
	  return name;
	}
	public double BaseSalary() {
		return baseSalary;
	}
	public void setName(String name) {
	    this.name = name;
	}
	public void setBaseSalary(int baseSalary) {
		this.baseSalary=baseSalary;
	}
}
