public class TeamLeader extends ProductionWorker{

	
	private double monthlyBonus;
	private int trainingHoursRequired;
	private int trainingHoursAttended;

	
	public TeamLeader(double monthlyBonus, int trainingHoursRequired, int trainingHoursAttended, int shift, double hourlyPayRate, String employeeName, String employeeNumber, String hireDate){
		super(shift, hourlyPayRate, employeeName, employeeNumber, hireDate);
		this.monthlyBonus = monthlyBonus;
		this.trainingHoursRequired = trainingHoursRequired;
		this.trainingHoursAttended = trainingHoursAttended;
	}

	
	public double getMonthlyBonus(){
		return monthlyBonus;
	}
	public int getTrainingHoursRequired(){
		return trainingHoursRequired;
	}
	public int getTrainingHoursAttended(){
		return trainingHoursAttended;
	}

	
	public void setMonthlyBonus(double monthlyBonus){
		this.monthlyBonus = monthlyBonus;
	}
	public void setTrainingHoursRequired(int trainingHoursRequired){
		this.trainingHoursRequired = trainingHoursRequired;
	}
	public void setTrainingHoursAttended(int trainingHoursAttended){
		this.trainingHoursAttended = trainingHoursAttended;
	}

	@Override
	public String toString(){
		return String.format("Employee Name: %s\nEmployee Number: %s\nHire Date: %s\nShift: %s\nHourly Pay Rate: %.2f\nMonthly Bonus: %.2f\nRequired Training Hours: %d\nTraining Hours Attended: %d\n"
			, getEmployeeName(), getEmployeeNumber(), getHireDate(), getShiftTime(), getHourlyPayRate(), monthlyBonus, trainingHoursRequired, trainingHoursAttended);
	}


}
