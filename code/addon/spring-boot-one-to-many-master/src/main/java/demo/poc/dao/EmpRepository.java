package demo.poc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.poc.model.Employee;

public interface EmpRepository extends JpaRepository<Employee, Integer> {

}
