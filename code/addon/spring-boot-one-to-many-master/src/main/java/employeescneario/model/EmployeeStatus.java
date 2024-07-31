package employeescneario.model;

public class EmployeeStatus {
	
	private int statusCode;
	private String message;
	private Employee employee;
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public EmployeeStatus(int statusCode, String message, Employee employee) {
		super();
		this.statusCode = statusCode;
		this.message = message;
		this.employee = employee;
	}
	public EmployeeStatus() {
		// TODO Auto-generated constructor stub
	}
	

}
