package in.shannu.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import in.shannu.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{


}
