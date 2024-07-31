package demo.poc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Dept {

	@Id
 private int deptid;
 private String deptName;
 
 
public int getDeptid() {
	return deptid;
}
public void setDeptid(int deptid) {
	this.deptid = deptid;
}
public String getDeptName() {
	return deptName;
}
public void setDeptName(String deptName) {
	this.deptName = deptName;
}
public Dept(int deptid, String deptName) {
	super();
	this.deptid = deptid;
	this.deptName = deptName;
}
public Dept() {
	super();
	// TODO Auto-generated constructor stub
}

 

}
