package net.javaguides.ems_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.ems_backend.entity.Employee;
@Repository
public interface employeeRepository extends JpaRepository<Employee, Long> {
	
}
