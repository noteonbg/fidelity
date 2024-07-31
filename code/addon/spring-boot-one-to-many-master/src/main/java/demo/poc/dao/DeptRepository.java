package demo.poc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.poc.model.Dept;


public interface DeptRepository extends JpaRepository<Dept, Integer> {

}
