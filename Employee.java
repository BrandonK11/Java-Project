public class Employee {

	
	private String employeeName;
	private String employeeNumber;
	private String hireDate;

	
	public Employee(String employeeName, String employeeNumber, String hireDate){
		this.employeeName = employeeName;
		this.employeeNumber= employeeNumber;
		this.hireDate = hireDate;
	}

	
	public String getEmployeeName(){
		return employeeName;
	}
	public String getEmployeeNumber(){
		return employeeNumber;
	}
	public String getHireDate(){
		return hireDate;
	}

	
	public void setEmployeeName(String employeeName){
		this.employeeName = employeeName;
	}
	public void setEmployeeNumber(String employeeNumber){
		this.employeeNumber = employeeNumber;
	}
	public void setHireDate(String hireDate){
		this.hireDate = hireDate;
	}

}
