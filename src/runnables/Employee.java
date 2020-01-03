package runnables;

public class Employee {

	private int empId;
	private String empName;
	private float salary;
	
	public Employee() {
		
	}
	
	public Employee(int empId, String empName, float salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	
	public int getEmpId() {
		return empId;
	}




	public void setEmpId(int empId) {
		this.empId = empId;
	}




	public String getEmpName() {
		return empName;
	}




	public void setEmpName(String empName) {
		this.empName = empName;
	}




	public float getSalary() {
		return salary;
	}




	public void setSalary(float salary) {
		this.salary = salary;
	}




	public static void main(String[] args) {
		
EmployeeAdder empAdd = new EmployeeAdder();
Employee  emp = new Employee(101,"Ramesh",50000);
	try {
		empAdd.addEmployee(emp);
	}
	catch(RuntimeException e) {
		System.out.println("Error: " + e.getMessage());
	}
	
	}


	

}
