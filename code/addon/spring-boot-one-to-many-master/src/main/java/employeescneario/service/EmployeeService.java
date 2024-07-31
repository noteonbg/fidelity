package employeescneario.service;

import employeescneario.model.Employee;
import employeescneario.model.EmployeeStatus;

public interface EmployeeService {

	EmployeeStatus updateEmployee(Employee updatedEmployee);

}
