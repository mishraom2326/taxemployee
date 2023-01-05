package com.taxcalc.employee.repo;

import com.taxcalc.employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepo extends JpaRepository<Employee,Integer> {

}
