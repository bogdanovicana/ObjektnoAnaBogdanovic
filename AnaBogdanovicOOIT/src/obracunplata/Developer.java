package obracunplata;

public class Developer extends Employee{
	
	public Developer() {
		
	}
	public Developer(String name, int baseSalary) {
		super(name, baseSalary);
	}
	
	@Override
	public double calculateSalary() {
//   1.Nacin
		return baseSalary - baseSalary*0.1 - baseSalary*0.2 + baseSalary*0.2;
//   2.Nacin
		return super.calculateSalary() + baseSalary*0.2;
	}

}
