//
// Name: Karimi,Brandon
// Project: 6
// Due:
// Course: cs-1400-05-f24
//
// Description: This program manages employees based on salary, id, and date hired
//
//
public class CompanyApp {
	public static void main(String[] args) throws Exception{

        
		
        
		ProductionWorker worker = new ProductionWorker(1, 20.75, "Joe", "001-h", "02-31-2017");
        new EmployeeId(worker.getEmployeeNumber());
		new Date(worker.getHireDate());
		System.out.println(worker);


			
		System.out.println("Shift Supervisor:");
		ShiftSupervisor supervisor = new ShiftSupervisor(102175.51244, 5000.2234243, "Bob", "222-b", "09-11-2001");		
		new EmployeeId(supervisor.getEmployeeNumber());
		new Date(supervisor.getHireDate());
		System.out.println(supervisor);

	
		System.out.println("Team Leader:");
		TeamLeader leader = new TeamLeader(1000.2342, 10, 5, 2, 25.23, "Trevor Rainbolt", "332-m", "02-29-2024");
		new EmployeeId(leader.getEmployeeNumber());
		new Date(leader.getHireDate());
		System.out.println(leader);
		
	}
	
}
