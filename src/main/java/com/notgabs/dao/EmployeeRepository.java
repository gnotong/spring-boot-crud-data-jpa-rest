package com.notgabs.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.notgabs.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
