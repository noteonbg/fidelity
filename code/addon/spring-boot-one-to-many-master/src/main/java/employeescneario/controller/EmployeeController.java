package employeescneario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import employeescneario.model.Employee;
import employeescneario.model.EmployeeStatus;
import employeescneario.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService=null;
	
	
	public Employee freaky()
	{
		return new Employee();
	}
	
	
	@PutMapping("/updatedEmployee")
	public ResponseEntity<EmployeeStatus> updateEmployee(@RequestBody Employee updatedEmployee)
	{
		ResponseEntity<EmployeeStatus> responseEntity =new ResponseEntity<>(HttpStatus.NOT_FOUND);
		EmployeeStatus employeeStatus =employeeService.updateEmployee(updatedEmployee);
		if(employeeStatus.getStatusCode() != 0)
		{
			responseEntity =new ResponseEntity<>(employeeStatus,HttpStatus.OK);
			
		}
		return responseEntity;
	}

}
