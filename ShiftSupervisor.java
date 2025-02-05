public class ShiftSupervisor extends Employee{

	
	private double annualSalary;
	private double annualProductionBonus;

	//Constructor
	public ShiftSupervisor(double annualSalary, double annualProductionBonus, String employeeName, String employeeNumber, String hireDate){
		super(employeeName, employeeNumber, hireDate);
		this.annualSalary = annualSalary;
		this.annualProductionBonus = annualProductionBonus;
	}

	
	public double getAnnualSalary(){
		return annualSalary;
	}
	public double getAnnualProductionBonus(){
		return annualProductionBonus;
	}

	
	public void setAnnualSalary(double annualSalary){
		this.annualSalary = annualSalary;
	}
	public void setAnnualProductionBonus(double annualProductionBonus){
		this.annualProductionBonus = annualProductionBonus;
	}

	@Override
	public String toString(){
		return String.format("Employee Name: %s\nEmployee Number: %s\nHire Date: %s\nAnnual Salary: %.2f\nAnnual Production Bonus: %.2f\n"
			, getEmployeeName(), getEmployeeNumber(), getHireDate(), annualSalary, annualProductionBonus);
	}

	
}
