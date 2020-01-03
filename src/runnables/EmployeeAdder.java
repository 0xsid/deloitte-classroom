package runnables;

public class EmployeeAdder {
public void addEmployee(Employee emp)  {
	if(emp.getEmpId()<10000||emp.getEmpId()>99999)
		throw new InvalidEmployeeIdException("Employee Id entered is Invalid");

     if(emp.getSalary()<30000||emp.getSalary()>80000)
    	 throw new InvalidEmployeeSalaryException("Salary value invalid");
     
     if(emp.getEmpName().length()<3)
    	 throw new InvalidEmployeeNameException("Name entered is less than 3 characters");


}
}
