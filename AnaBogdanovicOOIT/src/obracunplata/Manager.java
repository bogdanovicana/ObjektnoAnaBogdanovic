package obracunplata;

public class Manager {
	
	public Manager() {
		
	}
	public Manager(String name, int baseSalary) {
		super(name, baseSalary);
	}
	
	@Override
    public double calculateSalary() {
    	return super.calculateSalary() + 30000;
    }
}
