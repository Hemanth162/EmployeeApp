package in.shannu.service;

import java.util.List;

import in.shannu.entity.Employee;

public interface IEmployeeSrevice {
	
	Integer saveEmployee(Employee emp);
	
	List<Employee> getAllEmployee();
	
	Employee getOneEmployee(Integer id);
	
//	void deleteEmployee(Integer id);
	
	void updateEmployee(Employee employee);

	void deleteEmployee(Integer id);

	
	

}
