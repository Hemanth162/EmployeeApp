package in.shannu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.shannu.entity.Employee;
import in.shannu.repo.EmployeeRepo;
import in.shannu.service.IEmployeeSrevice;

@Service
public class EmployeeServiceImpl implements IEmployeeSrevice {
	

	
	@Autowired
	private EmployeeRepo repo;
	
	public Integer saveEmployee(Employee emp) {
		return repo.save(emp).getEmpId();
	}


	@Override
	public List<Employee> getAllEmployee() {
		return repo.findAll();
	}


	@Override
	public Employee getOneEmployee(Integer id) {
		return repo.findById(id).get();
	}


	@Override
	public void updateEmployee(Employee emp) {
		repo.save(emp);
	}
	
	public void deleteEmployee(Integer id) {
		repo.deleteById(id); }








}
