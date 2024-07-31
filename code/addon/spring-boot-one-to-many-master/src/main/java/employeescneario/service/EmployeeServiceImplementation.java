package employeescneario.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import employeescneario.EmployeeRepository;
import employeescneario.model.Employee;
import employeescneario.model.EmployeeStatus;

@Service
public class EmployeeServiceImplementation implements EmployeeService {

	@Autowired
	private EmployeeRepository empRepository;
	
	@Override
	public EmployeeStatus updateEmployee(Employee updatedEmployee) {
		// TODO Auto-generated method stub
		EmployeeStatus employeeStatus =new EmployeeStatus(0,"not updated",new Employee());
		if(empRepository.existsById(updatedEmployee.getEmployeeNumber()))
		{
			empRepository.save(updatedEmployee);
			employeeStatus.setMessage("updated");
			employeeStatus.setStatusCode(1);
			employeeStatus.setEmployee(updatedEmployee);
	}	
	
		
	
		return employeeStatus;
	}

}
