package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> { // persist(), merge(), find(), remove() --> 1 row operation
										// createQuery() --> for multi row operations

	//createQuery()-->for multi row operations
	@Query("select e from Employee e where e.empDesg=?1")
	public abstract List<Employee> getEmployeeByDesg(String empDesg);
	@Query("select e from Employee e where e.empSal between ?1 and ?2")
	public abstract List<Employee> getEmployeesBetweenSal(int initialSal, int finalSal);

}

//Repository
//CrudRepository
//JpaRepository