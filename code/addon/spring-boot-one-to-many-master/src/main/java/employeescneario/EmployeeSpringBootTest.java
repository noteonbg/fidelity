package employeescneario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import employeescneario.model.Employee;
import employeescneario.model.EmployeeStatus;
import employeescneario.service.EmployeeService;

@SpringBootApplication
public class EmployeeSpringBootTest //implements CommandLineRunner
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(EmployeeSpringBootTest.class, args);
		
	}
	
	
	
	
	
	
	


	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Employee updatedEmployee =new Employee(1,"delhi","abc",23);
		 EmployeeStatus x = employeeService.updateEmployee(updatedEmployee);
		 System.out.println(x.getMessage());
		
		
		
		
		/*
		EmployeeStatus  employeeStatus = employeeService.updateEmployee(updatedEmployee);
		if(employeeStatus.getStatusCode() == 0)
			System.out.println("employee updated failed");
		else
			System.out.println("employee details updated");
*/
		
	}

}
