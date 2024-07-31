package employeescneario.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="employeetable")
@Entity
public class Employee {
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int employeeNumber, String location, String name, int deptid) {
		super();
		this.employeeNumber = employeeNumber;
		this.location = location;
		this.name = name;
		this.deptid = deptid;
	}
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	
	@Id
	private int employeeNumber;
	private String location;
	private String name;
	private int deptid;
	
	

}
