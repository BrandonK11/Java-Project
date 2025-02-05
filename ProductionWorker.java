public class ProductionWorker extends Employee{

	
	private int shift;
	private double hourlyPayRate;

	
	public ProductionWorker(int shift, double hourlyPayRate, String employeeName, String employeeNumber, String hireDate){
		super(employeeName, employeeNumber, hireDate);
		this.shift = shift;
		this.hourlyPayRate = hourlyPayRate;
		
	}

	
	public int getShift(){
		return shift;
	}
	public double getHourlyPayRate(){
		return hourlyPayRate;
	}
	public String getShiftTime(){
		return shift == 1 ? "Day" : "Night";
	}

	
	public void setShift(int shift){
		this.shift = shift;
	}
	public void setHourlyPayRate(double hourlyPayRate){
		this.hourlyPayRate = hourlyPayRate;
	}

	@Override
	public String toString(){
			return String.format("Employee Name: %s\nEmployee Number: %s\nHire Date: %s\nShift: %s\nHourlyPayRate: %.2f\n"
			, getEmployeeName(), getEmployeeNumber(), getHireDate(), getShiftTime(), hourlyPayRate);
	}
}
