package employeescneario;

import org.springframework.data.jpa.repository.JpaRepository;

import employeescneario.model.Employee;



public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
