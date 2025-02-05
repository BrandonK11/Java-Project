//check if months is valid. If it is between 1 and 12
//check if day is within 1 to 31 and if feb is a leap year(day 29)
//make range for year and  check if valid

public class Date{
	private String hireDate;

	public Date(String hireDate){
		this.hireDate = hireDate;
		checkValidDate();
	}

	public void checkValidDate(){

		if(hireDate.length() != 10){
			throw new IllegalArgumentException("Invalid Date");
		}
			
		int month = Integer.parseInt(hireDate.substring(0, 2));
		int day = Integer.parseInt(hireDate.substring(3, 5));
		int year = Integer.parseInt(hireDate.substring(6, hireDate.length()));
	  
		
		if(month == 2 && day == 29){
			if(!isLeapYear(year)){
				throw new IllegalArgumentException("Invalid Date");
			}
		}
			
		if(month < 1 || month > 12){
			throw new IllegalArgumentException("Invalid Date");
		}  
		else if(day < 1 || day > 31){
			throw new IllegalArgumentException("Invalid Date");
		}
		else if(year < 1970 || year > 2077){
			throw new IllegalArgumentException("Invalid Date");
		}
	}

	public static boolean isLeapYear(int year){
		if((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0)){
			return true;
		}
		else{
			return false;
		}
	}

}
