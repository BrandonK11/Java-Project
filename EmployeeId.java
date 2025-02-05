public class EmployeeId{

	private String employeeNumber;

	
	public EmployeeId(String employeeNumber){
		this.employeeNumber = employeeNumber;
		checkValidId();
	}

	//Checks if employee number or id is valid
	public void checkValidId(){

		char[] id = employeeNumber.toCharArray();

		if(id.length != 5){
			throw new IllegalArgumentException("Invalid Id");
		}

		for(int i = 0; i <= 2; i++){
			if(!Character.isDigit(id[i])){
				throw new IllegalArgumentException("Invalid Id");
			}
		}

		if(id[3] != '-' || !Character.isLetter(id[4]) || id[4] > 'm' ){
			throw new IllegalArgumentException("Invalid Id");
		}
        
	}
}
