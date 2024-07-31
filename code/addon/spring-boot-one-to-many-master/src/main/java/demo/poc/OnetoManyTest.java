package demo.poc;

import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import demo.poc.dao.DeptRepository;
import demo.poc.dao.EmpRepository;
import demo.poc.model.Dept;
import demo.poc.model.Employee;

@SpringBootApplication
public class OnetoManyTest implements CommandLineRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(OnetoManyTest.class, args);
	}
	
	
	@Autowired
	private DeptRepository deptRepository;
	
	@Autowired
	private EmpRepository empRepository;
	
	

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		// saving the file
		
		Dept dept =new Dept(1,"ABC");
		
		/*
		deptRepository.save(dept);
		
		Employee e =new Employee(1, "A", dept);
		empRepository.save(e);
		
		Employee e1 =new Employee(2, "B", dept);
		empRepository.save(e1);
		*/
		
		
		/*
		//update dept.
		dept =new Dept(1,"Def");
		Optional<Dept> x = deptRepository.findById(dept.getDeptid());
		if( x.isPresent())
		{
			deptRepository.save(dept);
		}
		*/
		
		/*
		getting all employees with their deptname
		List<Employee> employees = empRepository.findAll();
		
		System.out.println(employees.get(0).getEmpno() + "  " +  employees.get(0).getDept().getDeptName());
		
		*/
		
		int deptid =1;
		deptRepository.deleteById(deptid);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
